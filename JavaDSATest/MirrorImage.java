package com.dataStructures.JavaDSATest;

public class MirrorImage {
    public static  class Node
    {
        int data;
        Node left = null;
        Node right = null;

        public Node(int data)
        {
            this.data = data;
        }
    }
    // Function to perform preorder traversal on a given binary tree
    public static void Inorder(Node root)
    {
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public static void Mirror(Node root) {

        if (root == null) {
            return;
        }

        // convert left subtree
        Mirror(root.left);

        // convert right subtree
        Mirror(root.right);

        // swap left subtree with right subtree
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        Mirror(root);
        Inorder(root);
    }

}
