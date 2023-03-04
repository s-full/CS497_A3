import java.util.*;

public class largestValInLevel {

    public List<Integer> largestValues(TreeNode root) {

        // init list where values will be the greatest value in their respective leve
        List<Integer> result = new ArrayList<>();

        // empty tree case
        if (root == null) {
            return result;
        }
        // use queue to breadth first search each level of tree
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // traverse each level
        while (!queue.isEmpty()) {

            // get size of current level
            int levelSize = queue.size();

            // this value will contain the max value of level of tree
            int maxVal = Integer.MIN_VALUE;

            // scroll through values in current level
            for (int i = 0; i < levelSize; i++) {
                // pop node from queue
                TreeNode node = queue.poll();
                // select max value from curr max or newly popped node
                maxVal = Math.max(maxVal, node.value);

                // add left child to queue
                if (node.left != null) {
                    queue.offer(node.left);
                }
                // add right child to queue
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            // now add max of current level to list
            result.add(maxVal);
        }
        // return the list of greatest values of each level
        return result;
    }
}
