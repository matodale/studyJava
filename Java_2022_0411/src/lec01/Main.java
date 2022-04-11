package lec01;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40, 1);
		numbers.remove(0);
		for (int i = 0; i < numbers.size(); i++) {
			@SuppressWarnings("unused")
			int num = numbers.get(i);
			System.out.printf("%d : %d\n", i, numbers.get(i));
		}
	}
}

class ArrayList<T> {
	Object[] array;
	int size;

	ArrayList() {
		size = 0;
		array = new Object[3];
	}

	boolean isFull() {
		return array.length == size;
	}

	void sizeUp() {
		Object[] newArray = new Object[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}

	void add(int data) {
		if (isFull()) {
			sizeUp();
		}
		array[size] = data;
		size++;
	}

	int getLastIndex() {
		return size - 1;
	}

	void add(Object data, int index) {
		if (isFull()) {
			sizeUp();
		}
		int lastIndex = getLastIndex();
		for (int i = lastIndex; i >= index; i--) {
			array[i + 1] = array[i];
		}
		array[index] = data;
		size++;
	}

	void remove(int index) {
		for (int i = index + 1; i < size; i++) {
			array[i - 1] = array[i];
		}
		size--;
	}

	@SuppressWarnings("unchecked")
	T get(int index) {
		return (T) array[index];
	}

	int size() {
		return size;
	}
}