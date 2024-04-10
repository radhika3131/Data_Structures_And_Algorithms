package com.dataStructures.LinkedListNew;

public class ReverseLL {
    public static  class ListNode {
        public int data;
        ListNode nextNode;
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

    public static ListNode ReverseList(ListNode node)
    {
        if(headNode == null || headNode.nextNode == null)
        {
            return headNode;
        }

        ListNode prevNode = headNode;
        ListNode currNode = headNode.nextNode;

        while(currNode != null)
        {
            ListNode nextNode = currNode.nextNode;
            currNode.nextNode = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        headNode.nextNode = null;
        headNode = prevNode;

        return  node;
    }

    public static void main(String[] args)
    {
       ListNode head = null;
        // Created linked list will be 11.11.11.13.13.20 */
        insertAtHead(5);
        insertAtHead(4);
        insertAtHead(3);
        insertAtHead(2);
        insertAtHead(1);


        System.out.println("Linked list before"
                + " Reverse ");
        printList();

        /* Remove duplicates from linked list */
        ReverseList(headNode);

        System.out.println("\nLinked list after"
                + " reverse ");
        printList();
    }
}
