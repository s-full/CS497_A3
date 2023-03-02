import java.util.LinkedList;

public class  SLToBST{

    public  TreeNode SLLToBST(LinkedList<Integer> list) {
        // empty list case
        if (list.isEmpty()) {return null;}
        return SLToBSTHelper(list, 0 , list.size()-1);
    }
    private TreeNode SLToBSTHelper(LinkedList<Integer> list, int begin, int end) {

        // recursion base case
        if (begin > end) { return null;}

        // get middle point of LL
        int mid = (begin+end)/2;

        // make new node from middle point of LL
        TreeNode newNode = new TreeNode(list.get(mid));

        // recursively build tree splitting indices of list

        // left sub tree will be built from left half of list
        newNode.left = SLToBSTHelper(list, begin, mid-1);
        
        // right sub tree will be built from right half of list
        newNode.right = SLToBSTHelper(list, mid+1, end);
        return newNode;
    
    }
    
}
