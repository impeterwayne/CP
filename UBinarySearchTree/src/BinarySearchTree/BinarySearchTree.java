/*
*
* @author peter
* @date Apr 9, 2022
*/
package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	public BinaryNode root;
	public BinarySearchTree() 
	{
		this.root = null;  
	}
	public BinaryNode insert(BinaryNode currentNode, int value) 
	{
		if(root == null)
		{
			root = new BinaryNode();
			root.value = value;
			System.out.println("Inserted successfully");
			return root;
		}
		if(currentNode == null)
		{
			BinaryNode newNode = new BinaryNode();
			newNode.value = value;
			System.out.println("Inserted successfully");
			return newNode;
		}
		else if(value<=currentNode.value)
		{
			currentNode.left = insert(currentNode.left, value);
			return currentNode;
		}else 
		{
			currentNode.right = insert(currentNode.right, value);
			return currentNode;
		}
	}
	public void insert(int value) 
	{
		insert(root, value);
	}
	public void preOrderTraversal(BinaryNode node) 
	{
		if(node==null) return;
		System.out.print(node.value + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	public void inOrderTraversal(BinaryNode node) 
	{
		if(node==null) return;
		preOrderTraversal(node.left);
		System.out.print(node.value + " ");
		preOrderTraversal(node.right);
	}
	public void postOrderTraversal(BinaryNode node) 
	{
		if(node==null) return;
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
		System.out.print(node.value + " ");
	}
	public void levelOrderTraversal()
	{
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			BinaryNode currentNode = queue.remove();
			System.out.print(currentNode.value + " ");
			if(currentNode.left!=null) 
			{
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) 
			{
				queue.add(currentNode.right);
			}
		}
	}
	public BinaryNode search(BinaryNode node ,int value) {
		if(node ==null )
		{
			System.out.println("Value " + value + " not found!");
			return null;
		}else if(node.value == value)
		{
			System.out.println("Found successfully!");
			return node;
		}else if(value < node.value) {
			return search(node.left, value);
		}else return search(node.right, value);
	}
	public BinaryNode minimumNode(BinaryNode root) {
		if(root.left==null)
		{
			return root;
		}else 
		{
			return minimumNode(root.left);
		}
	}
	public BinaryNode deleteNode(BinaryNode root, int value) {
		if(root == null) 
		{
			System.out.println("Value not found");
			return null;
		}
		if(value < root.value)
		{
			root.left = deleteNode(root.left, value);
		}else if( value > root.value) {
			root.right = deleteNode(root.right, value);
		}
		else
		{
			// the node has two childen 
			if(root.left !=null && root.right !=null) {
				BinaryNode temp = root;  
				BinaryNode minNodeForRight = minimumNode(temp.right);
				root.value = minNodeForRight.value;
				root.right = deleteNode(root.right, minNodeForRight.value);
			}
			// the node has one child
			else if (root.left!=null) {
				root = root.left;
			}else if (root.right!=null) {
				root = root.right;
			}
			// the node is leaf
			else root = null;
		}
		return root;
	}
	public void deleteBinarySearchTree()
	{
		this.root = null;
	}
}
