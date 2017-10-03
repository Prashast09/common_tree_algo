package com.example.earthshaker.myapplication;

/**
 * Created by earthshaker on 10/3/17.
 */

public class Height {

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);

        System.out.println(height(root));
    }

    private static int height(Node node) {
        int lheight  = 0, rheight = 0;
        if(node==null) return -1;

        lheight = height(node.left);
        rheight = height(node.right);
        return lheight > rheight ? lheight +1 : rheight+1;
    }
}
