package com.dataStructures.LinkedList;

public class PairWiseSwap {
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


    public static Node PairWise(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Node currNode = head;
        Node newhead = head.next;

        while(currNode != null && currNode.next != null )
        {
            Node temp = currNode.next;

            // Swapping
            currNode.next = currNode.next.next;
            temp.next = currNode;
            currNode = currNode.next;


            if(currNode != null && currNode.next !=null)

                temp.next.next = currNode.next;

        }

        return newhead;
    }


    public static void main(String[] args) {
        PairWiseSwap list = new PairWiseSwap();
        // list 1->2->3->4->5
        list.Add(12);
        list.Add(49);
        list.Add(9);
        list.Add(30);
        list.Add(56);
        list.Add(20);

        System.out.println("Original List");
        list.display();

        list.PairWise(list.head);
        System.out.println("after swapping");
        list.display();
    }
}
