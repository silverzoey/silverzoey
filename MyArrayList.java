package chess4.copy;

/**
 * 
 * 泛型并不是Java中的数据类型，它只是一个符号，用来在你定义类的时候不确定要 存储的数据类型时，可以使用这个符号来代替数据类型。
 * 当需要指定只存储某一种类型的时候就可以指定数据类型，如果想要存储任何类型就不指定 数据类型。
 * 泛型是泛指JAVA中任意的一种数据类型；泛型的符号有：E、K、V、...
 */
public class MyArrayList<E> { // 声明MyArrayList支持泛型
	private Object[] array = new Object[0]; // 定义长度为0的object数组对象
	private int size; // 定义属性用来记录数组队列中的储存的元素个数

	// 向数组队列中添加元素的方法
	public void add(E e) {
		Object[] newarray = new Object[array.length + 1]; // 定义一个新数组，数组的长度为array数组的长度+1

		for (int i = 0; i < array.length; i++) { // 循环遍历array数组，将array的数据储存到新的newarray数组中
			newarray[i] = array[i];
		}

		array = newarray; // newarray的数据赋值给array，array数组长度+1
		array[array.length - 1] = e; // 将新元素赋值给数组的最后一个位置
		size++; // 记录元素的个数加1
	}

	// 向数组队列中指定位置添加元素
	public boolean add(int index, E e) {
		if (index < 0 || index >= size)
			return false;

		Object[] newarray = new Object[array.length + 1];

		for (int i = 0, j = 0; i < newarray.length; i++) {
			if (i != index) {
				newarray[i] = array[j];
				j++;
			}
		}

		array = newarray;
		array[index] = e;
		size++;

		return true;
	}

	// 从数组队列中删除元素，并输出所删除的元素
	public E remove(int index) {
		if (index < 0 || index >= size)
			return null;

		Object[] newarray = new Object[array.length - 1]; // 定义一个新数组，长度为array数组的长度-1
		Object o = array[index]; // o为要删除的元素

		for (int i = 0, j = 0; i < array.length; i++) { // 循环遍历数组array，将array中的数据存储到newarray数组中
			if (i != index) {
				newarray[j] = array[i];
				j++;
			}
		}

		array = newarray; // newarray中的数据赋给array，array数组的长度-1
		size--; // 记录元素个数-1
		return (E) o;
	}

	// 替换数组队列中某个位置的元素
	public boolean update(int index, E e) {
		if (index < 0 || index >= size)
			return false;

		array[index] = e;

		return true;
	}

	// 替换数组队列中某个数值的所有元素
	public boolean updateAll(E e, E newE) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == e) {
				array[i] = newE;
			}
		}
		return true;
	}

	// 根据指定索引获取对应位置的数据
	public E get(int index) {
		if (index < 0 || index >= size)
			return null;
		return (E) array[index];
	}

	// 求指定元素在数组队列中的最后一个位置
	public int last(E e) {
		int last = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == e) {
				last = i;
			}
		}
		return last;
	}

	// 求指定元素在数组队列中的第一个位置
	public int first(E e) {
		int first = array.length;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == e) {
				first = i;
				break;
			}
		}
		return first;
	}

	// 获取数组队列中储存的元素个数
	public int size() {

		return size;
	}

}
