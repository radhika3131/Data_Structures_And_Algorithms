package com.datastructures.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class MaximunInGT {
    // d(10) - will print itself and its family
    //d(20) , d(30) , d(40) will print itself and its family
    // d(10) = s(10) + d(20) + d(30) + d(40)
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList< >();
    }
    public static int max(Node node) {

        int max = Integer.MIN_VALUE;
        for(Node child : node.children) {
            int cm = max(child);
            if (cm > max) {
                max = cm;
            }
        }
            if(node.data > max)
            {
                max = node.data;
            }



        return max;
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

    public static Node construct(int[] arr) {
       Node root = null;

        Stack<Node> st = new Stack< >();
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

    public static void main(String[] args)
    {

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = construct(arr);
        display(root);
        int Max = max(root);
        System.out.println(Max);


    }

}
