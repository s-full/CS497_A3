public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){value =x;}

    void printTreeInOrder(TreeNode root) {
        if (root == null)
            return;
 
        /* first recur on left child */
        printTreeInOrder(root.left);
 
        /* then print the data of node */
        System.out.print(root.value + " ");
 
        /* now recur on right child */
        printTreeInOrder(root.right);
    }
}