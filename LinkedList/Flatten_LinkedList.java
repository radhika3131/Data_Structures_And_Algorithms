package com.dataStructures.LinkedList;

public class Flatten_LinkedList {
    static class Node {
        int data;
        Node next;
        Node bottom;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.bottom = null;
        }
    }

    static Node head;
    Node tail;

    /* Utility function to insert a node at beginning of the
       linked list */
    Node push(Node head_ref, int data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(data);

        /* 3. Make next of new Node as head */
        new_node.bottom = head_ref;

        /* 4. Move the head to point to new Node */
        head_ref = new_node;

        /*5. return to link it back */
        return head_ref;
    }



    public void display()
    {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static Node MergeList(Node a , Node b)
    {
        Node temp = new Node(0);
        Node res = temp;

        while(a != null && b != null)
        {
            if(a.data < b.data)
            {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;

            }
            else {
                temp.bottom = b ;
                temp = temp.bottom;
                b = b.bottom;
            }
        }

        if(a != null) temp.bottom = a;
        else temp.bottom = b;
        return res.bottom;


    }

    public static Node flatten(Node root)
    {

        if (root == null || root.next == null)
            return root;

        // recur for list on right
        root.next = flatten(root.next);

        // now merge
        root = MergeList(root, root.next);

        // return the root
        // it will be in turn merged with its left
        return root;
    }

    public static void main(String[] args) {

        Flatten_LinkedList L = new Flatten_LinkedList();
        // list 1->2->3->4->5
        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);

        L.head.next = L.push(L.head.next, 20);
        L.head.next = L.push(L.head.next, 10);

        L.head.next.next = L.push(L.head.next.next, 50);
        L.head.next.next = L.push(L.head.next.next, 22);
        L.head.next.next = L.push(L.head.next.next, 19);

        L.head.next.next.next
                = L.push(L.head.next.next.next, 45);
        L.head.next.next.next
                = L.push(L.head.next.next.next, 40);
        L.head.next.next.next
                = L.push(L.head.next.next.next, 35);
        L.head.next.next.next
                = L.push(L.head.next.next.next, 20);

        // Function call
        L.head = L.flatten(L.head);

        L.display();


    }


}
