package AprilChallenge.week2;

public class _11_DiameterOfBinaryTree {
    static int result;

    /*
        Time Complexity : O(N) Where N is the number of nodes in the tree
        Space Complexity : O(N) [Considering internal stack space]
    */
    public static int diameterOfBinaryTree(TreeNode root) {
        result = 0;
        height(root);
        return result;
    }

    static int height(TreeNode root) { 
        if (root == null)  return 0;
        
        int lheight = height(root.left);
        int rheight = height(root.right);
        result = Math.max(result, lheight + rheight);
        
        return 1 + Math.max(lheight, rheight); 
    } 

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameterOfBinaryTree(root));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}