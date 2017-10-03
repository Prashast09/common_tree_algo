package com.example.earthshaker.myapplication;

/**
 * Created by earthshaker on 10/3/17.
 */

public class LevelOrderTraversal {

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.left.left = new Node(9);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);

     int level = height(root);
        for(int i=1;i<=level;i++){
            traverse(root,i);
        }
    }

    private static void traverse(Node root, int level) {
        if(level == 0 || root ==null) return;

        if(level ==1)
        System.out.print(root.key);

        traverse(root.left,level-1);
        traverse(root.right,level-1);
    }

    private static int height(Node node) {
        int lheight  = 0, rheight = 0;
        if(node==null) return 0;

        lheight = height(node.left);
        rheight = height(node.right);
        return lheight > rheight ? lheight +1 : rheight+1;
    }
}
