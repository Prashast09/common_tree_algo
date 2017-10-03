package com.example.earthshaker.myapplication;

/**
 * Created by earthshaker on 10/3/17.
 */

public class LeastCommonAncestor {

    Node root;

    public static void main(String[] args) {
        LeastCommonAncestor leastCommonAncestor = new LeastCommonAncestor();

        leastCommonAncestor.root = new Node(1);
        leastCommonAncestor.root.left = new Node(2);
        leastCommonAncestor.root.left.left = new Node(4);
        leastCommonAncestor.root.left.right = new Node(5);
        leastCommonAncestor.root.right = new Node(3);
        leastCommonAncestor.root.right.left = new Node(6);
        leastCommonAncestor.root.right.left.left = new Node(9);
        leastCommonAncestor.root.right.right = new Node(7);
        leastCommonAncestor.root.right.right.left = new Node(8);

        System.out.print(leastCommonAncestor.findLCA(9, 8).key);
    }

    public Node findLCA(int n1, int n2) {
        return findLCA(root, n1, n2);
    }

    Node findLCA(Node node, int n1, int n2) {
        // Base case
        if (node == null)
            return null;


        if (node.key == n1 || node.key == n2)
            return node;


        Node left_lca = findLCA(node.left, n1, n2);
        Node right_lca = findLCA(node.right, n1, n2);


        if (left_lca != null && right_lca != null)
            return node;

        return (left_lca != null) ? left_lca : right_lca;
    }
}
