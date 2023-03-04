import java.util.LinkedList;
import java.util.List;

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
        printPreTree(root1);

        BTFromPOIO s2 = new BTFromPOIO();
        int preArr1[] = new int[] {3,9,20,15,7};
        int inArr1[] = new int[] {9,3,15,20,7};
        TreeNode root2 = s2.makeTree(preArr1,inArr1);

        printPreTree(root2);
        System.out.println();

        BTMaxPath s3 = new BTMaxPath();
        TreeNode root3 = new TreeNode(-10);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(15);
        TreeNode n4 = new TreeNode(7);
        root3.left = n1;
        n1.left = n1.right = null;
        root3.right = n2;
        n2.left = n3;
        n2.right =n4;
        System.out.println(s3.maxPath(root3));

        largestValInLevel s4 = new largestValInLevel();
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(3);
        root4.right = new TreeNode(2);
        root4.left.left = new TreeNode(5);
        root4.left.right = new TreeNode(3);

        root4.right.left = null;
        root4.right.right = new TreeNode(9);
        List<Integer> list = s4.largestValues(root4);



        balanceBST s5 = new balanceBST();
        TreeNode root5 = new TreeNode(2);
        root5.left = new TreeNode(1);
        root5.right = new TreeNode(3);

        TreeNode balanceRoot = s5.balance(root5);
        printInTree(balanceRoot);

    }
    private static void printPreTree(TreeNode root) {
        if (root == null) {
            //System.out.print("null ");
            return;
        }
        System.out.print(root.value + " ");
        printPreTree(root.left);
        printPreTree(root.right);
    }

    private static void printInTree(TreeNode root) {
        if (root == null) {
            //System.out.print("null ");
            return;
        }
        System.out.print(root.value + " ");
        printInTree(root.left);
        printInTree(root.right);
    }
}
