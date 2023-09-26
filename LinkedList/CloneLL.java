package com.dataStructures.LinkedList;

import java.util.*;

 class listNode {
    int val;
    listNode next;
    listNode random;
    listNode(int value) {
        val = value;
        next = null;
        random = null;
    }
}
class TUF{

     /*

    //Bruteforce Approach
    static listNode copyRandomList(listNode head) {
        HashMap<listNode,listNode> hashMap=new HashMap<>();
        listNode temp = head;
      //first iteration for inserting deep nodes of every node in the hashmap.
        while(temp != null) {
            listNode newNode = new listNode(temp.val);
            hashMap.put(temp,newNode);
            temp = temp.next;
        }
        listNode t = head;
      //second iteration for linking next and random pointer as given question.
        while(t != null) {
            listNode node = hashMap.get(t);
            node.next = (t.next != null) ? hashMap.get(t.next):null;
            node.random = (t.random != null) ? hashMap.get(t.random):null;
            t = t.next;
        }
        return hashMap.get(head);
    }
       */


    //Optimal Approach

    static listNode cloneRandomlist(listNode head)
    {
        //step1
        //Create deep nodes of all nodes. Instead of storing these nodes in a hashmap, we will point it to the next of the original nodes.
        listNode temp = head;


        while(temp != null) {
            listNode newNode = new listNode(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        //step2
        //Take a pointer, say itr, point it to the head of the list.
        // This will help us to point random pointers as per the original list. This can be achieved by itr->next->random = itr->random->next
        listNode itr = head;
        while(itr != null) {
            if(itr.random != null)
                itr.next.random = itr.random.next;
            itr = itr.next.next;
        }

        //step3
        listNode dummy = new listNode(0);
        itr = head;
        temp = dummy; // so that we do'nt loose the track of the intial head of the deep copy list
        listNode fast;
        while(itr != null)
        {
            fast = itr.next.next;
            //extract deep copy list
            temp.next = itr.next;
            itr.next = fast;
            temp = temp.next;
            itr = fast;
        }

        return dummy.next;

    }

    static void printList(listNode head) {
        while(head != null) {
            System.out.print(head.val+":");
            if(head.next != null)
                System.out.print(head.next.val);
            else
                System.out.print("NULL");
            if(head.random != null)
                System.out.print(","+head.random.val);
            else
                System.out.print(",NULL");
            System.out.println();
            head = head.next;
        }
    }

    public static void main(String args[]) {
        listNode head = null;

        listNode node1 = new listNode(1);
        listNode node2 = new listNode(2);
        listNode node3 = new listNode(3);
        listNode node4 = new listNode(4);

        head = node1;
        head.next = node2;
        head.next.next = node3;
        head.next.next.next = node4;

        head.random = node4;
        head.next.random = node1;
        head.next.next.random = null;
        head.next.next.next.random = node2;

        System.out.println("Original list:(current node:node pointed by next pointer, node pointed by random pointer)");
        printList(head);

        System.out.println("Copy list:(current node:node pointed by next pointer,node pointed by random pointer)");
        listNode newHead = cloneRandomlist(head);
        printList(newHead);
    }
}