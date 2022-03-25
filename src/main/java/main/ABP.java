package main;

public class ABP<T> {

	private BNode<T> root;

	public ABP(BNode<T> root) {
		this.root = root;

	}

	public BNode<T> getRoot() {
		return root;
	}

	public void setRoot(BNode<T> root) {
		this.root = root;
	}


	public void printDFS() {
		printDFS(this.root);
	}

	// Can either have the print before, after or in the middle (pre, in, post (order))
	private void printDFS(BNode<T> node) {
		if (node != null) {

			printDFS(node.getLeft());
			printDFS(node.getRight());
			System.out.println(node.getValue());
		}
	}

	public void printBFS() {
		printBFS(root);
	}

	private void printBFS(BNode<T> node) {
		Queue<BNode<T>> queue = new Queue<>();

		queue.enqueue(node);

		while (!queue.isEmpty()) {

			BNode<T> current_node = queue.dequeue();

			System.out.println(current_node.getValue());

			if(node.getLeft() != null){
				queue.enqueue(node.getLeft());
			}

			if(node.getRight() != null){
				queue.enqueue(node.getRight());
			}

		}


	}

	public int getHeight() {
		return getHeight(root);
	}

	private int getHeight(BNode<T> node) {

		if (node == null) {

			return -1;

		}

		return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;

	}

	private boolean isLeaf(BNode<T> node) {

		return (node.getLeft() == null && node.getRight() == null);
	}
}
