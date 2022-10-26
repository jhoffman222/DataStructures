

/*
Linked List are the linear data structure
        - it is the collection of many nodes
        - node is the class
        - each node is linked with next node
        - in linked list we can traverse only in forward direction

        syntax
                    LinkedList<datatype> ll = new LinkedList<datatype>();

                          fot ex:-
                                 LinkedList<String> ll = new LinkedList<String>();
                                 LinkedList<Integer> ll = new LinkedList<Integer>();

     if you want to know more please refer to https://www.geeksforgeeks.org/linked-list-in-java/

 */


import java.util.*;
public class linkedlist {


    public static void main(String[] args) {

        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}
//                                      THANK YOU
