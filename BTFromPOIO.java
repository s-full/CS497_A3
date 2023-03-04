public class BTFromPOIO {
    public TreeNode makeTree(int[] pre, int[] in) {
        //if (pre.length != in.length) {return null;}
        return makeTreeHelper(pre,in,0,pre.length-1, 0, in.length-1);
    }

    public TreeNode makeTreeHelper(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {

        if (preStart > preEnd || inStart > inEnd) {return null;}

        int leftSize = 0;
        int currRootVal = pre[preStart];
        int currRootIndx = 0;

        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == currRootVal) {
                currRootIndx = i;
                break;
            }
        }
        TreeNode root = new TreeNode(currRootVal);
        leftSize = currRootIndx-inStart;
        root.left = makeTreeHelper(pre, in, preStart+1, leftSize+preStart, inStart, currRootIndx-1);

        root.right = makeTreeHelper(pre, in, preStart+leftSize+1, preEnd, currRootIndx+1, inEnd);
        return root;
    }
}
