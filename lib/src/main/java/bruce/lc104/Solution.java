package bruce.lc104;

public class Solution {
    static int res;
    static int depth;
    public static int maxDepth(TreeNode root) {
        res = depth = 0;
        traverse(root);
        return res;
    }

    static void traverse(TreeNode node){
        if(node == null) return;

        depth ++;
        res = Math.max(depth,res);
        traverse(node.left);
        traverse(node.right);
        depth --;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(6);

        int maxlen = maxDepth(root);
        System.out.println(maxlen);
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
