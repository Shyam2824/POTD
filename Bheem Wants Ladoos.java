public class Bheem Wants Ladoos {
    static void markParents(Node root, HashMap<Node, Node> parent) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node f = q.poll();
            if (f != null) {
                if (f.left != null) {
                    q.add(f.left);
                    parent.put(f.left, f);
                }
                if (f.right != null) {
                    q.add(f.right);
                    parent.put(f.right, f);
                }
            } else {
                if (!q.isEmpty())
                    q.add(null);
            }
        }
    }

    static Node searchHome(int home, Node root) {
        if (root == null)
            return null;
        if (root.data == home)
            return root;
        Node left = searchHome(home, root.left);
        if (left != null)
            return left;
        return searchHome(home, root.right);
    }

    static int ladoos(Node root, int home, int k) {
        HashMap<Node, Node> parent = new HashMap<>();
        markParents(root, parent);
        Node target = searchHome(home, root);
        Queue<Node> q = new LinkedList<>();
        q.add(target);
        HashMap<Node, Boolean> visited = new HashMap<>();
        visited.put(target, true);
        int sum = 0;
        sum += home;
        int currLevel = 0;
        while (!q.isEmpty()) {
            int n = q.size();
            if (currLevel++ == k)
                break;
            for (int i = 0; i < n; i++) {
                Node f = q.poll();
                if (f.left != null && !visited.containsKey(f.left)) {
                    q.add(f.left);
                    sum += f.left.data;
                    visited.put(f.left, true);
                }
                if (f.right != null && !visited.containsKey(f.right)) {
                    q.add(f.right);
                    sum += f.right.data;
                    visited.put(f.right, true);
                }
                if (parent.containsKey(f) && !visited.containsKey(parent.get(f))) {
                    q.add(parent.get(f));
                    sum += parent.get(f).data;
                    visited.put(parent.get(f), true);
                }
            }
        }
        return sum;
    }
}
