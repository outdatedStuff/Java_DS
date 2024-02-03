import classes.BinaryTree;

public class Main {
	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.insert(5);
		binaryTree.insert(3);
		binaryTree.insert(6);
		binaryTree.insert(1);

		System.out.println(binaryTree.containsNode(3));
		System.out.println(binaryTree.containsNode(4));
		binaryTree.preOrder(binaryTree.getRoot());

		System.out.println(binaryTree.findLargest(binaryTree.getRoot()));
		binaryTree.traverseLevelOrder();
		binaryTree.inOrder(binaryTree.getRoot());
	}
}
