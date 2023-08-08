package com.dataStructures.LinkedList;


import java.util.Scanner;

class Node<T>
{
    T data ;
    Node<T> next;

    Node(T data)
    {
        this.data = data;
        this.next = next;
    }
}
public class LinkedListOperation<T> {

    Scanner sc = new Scanner(System.in);
    Node<T> head;
    Node<T> tail;

    void addLast(T data)
    {
        Node<T> newnode = new Node<>(data);
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

    void addPositionWise(int position , T data)
    {
        Node<T> newnode = new Node<>(data);
        //Put the newnode on head
        if(position == 0)
        {
            newnode.next = head ;
            head = newnode;
            return;
        }
        int i =1;
        Node<T> temp = head;
        while(i<position)
        {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    void print(Node<T> start){
        Node<T> temp = start;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void midelement()
    {
        Node<T> fast = head;
        Node<T> slow = head;

        while(fast != null && fast.next!= null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    void Kthelement(int kth)
    {
        // using two pointer approach
        Node<T> slow = head;
        Node<T> fast = head;

        // move fast till kth position
        for(int i =1; i<=kth ; i++)
        {
            fast = fast.next;
        }

        // thei is a gap of 2 between fast and slow and we have to preserve it
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(slow.data);
    }

    void detectCycleAndDeleteCycle()
    {
        //Initialise two pointers, fast and slow to the head of the linked list.
        //Traverse through the linked list until the fast pointer doesn’t reach the end of the linked list.
        //If the fast pointer reaches the end, the linked list doesn’t contain any cycle. Hence, return False.
        //Otherwise, move the slow pointer by one node i.e. slow = slow -> next and the fast pointer by two nodes i.e. fast = fast -> next -> next.
        //At any point, if the fast and the slow pointers point to the same node, set node-> next = NULL and return True as a loop has been detected.

        Node<T> slow = head;
        Node<T> fast = head;

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

    void removeFirst(Node<T> head)
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }

        Node<T> temp = head;
        head = head.next;
    }

    void  removeLast(Node<T> head)
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        if(head.next == null)
        {
            System.out.println("Only one element in list");
        }

        Node<T> temp = head;
        while(temp.next.next!= null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }

    void removeAtSpecificIndex(int position)
    {
        if(head == null){
            System.out.println("Linked List is Empty !");
            return ;
        }
        Node<T> temp = head;
        Node<T> temp2  = null;
        // Delete Head
        if(position ==0){
            Node<T> temp3 = head;
            temp = head.next;
            head = temp;
            temp3.next = null;
            temp3 = null;

            return ;
        }
        int i =1;
        temp = head;
        while(i<position){
            temp2 = temp;
            temp = temp.next;
            i++;
        }
        temp2.next = temp.next;
        temp.next = null;
        temp = null;
    }

    public static void main(String[] args) {
        LinkedListOperation<Integer> opr = new LinkedListOperation<>();
        int choice  =0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Add");
            System.out.println("2. Print");
            System.out.println("3. Add Position Wise...");
            System.out.println("4 Remove First");
            System.out.println("5. MidElement");
            System.out.println("6 Kth Element");


            System.out.println("Enter the Choice...");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    opr.addLast(10);
                    opr.addLast(20);
                    opr.addLast(30);
                    opr.addLast(40);
                    break;
                case 2:
                    opr.print(opr.head);
                    break;
                case 3:
                    opr.addPositionWise(2, 1000);
                    break;

                case 4:
                    opr.removeFirst(opr.head);

                case 5:
                    opr.midelement();

                case 6:
                    opr.Kthelement(2);


                default:
                    System.out.println("Wrong Choice....");
                    return ;
            }
        }
        // opr.add(100);
        // opr.add(200);
        // opr.add(300);
        // opr.print(opr.head);
        // // Create a node
        // Node<Integer> node = new Node<>(100);
        // // Connect the Nodes
        // Node<Integer> node2 = new Node<>(200);
        // node.next = node2;
        // LinkedListOperations<Integer> l = new LinkedListOperations<>();
        // l.print(node);
    }



}
