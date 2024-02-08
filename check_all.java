import org.w3c.dom.Node;

public class Solution {
    boolean check(Node root) {
        int[] leafLevels = new int[1]; // To keep track of the level of the first encountered leaf
        return checkLeavesAtSameLevel(root, 0, leafLevels);
    }

    private boolean checkLeavesAtSameLevel(Node root, int level, int[] leafLevels) {
        if (root == null)
            return true;

        // Check if the current node is a leaf
        if (root.left == null && root.right == null) {
            // If it is the first leaf encountered, update the leaf level
            if (leafLevels[0] == 0) {
                leafLevels[0] = level;
            } else {
                // If it is not the first leaf, check if it is at the same level
                if (level != leafLevels[0]) {
                    return false;
                }
            }
            return true;
        }

        // Recursively check left and right subtrees
        return checkLeavesAtSameLevel(root.left, level + 1, leafLevels)
                && checkLeavesAtSameLevel(root.right, level + 1, leafLevels);
    }
} {
    
}
