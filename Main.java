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
        TreeNode root = s1.SLLToBST(list1);
        root.printTreeInOrder(root);

    }
}
