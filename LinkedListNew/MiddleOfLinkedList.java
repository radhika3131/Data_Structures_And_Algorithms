package com.dataStructures.LinkedListNew;

import java.util.Currency;

public class MiddleOfLinkedList {
    public static <T>  Object  findMiddle(InsertOperations<T> list)
    {
        // Tc -> O (n)
       if (list.isEmpty())
       {
           return null;
       }

       InsertOperations.Node mid = list.headNode;
       InsertOperations.Node current = list.headNode;

       while(mid != null && current != null && current.nextNode != null)
       {
           // shifting current Node by two steps
           current = current.nextNode.nextNode;

           // if current is not null , then we have'nt reached end of list
           if(current != null){
               // shifting mid node by one step
               mid = mid.nextNode;
           }

       }
       return mid.data;
    }

    public  static  void main(String[] args)
    {
        InsertOperations<Integer> list = new InsertOperations<>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);

        list.insertAtEnd(123);
        list.insertAtEnd(101);
        list.insertAtEnd(61);
        list.printList();
        System.out.println("Middle element is : " + findMiddle(list));
    }
}
