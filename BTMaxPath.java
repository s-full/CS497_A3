public class BTMaxPath {
    int maxSum = Integer.MIN_VALUE;

    public int maxPath(TreeNode root) {
        maxHelper(root);
        return maxSum;
    }

    private int maxHelper(TreeNode root) {
        // empty, recursive base case
        if (root == null) {return 0;};

        // if sub sums are negative, discard them, would only lower maxSum
        int leftSubSum = Math.max(maxHelper(root.left),0);
        int rightSubSum = Math.max(maxHelper(root.right),0);

        maxSum = Math.max(maxSum, root.value+leftSubSum+rightSubSum);
        return root.value + Math.max(leftSubSum, rightSubSum);
    }
}
