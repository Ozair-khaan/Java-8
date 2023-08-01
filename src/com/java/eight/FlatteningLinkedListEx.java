package com.java.eight;

public class FlatteningLinkedListEx {

	Node head;

	class Node {
		int data;
		Node right, down;

		Node(int data) {
			this.data = data;
			right = null;
			down = null;
		}
	}

	Node merge(Node a, Node b) {

		if (a == null)
			return b;

		if (b == null)
			return a;

		Node result;

		if (a.data < b.data) {
			result = a;
			result.down = merge(a.down, b);
		} else {
			result = b;
			result.down = merge(a, b.down);
		}

		result.right = null;
		return result;
	}

	Node flatten(Node root) {
		if (root == null || root.right == null)
			return root;

		root.right = flatten(root.right);

		root = merge(root, root.right);

		return root;
	}

	Node push(Node head_ref, int data) {
		Node new_node = new Node(data);
		new_node = head_ref;
		head_ref = new_node;
		return head_ref;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.down;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		FlatteningLinkedListEx list = new FlatteningLinkedListEx();

		list.head = list.push(list.head, 30);
		list.head = list.push(list.head, 8);
		list.head = list.push(list.head, 7);
		list.head = list.push(list.head, 5);

		list.head.right = list.push(list.head.right, 20);
		list.head.right = list.push(list.head.right, 10);

		list.head.right.right = list.push(list.head.right.right, 50);
		list.head.right.right = list.push(list.head.right.right, 22);
		list.head.right.right = list.push(list.head.right.right, 19);

		list.head.right.right.right = list.push(list.head.right.right.right, 45);
		list.head.right.right.right = list.push(list.head.right.right.right, 40);
		list.head.right.right.right = list.push(list.head.right.right.right, 35);
		list.head.right.right.right = list.push(list.head.right.right.right, 20);

		list.head = list.flatten(list.head);
		list.printList();

	}

}
