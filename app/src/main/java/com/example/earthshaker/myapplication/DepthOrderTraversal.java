package com.example.earthshaker.myapplication;

/**
 * Created by earthshaker on 10/3/17.
 */

public class DepthOrderTraversal {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.left.left = new Node(9);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);

        preorderTraversal(root);
        System.out.println();
        inorderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
    }

    private static void inorderTraversal(Node root) {
        if(root == null) return;

        postOrderTraversal(root.left);
        System.out.print(root.key);
        postOrderTraversal(root.right);
    }

    private static void postOrderTraversal(Node root) {
        if(root == null) return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.key);

    }

    private static void preorderTraversal(Node root) {
        if(root == null) return;

        System.out.print(root.key);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }


}
