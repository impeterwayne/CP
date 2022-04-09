/*
*
* @author peter
* @date Apr 6, 2022
*/
package BinaryTreeLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
	BinaryNode root;

	public BinaryTreeLL() {
		this.root = null;
	}

	// root --> left --> right
	public void preOder(BinaryNode node) {
		if (node == null)
			return;
		System.out.print(node.value + " ");
		preOder(node.left);
		preOder(node.right);
	}

	// left --> root --> right
	public void inOrder(BinaryNode node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
	}

	// left --> right --> root
	public void postOrder(BinaryNode node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");
	}

	// level traversal
	public void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			System.out.print(currentNode.value + " ");
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
	}

	public void levelOrderSearch(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			if (currentNode.value.equals(value)) {
				System.out.println("Value " + value + " is found in tree!");
				return;
			}
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
		System.out.println("Value " + value + " is not found in tree!");
	}
	public boolean preOderSearch(BinaryNode node ,String value) {
		if(node == null) return false;
		if(node.value.equals(value))
		{
			return true;
		}
		if(preOderSearch(node.left,value)||preOderSearch(node.right,value)) return true;
		return false;
	}
	public void insert(String value) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = value;
		if(root==null)
		{
			root = newNode;
			System.out.println("Inserted new node at root.");
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			if(currentNode.left==null) {
				currentNode.left = newNode;
				System.out.println("Inserted");
				break;
			}
			else if(currentNode.right==null) {
				currentNode.right = newNode;
				System.out.println("Inserted");
				break;
			}else
			{
				queue.add(currentNode.left);
				queue.add(currentNode.right);
			}
		}
	}
	public void deleteNode(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			if(currentNode.value.equals(value))
			{
				currentNode.value = getDeepestNode().value; 
				deleteDeepestNode();
				System.out.println("Node deleted");
				return;
			}else 
			{
				if(currentNode.left!=null) queue.add(currentNode.left);
				if(currentNode.right!=null) queue.add(currentNode.right);
			}
		}
		System.out.println("The node not exist!");
	}
	public BinaryNode getDeepestNode()
	{
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode currentNode =null;
		while(!queue.isEmpty())
		{
			currentNode = queue.remove();
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
		return currentNode;
	}
	public void deleteDeepestNode()
	{
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode previousNode, currentNode =null;
		while(!queue.isEmpty())
		{
			previousNode = currentNode;
			currentNode = queue.remove();
			if(currentNode.left==null)
			{
				previousNode.right = null;
				return ;
			}else if(currentNode.right==null)
			{
				currentNode.left = null;
				return ;
			}
			queue.add(currentNode.left);
			queue.add(currentNode.right);
		}
	}
	public void deleteBinaryTree()
	{
		root = null;
	}
}
