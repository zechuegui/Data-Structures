package main;

public class Main {
	public static void main(String[] args) {
//		Stack<String> s = new Stack<>(100);
//
//		s.push("a");
//		s.push("b");
//		s.push("c");
//		s.push("d");
//
//		System.out.println(s);
//		s.pop();
//
//		System.out.println(s);
//
//		s.pop();
//		System.out.println(s);


		ABP<Integer> abp = new ABP<>(new BNode<Integer>(1, new BNode<Integer>(0, null, null),
		                                                new BNode<Integer>(3, new BNode<>(2, null, null), null)));


//		abp.printDFS();

		abp.printBFS();
		System.out.println("height = " + abp.getHeight());
	}
}
