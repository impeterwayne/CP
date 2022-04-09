/*
*
* @author peter
* @date Apr 9, 2022
*/
package BinaryTreeArray;

public class BinaryTree {
	String[] arr;
	int lastUsedIndex;
	public BinaryTree(int size) {
		arr = new String[size+1];
		this.lastUsedIndex=0;
		System.out.println("Tree of size " + size + " has been created!");
	}
	
	public boolean isFull()
	{
		if(arr.length-1 == lastUsedIndex)
		{
			return true;
		}
		return false;
	}
	public void insert(String value)
	{
		if(!isFull()) {
			arr[lastUsedIndex+1] = value;
			lastUsedIndex++;
			System.out.println("The value of " + value + " has been inserted.");
		}else {
			System.out.println("The BT is full!");
		}
	}
	public void preOrderTraversal(int index)
	{
		if(index>lastUsedIndex)
		{
			return;
		}
		System.out.print(arr[index] + " ");
		preOrderTraversal(index*2);
		preOrderTraversal(index*2+1);
	}
	public void inOrderTraversal(int index) {
		if(index>lastUsedIndex)
		{
			return;
		}
		inOrderTraversal(index*2);
		System.out.print(arr[index] + " ");
		inOrderTraversal(index*2+1);
	}
	public void postOrderTraversal(int index)
	{
		if(index>lastUsedIndex)
		{
			return;
		}
		postOrderTraversal(index*2);
		postOrderTraversal(index*2+1);
		System.out.print(arr[index] + " ");
	}
	public void levelOrderTraversal()
	{
		for(int i = 1; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public int search(String value) {
		for(int i = 1 ; i<= lastUsedIndex; i++) {
			if(arr[i].equals(value)) {
				System.out.println("Found " + value +" at index " + i);
				return i;
			}
		}
		System.out.println("The value does not exist");
		return -1;
	}
	public void delete(String value) {
		int location = search(value);
		if(location == -1)
		{
			return;
		}
		arr[location] = arr[lastUsedIndex];
		lastUsedIndex--;
		System.out.println("The node successfully deleted! ");
	}
}
