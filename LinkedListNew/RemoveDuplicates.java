package com.dataStructures.LinkedListNew;
import java.io.*;

public class RemoveDuplicates {
    public static  class ListNode {
        public int data;
        public ListNode nextNode;
    }

    public static ListNode headNode;
    public static int size ;


    // helper function to check if list is empty or not
    public static  boolean isEmpty()
    {
        if(headNode == null)
        {
            return true;
        }
        return false;
    }

    //Insert new data at the start of the linkedList
    public static void insertAtHead(int data)
    {
        //Creating a newNode and assigning it the new data value
        ListNode newNode = new ListNode();
        newNode.data = data;

        newNode.nextNode = headNode;
        headNode = newNode;
        size++;

    }
    // helper function to printList
    public static  void printList()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty");
            return;
        }

        ListNode temp = headNode;
        System.out.println("List : ");
        while (temp.nextNode!= null)
        {
            System.out.println(temp.data + "-> ");
            temp = temp.nextNode;
        }

        System.out.println(temp.data + "-> null");
    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null)
        {
            ListNode curr = temp;
            while(curr!= null && curr.data == temp.data)
            {
                curr = curr.nextNode;
            }

            temp.nextNode = curr;
            temp = temp.nextNode;
        }

        return head;
    }


    public static void main(String[] args)
    {
        ListNode head = null;
        // Created linked list will be 11.11.11.13.13.20 */
        insertAtHead(20);
        insertAtHead(13);
        insertAtHead(13);
        insertAtHead(11);
        insertAtHead(11);
        insertAtHead(11);

        System.out.println("Linked list before"
                + " duplicate removal ");
        printList();

        /* Remove duplicates from linked list */
        head = deleteDuplicates(headNode);

        System.out.println("\nLinked list after"
                + " duplicate removal ");
        printList();
    }
}
