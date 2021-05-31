
/*https://leetcode.com/problems/find-bottom-left-tree-value/
*/

public class BottomLeftTreeValue {
	
	int depth = 0, leftValue = -9999;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = null;
		if(root.left != null) {
			processTree(root.left, depth+1, true);
		}
		if(root.right != null) {
			processTree(root.right, depth+1, false);
		}
        System.out.println((leftValue == -9999) ? root.val : leftValue);
	}
	
	public void processTree(TreeNode node, int depth, boolean isLeft) {
        if(depth != this.depth && isLeft == true) {
			this.depth = depth;
			this.leftValue = node.val;
		}
		if(node.left != null) {
			processTree(node.left, depth+1, true);
		}
		if(node.right != null) {
			processTree(node.right, depth+1, false);
		}
	}

}
