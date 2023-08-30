package com.dataStructures.LinkedList;

public class IntersectionOfTwoLL {
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

    //utility function to insert node at the end of the linked list
    static Node insertNode(Node head,int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        while(temp.next != null) temp = temp.next;

        temp.next = newNode;
        return head;
    }


    //utility function to print linked list created
    //Time complexity - O(m*n);
    // Reason-:Reason: For each node in list 2 entire lists 1 are iterated.
    static void printList(Node head) {
        while(head.next != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println(head.data);
    }
    public static Node Intersection(Node head1 , Node head2)
    {
        while(head2 != null)
        {
            Node temp = head1;
            while(temp != null)
            {
                if(temp == head2)
                {
                    return head2;
                }

                temp = temp.next;
            }
            head2 = head2.next;
        }

        // If we did not find an intersection node and completed the entire iteration of the second list,
        // then there is no intersection between the provided lists. Hence, return null.
      return null;
    }


    //Optimized approach
    

    public static void main(String[] args) {
        IntersectionOfTwoLL list = new IntersectionOfTwoLL();
        // list 1->2->3->4->5
        Node head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);
        Node head1 = head;
        head = head.next.next.next;
        Node headSec = null;
        headSec=insertNode(headSec,3);
        Node head2 = headSec;
        headSec.next = head;
        //printing of the lists
        System.out.print("List1: "); printList(head1);
        System.out.print("List2: "); printList(head2);
        //checking if intersection is present
        Node answerNode = Intersection(head1,head2);
        if(answerNode == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is "+answerNode.data);
    }

}
