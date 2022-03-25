package queue;

public class Queue<T> {

	private final T[] queue;
	private int first;
	private int last;

	public Queue() {

		queue = (T[]) new Object[100];
		first = 0;
		last = 0;

	}

	public void enqueue(T o) {
		queue[last] = o;
		last++;
	}

	public T dequeue() {

		if (size() <= 0){
			return null;
		}
		T o = queue[first];
		first++;
		return o;
	}

	public int size() {
		return last - first;
	}

	public boolean isEmpty(){
		return size()==0;
	}
}
