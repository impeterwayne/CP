/*
*
* @author peter
* @date Apr 6, 2022
*/
package CreateFirstTree;

public class Main {

	public static void main(String[] args) {
		TreeNode drinks =  new TreeNode("Drinks");
		TreeNode hot =  new TreeNode("Hot");
		TreeNode cold =  new TreeNode("Cold");
		TreeNode coffee =  new TreeNode("Coffee");
		TreeNode tea =  new TreeNode("Tea");
		TreeNode wine =  new TreeNode("Wine");
		TreeNode beer =  new TreeNode("Beer");
		hot.addChild(coffee);
		hot.addChild(tea);
		cold.addChild(wine);
		cold.addChild(beer);
		drinks.addChild(hot);
		drinks.addChild(cold);
		System.out.println(drinks.print(0));
		

	}

}
