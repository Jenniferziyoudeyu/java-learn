package class5_heap_graph1;

//分层打印binary tree

import SingleNode.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public void BFS (Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node n = q.remove();
                if (n.left != null)
                    q.offer(n.left);
                if (n.right != null)
                    q.offer(n.right);
                System.out.println(n +" ");
            }
            System.out.println();
            List<Integer> newList = new ArrayList<>(100);
//          规定一个Integer类型的list  <>泛型 里面加上list的类型
        }

}
private class Node {
     Node root;
     Node left;
     Node right;
    void Node (Node root){
         this.root = root;
    }
}
}

