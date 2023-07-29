public class Median of BST {
       private static void inorderTraversal(Node root, List<Integer> nodeList)
    {
        if (root == null) return;

        inorderTraversal(root.left, nodeList);
        nodeList.add(root.data);
        inorderTraversal(root.right, nodeList);
    }

    public static float findMedian(Node root)
    {
        if (root == null) return 0;

        List<Integer> nodeList = new ArrayList<>();
        inorderTraversal(root, nodeList);

        int n = nodeList.size();
        if (n % 2 == 0) {
            // If the number of nodes is even, median is the average of middle two nodes.
            int midIndex1 = (n / 2) - 1;
            int midIndex2 = n / 2;
            int medianSum = nodeList.get(midIndex1) + nodeList.get(midIndex2);
            return (float) medianSum / 2;
        } else {
            // If the number of nodes is odd, median is the middle node.
            int midIndex = n / 2;
            return nodeList.get(midIndex);
        }
}
