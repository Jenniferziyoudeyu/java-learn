package class4_Binary_Tree;


import sun.awt.SunHints;

import java.util.*;

public class tree_Traverse {

    int maxValue = Integer.MIN_VALUE;
    public int maxValueOfTree(TreeNode root) {
        preOrder(root);
        return maxValue;
    }

    public void preOrder(TreeNode root) {
        if (root == null) return;
        maxValue = Math.max(maxValue,root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.value);
    }

    int maxHeight(TreeNode root) {
        if (root == null) return 0;
        int leftMax = maxHeight(root.left);
        int rightMax = maxHeight(root.right);
        return Math.max(leftMax, rightMax) + 1;
    }


//    public List<List<Integer>> levelOrderTraverse(TreeNode root) {
////        List<List<Integer>> list = new ArrayList<>();
////        return list;
//        //初始化object
//        List<Integer> list = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        Set<Integer> set = new HashSet<>();
//        String str = "str";
//        String str2 = new String("asdasd");
//        StringBuilder builder = new StringBuilder();
//        int[] arr = new int[5];
//        if(root == null) return new ArrayList<>();
//    }

    public List<List<Integer>> levelOrderTraverse(TreeNode root) {
        List<List<Integer>> outList = new ArrayList<>();
        if (root == null) return outList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> innerList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                innerList.add(poll.value);
                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            outList.add(innerList);
        }
        return outList;
    }

    boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean lastNodeThatHasOnlyLeftChildOrNoneChild = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
//                if (poll.left != null && poll.right != null) {
//                    if (lastNodeThatHasOnlyLeftChildOrNoneChild == true) return false;
//                    continue;
//                } else if (poll.right != null) {
//                    return false;
//                } else {
//                    if (poll.left != null && lastNodeThatHasOnlyLeftChildOrNoneChild == true) return false;
//                    lastNodeThatHasOnlyLeftChildOrNoneChild = true;
//                }
//                if (poll.left != null) queue.offer(poll.left);
//                if (poll.right != null) queue.offer(poll.right);
                if (poll.left != null) {
                    if (lastNodeThatHasOnlyLeftChildOrNoneChild) return false;
                    queue.offer(poll.left);
                } else {
                    lastNodeThatHasOnlyLeftChildOrNoneChild = true;
                }
                if (poll.right != null) {
                    if (lastNodeThatHasOnlyLeftChildOrNoneChild) return false;
                    queue.offer(poll.right);
                }
            }
        }
        return true;
    }

    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        PriorityQueue<cell> queue = new PriorityQueue<>(new Comparator<cell>() {
            @Override
            public int compare(cell o1, cell o2) {
                return o1.value > o2.value ? 1 : -1;
            }
        });
        boolean[][] valid = new boolean[m][n];
        queue.offer(new cell(0, 0, matrix[0][0]));
        valid[0][0] = true;
        for (int i = 0; i < k - 1 && !queue.isEmpty(); i++) {
            cell poll = queue.poll();
            if (poll.row + 1 < m && !valid[poll.row + 1][poll.col]) {
                queue.offer(new cell(poll.row + 1, poll.col, matrix[poll.row + 1][poll.col]));
                valid[poll.row + 1][poll.col] = true;
            }
            if (poll.col + 1 < n && !valid[poll.row][poll.col + 1]) {
                queue.offer(new cell(poll.row, poll.col + 1, matrix[poll.row][poll.col + 1]));
                valid[poll.row][poll.col + 1] = true;
            }
        }

        return queue.isEmpty() ? 0 : queue.peek().value;
    }

    private class cell {
        int value;
        int row;
        int col;
        cell(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.value = val;
        }

        @Override
        public boolean equals(Object obj) {
            cell compareCell = (cell)obj;
            return row == compareCell.row && col == compareCell.col;
        }
    }


}
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) {
        this.value = value;
    }
}
