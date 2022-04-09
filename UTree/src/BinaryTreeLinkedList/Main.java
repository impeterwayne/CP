/*
*
* @author peter
* @date Apr 6, 2022
*/
package BinaryTreeLinkedList;

public class Main {

	public static void main(String[] args) {
		BinaryTreeLL binaryTree = new BinaryTreeLL();
		BinaryNode n1 = new BinaryNode();
		n1.value = "N1";
		BinaryNode n2 = new BinaryNode();
		n2.value = "N2";
		BinaryNode n3 = new BinaryNode();
		n3.value = "N3";
		BinaryNode n4 = new BinaryNode();
		n4.value = "N4";
		BinaryNode n5 = new BinaryNode();
		n5.value = "N5";
		BinaryNode n6 = new BinaryNode();
		n6.value = "N6";
		BinaryNode n7 = new BinaryNode();
		n7.value = "N7";
		BinaryNode n8 = new BinaryNode();
		n8.value = "N8";
		BinaryNode n9 = new BinaryNode();
		n9.value = "N9";
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n4.left = n8;
		n4.right = n9;
		binaryTree.root = n1;
		binaryTree.preOder(n1);
		System.out.println();
		binaryTree.inOrder(n1);
		System.out.println();
		binaryTree.postOrder(n1);
		System.out.println();
		binaryTree.levelOrder();
		System.out.println();
		binaryTree.levelOrderSearch("N100");
		if (binaryTree.preOderSearch(n1, "N9")) {
			System.out.println("Value " + "N9" + " is found in tree!");
		}
		else
		{
			System.out.println("Value " + "N9" + " is not found in tree!");
		}
		binaryTree.insert("N10");
		binaryTree.levelOrder();
		System.out.println("\nDeepestNode: " + binaryTree.getDeepestNode().value );
		binaryTree.deleteDeepestNode();
		binaryTree.levelOrder();
		
	}

}
