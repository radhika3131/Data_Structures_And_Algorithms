package com.dataStructures.LinkedListNew;

public class LengthLL {
    public static <T> int Length(InsertOperations<T> list)
    {
        // TC -> O(n)
        InsertOperations<T> .Node currentNode = list.headNode;
        int countLength = 0;

        while(currentNode != null)
        {
            countLength++;
            currentNode = currentNode.nextNode;
        }
       return  countLength;
    }

    public static void main(String[] args)
    {
        InsertOperations<String> list = new InsertOperations<>();
        list.insertAtEnd("This");
        list.insertAtEnd("list");
        list.insertAtEnd("is");
        list.insertAtEnd("Generic");
        list.printList();
        System.out.println("Length : " + Length(list));
    }
}
