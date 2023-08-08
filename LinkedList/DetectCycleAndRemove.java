package com.dataStructures.LinkedList;

public class DetectCycleAndRemove {
    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static Node head ;
    Node tail;

    void detectCycleAndDeleteCycle()
    {
        //Initialise two pointers, fast and slow to the head of the linked list.
        //Traverse through the linked list until the fast pointer doesn’t reach the end of the linked list.
        //If the fast pointer reaches the end, the linked list doesn’t contain any cycle. Hence, return False.
        //Otherwise, move the slow pointer by one node i.e. slow = slow -> next and the fast pointer by two nodes i.e. fast = fast -> next -> next.
        //At any point, if the fast and the slow pointers point to the same node, set node-> next = NULL and return True as a loop has been detected.

       Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast=fast.next.next;

            if(slow == fast) // detect cycle
            {
                System.out.println("Yes Cycle...");
                break;
            }
        }
        if(slow!=fast){
            System.out.println("No Cycle...");
            return ;
        }

        slow = head;
        while(slow.next!=fast.next){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast.next = null; // Break the Cycle

    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static void main(String[] args) {
        DetectCycleAndRemove list = new DetectCycleAndRemove();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectCycleAndDeleteCycle();
        list.printList(head);


    }
}
