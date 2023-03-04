import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class balanceBST {

    public TreeNode balance(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        inOrder(root,list);
        return balanceHelp(list, 0 , list.size()-1);
    }

    private void inOrder(TreeNode root, List<TreeNode> list) {
        if (root == null) {return;}
        inOrder(root.left, list);
        list.add(root);
        inOrder(root.right,list);
    }
    private TreeNode balanceHelp(List<TreeNode> list, int start, int end) {
        if (start > end) {return null;}
        int mid = (start+end)/2;
        TreeNode newRoot = list.get(mid);
        newRoot.left = balanceHelp(list, start, mid-1);
        newRoot.right = balanceHelp(list, mid+1, end);
        return newRoot;
    }
}
