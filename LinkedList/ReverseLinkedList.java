package com.dataStructures.LinkedList;

public class ReverseLinkedList {
    static class Node {
        int data;
       Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
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

    //recursive Approach
    public Node  reverse(Node head )
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

    //Iterative approach
    public void reverseList()
    {
        if(head==null || head.next == null)
            return ;

       Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;


            //Update
            prevNode = currNode;
            currNode = nextNode;

        }

        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        // list 1->2->3->4->5
        list.Add(1);
        list.Add(2);
        list.Add(3);
        list.Add(4);
        list.Add(5);

        System.out.println("List before reverse");
        list.display();
       // list.head = list.reverse(list.head);
        list.reverseList();
        System.out.println("List After reverse");
        list.display();

    }

}
