package com.dataStructures.LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AddLast {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList {
        Node head;
        Node tail;


        void addLast(int val) {
            Node newnode = new Node(val);
            if(head == null)
            {
                head = newnode;
                tail = newnode;
            }
            else {
                tail.next = newnode;
                tail = newnode;
            }
        }
    }

    public static void testList(LinkedList list) {
       Node temp = list.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        int choice  =0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. AddLast");
            System.out.println("2. TestList");


            System.out.println("Enter the Choice...");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    list.addLast(10);
                    list.addLast(20);
                    list.addLast(30);
                    list.addLast(40);
                    break;
                case 2:
                   testList(list);
                    break;

                default:
                    System.out.println("Wrong Choice....");
                    return ;
            }
        }
    }
}
