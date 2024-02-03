package classes;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private Node root;

	public void insert(int value) {
		root = addRecursive(root, value);
	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}

	public void deleteNode(int value) {
		deleteNodeRecursive(root, value);
	}

	public void deleteNodeRecursive(Node current, int value) {
		if (current == null) {
			return;
		}

		if (current.value < value) {
			deleteNodeRecursive(current.right, value);
		} else {
			deleteNodeRecursive(current.left, value);
		}
	}

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (current.value < value) {
			current.right = addRecursive(current.right, value);
		} else {
			current.left = addRecursive(current.left, value);
		}
		return current;
	}

	public void preOrder(Node current) {
		if (current != null) {
			System.out.println(current.value);
			preOrder(current.left);
			preOrder(current.right);
		}
	}

	public void inOrder(Node current) {
		if (current != null) {
			inOrder(current.left);
			System.out.println(current.value);
			inOrder(current.right);
		}
	}

	public void postOrder(Node current) {
		if (current != null) {
			postOrder(current.left);
			postOrder(current.right);
			System.out.println(current.value);
		}
	}

	public Node getRoot() {
		return this.root;
	}

	public boolean containsNodeRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}

		if (current.value == value) {
			return true;
		}

		if (value < current.value) {
			return containsNodeRecursive(current.left, value);

		} else {
			return containsNodeRecursive(current.right, value);
		}
	}

	public int findLargest(Node current) {
		if (current == null) {
			return Integer.MIN_VALUE;
		}

		while (current.right != null) {
			current = current.right;
		}

		return current.value;
	}

	public void traverseLevelOrder() {
		if (root == null) {
			return;
		}

		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);

		while (!nodes.isEmpty()) {
			Node node = nodes.remove();

			System.out.print(" " + node.value);

			if (node.left != null) {
				nodes.add(node.left);
			}

			if (node.right != null) {
				nodes.add(node.right);
			}
		}
		return;
	}
}
