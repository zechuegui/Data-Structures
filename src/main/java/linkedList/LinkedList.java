package linkedList;

public class LinkedList<T> {

	private Node<T> dummy;
	private int size;

	public LinkedList() {
		dummy = new Node<>();
		size = 0;
	}

	/**
	 * Appends to the end of the Linkedlist
	 * @param e
	 */
	public void add(T e) {

		add(size, e);
	}

	/**
	 * Adds the Object e to the position i
	 * @param i
	 * @param e
	 */
	public void add(int i, T e) {

		if (i > size) {
			return;
		}

		Node<T> current = dummy;

		for (int x = -1; x < i - 1; x++) {
			current = current.getNext();
		}

		Node<T> newNode = new Node<>(e, current.getNext());
		current.setNext(newNode);
		size++;

	}

	/**
	 *  Removes the Node in the position i
	 * @param i
	 */
	public void remove(int i) {

		if(i>=size) {
			return;
		}

		Node<T> current = dummy;

		for(int x =-1; x< i-1; x++){
			current = current.getNext();
		}

		current.setNext(current.getNext().getNext());
		size--;

	}

	/**
	 * Removes the first instance of the object in the LinkedList
	 * @param e
	 */
	public void remove(T e){

		Node<T> current = dummy;

		while (current.getNext() != null){

			if (current.getNext().getValue() == e){
				current.setNext(current.getNext().getNext());
				return;
			}

			current = current.getNext();

		}

	}

	@Override
	public String toString() {

		String toReturn = "";

		Node<T> current = dummy.getNext();

		while (current != null) {

			toReturn += current.getValue().toString() + " --> ";
			current = current.getNext();

		}

		return toReturn;
	}
}
