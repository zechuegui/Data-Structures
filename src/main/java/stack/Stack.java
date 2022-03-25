package stack;

import java.util.Arrays;

public class Stack<E> {

	private E[] array;
	private int pos;

	public Stack(int n) {

		array = (E[]) new Object[n];

		pos = 0;

	}


	public E pop() {

		if (pos < 0) {
			return null;
		}
		E toReturn = array[pos - 1];
		pos--;

		return toReturn;
	}


	public void push(E o) {
		array[pos] = o;
		pos++;
	}


	public int size() {
		return pos;

	}

	public E top() {
		if (!isEmpty()){

			return array[pos - 1];
		}
		return null;
	}

	public boolean isEmpty() {
		return pos == 0;
	}

	@Override
	public String toString() {
		return "Stack{" + "array=" + Arrays.toString(array) + ", pos=" + pos + '}';
	}
}