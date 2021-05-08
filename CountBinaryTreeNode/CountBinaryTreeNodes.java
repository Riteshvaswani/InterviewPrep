import java.util.Stack;

public class CountBinaryTreeNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode left = new TreeNode(4);
		TreeNode right = new TreeNode(6);
		TreeNode root = new TreeNode(5, left, right);
		if(root == null)
			System.out.println("0");;
		Stack<TreeNode> bfs = new Stack<TreeNode>();
		bfs.push(root);
		System.out.println(iterate(bfs));
	}
	
	public static int iterate(Stack<TreeNode> bfs) {
		if(bfs.empty())
			return 0;
		TreeNode temp = bfs.pop();
		if(temp.right != null)
			bfs.push(temp.right);
		if(temp.left != null)
			bfs.push(temp.left);
		return 1+iterate(bfs);
	}

}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }