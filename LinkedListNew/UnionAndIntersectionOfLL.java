package com.dataStructures.LinkedListNew;

import com.dataStructures.LinkedList.IntersectionOfTwoLL;

public class UnionAndIntersectionOfLL {

    //Tc - O(n+m)
    public  static <T> InsertOperations<T> Union(InsertOperations<T> list1 , InsertOperations<T> list2)
    {
        if(list1.isEmpty())
        {
            return list2;
        }
         if(list2.isEmpty())
         {
             return list1;
         }

         // to get the last element , traverse till last
        InsertOperations.Node last = list1.headNode;
         while(last.nextNode != null)
         {
             last = last.nextNode;
         }
         // connect two another list
        last.nextNode = list2.headNode;

         // remove any duplicates
        list1.deleteDuplicates(list1.headNode);

        return list1;
    }

    public static <T> boolean Contains(InsertOperations<T> list , T value)
    {
        InsertOperations<T> .Node current = list.headNode;
        while(current != null)
        {
            if(current.data == value)
            {
                return true;
            }
            current = current.nextNode;
        }
        return false;

    }

    // complexity for intersection will be O(n×m) because we traverse list1 in a loop which isO(n)
    // and in each iteration, we call contains() which runs is O(m)

    public static <T> InsertOperations <T> intersection(InsertOperations<T> list1 , InsertOperations<T> list2)
    {
        InsertOperations<T> result = new InsertOperations<>();

        if(list1.isEmpty())
        {
            return result;
        }
        if(list2.isEmpty())
        {
            return result;
        }

        InsertOperations<T> .Node current = list1.headNode;

        while(current != null)
        {
            if(Contains(list2 , current.data))
            {
                result.insertAtHead(current.data);
            }
            current = current.nextNode;
        }

        result.deleteDuplicates(result.headNode);
        return result;
    }

    public static void main(String args[]) {
        InsertOperations < Integer > list1 = new InsertOperations<Integer>() ;
        for (int i = 7; i > 3; i--) {
            list1.insertAtHead(i);
        }
        System.out.print("1st ");
        list1.printList();
        InsertOperations < Integer > list2 = new InsertOperations<Integer>() ;
        for (int i = 0; i < 5; i++) {
            list2.insertAtHead(i);
        }
        System.out.print("2nd ");
        list2.printList();
        System.out.print("After Intersection ");
        intersection(list1, list2).printList();
        System.out.print("After Union ");
        Union(list1, list2).printList();
    }
}
