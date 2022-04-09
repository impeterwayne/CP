/*
*
* @author peter
* @date Apr 9, 2022
*/
package BinaryTreeArray;

public class Main {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree(9);
		binaryTree.insert("N1");
		binaryTree.insert("N2");
		binaryTree.insert("N3");
		binaryTree.insert("N4");
		binaryTree.insert("N5");
		binaryTree.insert("N6");
		binaryTree.insert("N7");
		binaryTree.insert("N8");
		binaryTree.insert("N9");
		binaryTree.preOrderTraversal(1);
		System.out.println();
		binaryTree.inOrderTraversal(1);
		System.out.println();
		binaryTree.postOrderTraversal(1);
		System.out.println();
		binaryTree.levelOrderTraversal();
		System.out.println();
		binaryTree.search("N5");
		binaryTree.delete("N5");
		binaryTree.levelOrderTraversal();
	}

}
