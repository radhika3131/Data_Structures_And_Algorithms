package com.dataStructures.LinkedListNew;

import java.awt.*;

public class InsertOperations<T> {
    public  class Node {
        public T data;
        public Node nextNode;
    }

    public Node headNode;
    public int size ;

    public void InsertOperations(){
        headNode = null;
        size = 0;
    }

    // helper function to check if list is empty or not
    public  boolean isEmpty()
    {
        if(headNode == null)
        {
            return true;
        }
        return false;
    }

    //Insert new data at the start of the linkedList
    public void insertAtHead(T data)
    {
        //Creating a newNode and assigning it the new data value
        Node newNode = new Node();
        newNode.data = data;

        newNode.nextNode = headNode;
        headNode = newNode;
        size++;

    }
    // helper function to printList
    public void printList()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty");
            return;
        }

        Node temp = headNode;
        System.out.println("List : ");
        while (temp.nextNode!= null)
        {
            System.out.println(temp.data.toString() + "-> ");
            temp = temp.nextNode;
        }

        System.out.println(temp.data.toString() + "-> null");
    }

    public void insertAtEnd(T data) {

        //check if List is empty or not
        if(isEmpty())
        {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node();
        newNode.data = data;

        newNode.nextNode = null;

        Node LastNode = headNode;
        while(LastNode.nextNode!= null)
        {
            LastNode = LastNode.nextNode;
        }

        LastNode.nextNode = newNode;
        size++;

    }

    public void insertAfter(T data , T prev )
    {
        Node newNode = new Node();
        newNode.data = data ;

        Node curr = headNode;
        while(curr != null && curr.data.equals(prev))
        {
            curr = curr.nextNode;
        }

        if(curr != null)
        {
            newNode.nextNode = curr.nextNode;
            curr.nextNode = newNode;
            size++;
        }
    }
}

 class Main{
     public static void main( String args[] ) {
         InsertOperations<Integer> sll = new InsertOperations<>() ;
         for (int i = 1; i <= 6; i++) {
             sll.insertAtEnd(i); // inserting value at the tail of the list
         }
         sll.printList();

         System.out.println ("\nInserting 8 after 2");
         sll.insertAfter(8, 2);
         sll.printList();   // calling insert after
         System.out.println ("\nInserting 10 after 3");
         sll.insertAfter (10, 3);   // calling insert after
         sll.printList();
     }

}
