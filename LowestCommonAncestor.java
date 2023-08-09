package BinaryTree;

import java.util.HashMap;
import java.util.HashSet;

public class LowestCommonAncestor {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }
    //o1,o2一定属于head为头的这棵树，在这个前提下返回最低公共祖先
    public static Node lca(Node head, Node o1, Node o2){
        HashMap<Node, Node> fatherMap = new HashMap<>();
        fatherMap.put(head,head);
        process(head,fatherMap);
        HashSet<Node> set1 = new HashSet<>();
        //set1.add(o1);
        Node cur = o1;
        while(cur != fatherMap.get(cur)){
            set1.add(cur);
            cur = fatherMap.get(cur);
        }
        set1.add(head);
        Node n = o2;
        while(!set1.contains(n)){
            n = fatherMap.get(n);
        }
        return n;
    }
    public static void process(Node head, HashMap<Node,Node> fatherMap){
        if(head == null){
            return;
        }
        fatherMap.put(head.left,head);
        fatherMap.put(head.right,head);
        process(head.left, fatherMap);
        process(head.right, fatherMap);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        head.right.right.left = new Node(8);
        //printTree(head);
        //System.out.println("===============");

        Node o1 = head.right.left;
        Node o2 = head.right.right.left;

        System.out.println("o1 : " + o1.value);
        System.out.println("o2 : " + o2.value);
        System.out.println("ancestor : " + lca(head, o1, o2).value);
        System.out.println("===============");

    }
}

