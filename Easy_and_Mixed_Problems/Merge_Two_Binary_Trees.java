package Easy_and_Mixed_Problems;

public class Merge_Two_Binary_Trees {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }

        TreeNode res = new TreeNode(root1.val + root2.val);
        res.left = mergeTrees(root1.left, root2.left);
        res.right = mergeTrees(root1.right, root2.right);

        return res;
    }
}
