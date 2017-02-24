package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/24/17.
 */
public class SinglyLinkedList<T>{

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public void add() {
    }

    public void remove() {
    }

    public boolean contains(Object o) {
        return false;
    }

    public int find(Object o) {
        return -1;
    }

    public int size() {
        return -1;
    }

    public <T> T get (int index) {
        return null;
    }

    public SinglyLinkedList sorty (SinglyLinkedList currentList) {
        return null;
    }

}


//    Implement a singly linked list:
//
//        You may not use the LinkedList or ArrayList class or any other predefined Java collections
//        Your linked list must have a node inner class to represent each element
//        Your linked list must have add, remove, contains, find, size, get, copy and sort methods
//        Method definitions:
//        add -- add an element to the list
//        remove -- remove an element (specified by numeric index) from the list
//        contains -- returns true if the element is in the list, false otherwise
//        find -- returns the element's index if it is in the list, -1 otherwise
//        size -- returns the current size of the list
//        get -- returns the element at the specified index
//        copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
//        sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library