/**
 * This is a tester program for the BinaryTree class
 * @author Michael Ida
 *
 */
public class BinaryTreeTester {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		int[] inputData = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
		
		for (int elem : inputData) {
			tree.insert(elem);
		}
		
		System.out.println("In-Order Traversal");
		tree.inOrder();
		System.out.println("\n\n");
		// should be: -150, -5, 0, 12, 15, 20, 20, 25, 100, 126, 200, 1000
		
		System.out.println("Pre-Order Traversal");
		tree.preOrder();
		System.out.println("\n\n");
		// should be: 20, 15, -5, -150, 0, 12, 200, 25, 20, 100, 126, 1000
		
		System.out.println("Post-Order Traversal");
		tree.postOrder();
		System.out.println("\n\n");
		// should be: -150, 12, 0, -5, 15, 20, 126, 100, 25, 1000, 200, 20
		
		System.out.println("Size: " + tree.size());
		// should be: 12
		
		System.out.println("Maximum Depth: " + tree.maxDepth());
		//should be: 5
		
		BinaryTree tree1 = new BinaryTree();
		int[] inputData1 = {4, 1, 8, 5, 5, 5, 36, 54, -22, 5, -9};
		
		for (int elem : inputData1) {
			tree1.insert(elem);
		}
		
		System.out.println("");
		System.out.println("Max Value: " + tree1.maxRecord());
		System.out.println("");
		//should be 54
		
		System.out.println("Min Value: " + tree1.minRecord());
		System.out.println("");
		//should be -22
		
		System.out.println("Number of 5s: " + tree1.countMatches(5));
		System.out.println("");
		//should be 4
		
		System.out.println("In Order Transversal");
			tree1.inOrder();
			System.out.println((""));
			//should be -22 -9 1 4 5 5 5 5 8 36 54 
		
		
		System.out.println("");
		System.out.println("Pre-order Transversal ");
		tree1.preOrder();
		System.out.println("");
		//should be 4 1 -22 -9 8 5 5 5 5 36 54
		
		System.out.println("");
		System.out.println("Post Order Transversal");
		tree1.postOrder();
		System.out.println("");
		//should be -9 -22 1 5 5 5 5 54 36 8 4
		
		System.out.println("");
		System.out.println("Max Depth: " + tree1.maxDepth());
		//should be 6
		
		System.out.println("");
		System.out.println("Min Depth: " + tree1.minDepth());
		//should be 6
		
		tree1.removeNode(4);
		System.out.println("");
		System.out.println("The number 4 has been removed");
		System.out.println("");
		
		System.out.println("In-Order Transversal (after change)");
		tree1.inOrder();
		//should be -22 -9 1 54 5 5 5 5 8 36 54
		System.out.println("");
		
		
		System.out.println("");
		System.out.println("Pre-Order Transversal (after change)");
		tree1.preOrder();
		System.out.println("");
		//should be 54 1 -22 -9 8 5 5 5 5 36 54
		
		System.out.println("");
		System.out.println("Post-Order Transversal (after change)");
		tree1.postOrder();
		//should be -9 -22 1 5 5 5 5 54 36 8 54 
	}

}
