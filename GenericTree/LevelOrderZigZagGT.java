package com.datastructures.GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderZigZagGT {
    // d(10) - will print itself and its family
    //d(20) , d(30) , d(40) will print itself and its family
    // d(10) = s(10) + d(20) + d(30) + d(40)
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList< >();
    }

    public static void levelorderZigZagTraversal(Node node)
    {
        Stack<Node> mains = new Stack< >();
        mains.add(node);

        Stack<Node> childs = new Stack< >();
        int level = 0;

        while (mains.size() > 0) {
            node = mains.pop();
            System.out.println(node.data + " ");
            if (level % 2 == 1) {
                for (int i = 0; i < node.children.size(); i++) {
                    childs.push(node.children.get(i));
                }
            }
            else {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    childs.push(node.children.get(i));
                }

            }
        }
            if (mains.size() == 0) {
                mains = childs;

                childs= new Stack< >();
                level++;
                System.out.println();
            }

    }
    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static
    Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {

                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }


        }
        return root;
    }

        public static void main (String[]args)
        {

            int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
            Node root = construct(arr);
            display(root);
            levelorderZigZagTraversal(root);


        }
    }
