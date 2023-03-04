import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(-10);
        list1.add(-3);
        list1.add(0);
        list1.add(5);
        list1.add(9);

        SLToBST s1 = new SLToBST();
        TreeNode root1 = s1.SLLToBST(list1);
        //printTree(root1);

        BTFromPOIO s2 = new BTFromPOIO();
        int preArr1[] = new int[] {3,9,20,15,7};
        int inArr1[] = new int[] {9,3,15,20,7};
        TreeNode root2 = s2.makeTree(preArr1,inArr1);

        printTree(root2);

        BTMaxPath s3 = new BTMaxPath();
        TreeNode root = new TreeNode(-10);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(15);
        TreeNode n4 = new TreeNode(7);

    }
    private static void printTree(TreeNode root) {
        if (root == null) {
            //System.out.print("null ");
            return;
        }
        System.out.print(root.value + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
