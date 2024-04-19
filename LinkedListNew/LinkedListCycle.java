package com.dataStructures.LinkedListNew;

public class LinkedListCycle {
    public class ListNode {
        public int data;
        ListNode nextNode;
    }

    public ListNode headNode;
    public int size;

    // helper function to check if list is empty or not
    public boolean isEmpty() {
        return headNode == null;
    }

    // Insert new data at the start of the linkedList
    public void insertAtHead(int data) {
        // Creating a newNode and assigning it the new data value
        ListNode newNode = new ListNode();
        newNode.data = data;

        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    // Helper function to printList
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        ListNode temp = headNode;
        System.out.println("List : ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }

        System.out.println("null");
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.nextNode == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.nextNode;

        while (slow != fast) {
            if (fast == null || fast.nextNode == null) {
                return false; // Reached end of list, no cycle
            }
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }

        return true; // Cycle detected
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();
        // Created linked list: 10 -> 15 -> 4 -> 20
        list.insertAtHead(20);
        list.insertAtHead(4);
        list.insertAtHead(15);
        list.insertAtHead(10);

        // Create a cycle for testing
        list.headNode.nextNode.nextNode.nextNode = list.headNode;

        System.out.println("Is there any cycle in linked list: " + list.hasCycle(list.headNode));
    }
}
