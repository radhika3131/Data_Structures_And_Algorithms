package com.dataStructures.LinkedList;

public class RemoveTheNthNodeFromEnd {

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
    public  void RemoveNode(Node head , int n)
    {

        Node slow = head;
        Node fast = head;

        for(int i = 1; i<=n ; i++)
        {
            fast = fast.next;
        }

        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return;
    }

    public static void main(String[] args) {
        RemoveTheNthNodeFromEnd list = new RemoveTheNthNodeFromEnd();
        // list 1->2->3->4->5
        list.Add(1);
        list.Add(2);
        list.Add(3);
        list.Add(4);
        list.Add(5);

        System.out.println("List before deletion");
        list.display();
        list.RemoveNode(list.head , 2);
        System.out.println("List After deletion");
        list.display();

    }
}
