package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        //myDLL.printList();

        myDLL.append(5);
        myDLL.append(7);
        myDLL.printList();
        myDLL.removeLast();
        myDLL.printList();



    }

}

