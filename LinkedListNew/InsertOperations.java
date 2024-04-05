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

    public boolean search( T value)
    {
        // Time complexity - O(n) because we have to traverse through the list.
        Node currentNode = new Node();
        currentNode = headNode;

        while(currentNode != null )
        {
            if(currentNode.data == value)
            {
                return true;
            }

            currentNode = currentNode.nextNode;
        }

        return false;
    }

    public void deleteAtHead()
    {
        if(isEmpty())
        {
            return;
        }
        //make the nextNode of the headNode equal to new headNode
        headNode = headNode.nextNode;
        size--;
    }

    public void deleteByValue(T value) // TC -> O(n), In the worst case, you would have to traverse until the end of the list
    {
        Node currentNode = new Node();
        Node prevNode = new Node();
        currentNode = headNode;
        prevNode = null;

        if(currentNode.data == value)
        {
            // if value is present at the head;
            deleteAtHead();
            return;
        }

        //if value is not at head
        while(currentNode != null)
        {
            if(currentNode.data == value)
            {
                prevNode.nextNode = currentNode.nextNode;
                size--;
            }

            prevNode = currentNode;
            currentNode = currentNode.nextNode;
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
         boolean result = sll.search(5);
         System.out.println(result);
         sll.deleteAtHead();
         sll.printList();
         sll.deleteByValue(5);
         sll.printList();
        /* System.out.println ("\nInserting 8 after 2");
         sll.insertAfter(8, 2);
         sll.printList();   // calling insert after
         System.out.println ("\nInserting 10 after 3");
         sll.insertAfter (10, 3);   // calling insert after
         sll.printList();

         */
     }

}
