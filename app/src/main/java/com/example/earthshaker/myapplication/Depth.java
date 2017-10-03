package com.example.earthshaker.myapplication;

/**
 * Created by earthshaker on 10/3/17.
 */

public class Depth {

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);

        System.out.println(depth(root,4));
    }

    private static int depth(Node root, int data, int level) {
          }


}
