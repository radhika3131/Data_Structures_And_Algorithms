package com.dataStructures.LinkedListNew;

public class DLLCheckPalindrome {
    public static <T> boolean checkPalindrome(DoublyLLWithTail<T> list )
    {
        DoublyLLWithTail<T> .Node start = list.getHeadNode();
        DoublyLLWithTail<T>. Node end = list.getTailNode();

        if(list.isEmpty())
        {
            return true;
        }

        while(start != null)
        {
            if(start.data != end.data) //if data mismatches at any point list is not a palindrome
            {
                return false;
            }
            start = start.nextNode;
            end = end.prevNode;
        }
        return true; // if data does'nt mismatches at any point list is a palindrome
    }

    public static void main(String args[]) {
        DoublyLLWithTail < Integer > list1 = new DoublyLLWithTail<Integer>();
        list1.insertAtEnd(1);
        list1.insertAtEnd(2);
        list1.insertAtEnd(2);
        list1.insertAtEnd(1);
        System.out.print("1st ");
        list1.printList();
       DoublyLLWithTail < Integer > list2 = new DoublyLLWithTail < Integer > ();
        list2.insertAtEnd(6);
        list2.insertAtEnd(8);
        list2.insertAtEnd(6);
        list2.insertAtEnd(6);
        System.out.print("2nd ");
        list2.printList();
        System.out.println("Is 1st list a palindrome?  " + checkPalindrome(list1));
        System.out.println("Is 2nd list a palindrome?  " + checkPalindrome(list2));

    }

}
