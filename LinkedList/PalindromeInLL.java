package com.dataStructures.LinkedList;

import java.util.ArrayList;

public class PalindromeInLL {
    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

   static Node head;
    Node tail;

    public void Add(int data)
    {
       Node newnode = new Node(data);
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


    public void display()
    {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    //Approach Usig extra space , Time complexity O(n)
    public static boolean Palindrome(Node head)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        //Storing linkedList in array
        while(head!= null)
        {
            arr.add(head.data);
            head = head.next;
        }

        //Chcek if each index digit is same as the length-eachIndex - 1
        int n = arr.size();
        for(int i =0; i<n/2; i++)
            if(arr.get(i) == arr.get(n - i - 1))
            {
                return true;
            }
            return false;



    }

    // Optimized Approach , O(N/2)+O(N/2)+O(N/2)
    //Reason: O(N/2) for finding the middle element, reversing the list from the middle element, and traversing again to find palindrome respectively.

    public static  Node reverse(Node head )
    {
        if(head==null || head.next == null)
            return head;

        //get second node
        Node second = head.next;
        //set first's next to be null
        head.next = null;

        Node rest = reverse(second);
        second.next = head;

        return rest;
    }


    public static boolean isPalindrome(Node head)
    {
        if(head == null || head.next == null)
        {
            return true;
        }

        Node fast = head;
        Node slow = head;

        //We will find the middle element, Move until fast do not reach last or second last element
        while(fast.next!= null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse a linked list from the next element of the middle element
        slow.next = reverse(slow.next);
        slow = slow.next;

        //Assign Dummy node as the head odf the list , Move slow pointer ahead .start iterating until slow pointer reaches the end
        Node dummy = head;
        while(slow!=null) {
            if(dummy.data != slow.data) return false;
            dummy = dummy.next;
            slow = slow.next;
        }
        return true;
    }



    public static void main(String[] args) {
        PalindromeInLL list = new PalindromeInLL();
        // list 1->2->3->4->5
        list.Add(1);
        list.Add(2);
        list.Add(3);
        list.Add(2);
        list.Add(1);

        System.out.println("List before reverse");
        list.display();
        if(isPalindrome(head)==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
