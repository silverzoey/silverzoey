package chess4.copy;

/**
 * 
 * ���Ͳ�����Java�е��������ͣ���ֻ��һ�����ţ��������㶨�����ʱ��ȷ��Ҫ �洢����������ʱ������ʹ����������������������͡�
 * ����Ҫָ��ֻ�洢ĳһ�����͵�ʱ��Ϳ���ָ���������ͣ������Ҫ�洢�κ����;Ͳ�ָ�� �������͡�
 * �����Ƿ�ָJAVA�������һ���������ͣ����͵ķ����У�E��K��V��...
 */
public class MyArrayList<E> { // ����MyArrayList֧�ַ���
	private Object[] array = new Object[0]; // ���峤��Ϊ0��object�������
	private int size; // ��������������¼��������еĴ����Ԫ�ظ���

	// ��������������Ԫ�صķ���
	public void add(E e) {
		Object[] newarray = new Object[array.length + 1]; // ����һ�������飬����ĳ���Ϊarray����ĳ���+1

		for (int i = 0; i < array.length; i++) { // ѭ������array���飬��array�����ݴ��浽�µ�newarray������
			newarray[i] = array[i];
		}

		array = newarray; // newarray�����ݸ�ֵ��array��array���鳤��+1
		array[array.length - 1] = e; // ����Ԫ�ظ�ֵ����������һ��λ��
		size++; // ��¼Ԫ�صĸ�����1
	}

	// �����������ָ��λ�����Ԫ��
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

	// �����������ɾ��Ԫ�أ��������ɾ����Ԫ��
	public E remove(int index) {
		if (index < 0 || index >= size)
			return null;

		Object[] newarray = new Object[array.length - 1]; // ����һ�������飬����Ϊarray����ĳ���-1
		Object o = array[index]; // oΪҪɾ����Ԫ��

		for (int i = 0, j = 0; i < array.length; i++) { // ѭ����������array����array�е����ݴ洢��newarray������
			if (i != index) {
				newarray[j] = array[i];
				j++;
			}
		}

		array = newarray; // newarray�е����ݸ���array��array����ĳ���-1
		size--; // ��¼Ԫ�ظ���-1
		return (E) o;
	}

	// �滻���������ĳ��λ�õ�Ԫ��
	public boolean update(int index, E e) {
		if (index < 0 || index >= size)
			return false;

		array[index] = e;

		return true;
	}

	// �滻���������ĳ����ֵ������Ԫ��
	public boolean updateAll(E e, E newE) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == e) {
				array[i] = newE;
			}
		}
		return true;
	}

	// ����ָ��������ȡ��Ӧλ�õ�����
	public E get(int index) {
		if (index < 0 || index >= size)
			return null;
		return (E) array[index];
	}

	// ��ָ��Ԫ������������е����һ��λ��
	public int last(E e) {
		int last = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == e) {
				last = i;
			}
		}
		return last;
	}

	// ��ָ��Ԫ������������еĵ�һ��λ��
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

	// ��ȡ��������д����Ԫ�ظ���
	public int size() {

		return size;
	}

}
