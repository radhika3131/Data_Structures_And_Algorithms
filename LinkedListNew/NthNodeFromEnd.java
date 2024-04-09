package com.dataStructures.LinkedListNew;

import com.dataStructures.LeetcodeDailyChallange.SearchInMatrix;

import java.util.Currency;

public class NthNodeFromEnd {
    public static <T> Object nthElement(InsertOperations<T> list , int n )
    {
        int size = list.getSize();
        n = size - n + 1; // we can use this size variable to calculate the distance from the start
        if(size == 0 || n > size)
        {
            return null;
        }

        InsertOperations<T> .Node current =list.headNode;
        int count = 1;
        while(current != null)
        {
            if(count == n)
            {
                return current.data;
            }
            count++;
            current = current.nextNode;
        }
        return null;
    }

    public static void main(String args[]) {
       InsertOperations < Integer > sll = new InsertOperations<>();
        sll.printList(); //list is empty
        System.out.println("3rd element from end : " + nthElement(sll, 3)); //will return null
        for (int i = 0; i < 15; i += 2) {
            sll.insertAtHead(i);
        }
        sll.printList(); // List is 14 -> 12 -> 10 -> 8 -> 6 -> 4 -> 2 -> 0 -> null
        System.out.println("3rd element from end : " + nthElement(sll, 3)); //will return 4
        System.out.println("10th element from end : " + nthElement(sll, 10)); //will return null
    }
}
