package com.technicalQuestions;

public class LinkedList {

    Node head;

    static class Node {
        int val;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { val = d; }
    }

    public LinkedList() {
    }

    public LinkedList(int i) {
        Node head = new Node(i);
        this.head = head;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList(int[] values){
        Node node = new Node(values[0]);
        this.head = node;
        for(int i = 1; i < values.length; i++){
            node.next = new Node(values[i]);
            node= node.next;
        }
    }

    public void setHead(int i) {
        this.head = new Node(i);
    }

    public String printList()
    {
        Node currNode = this.head;

        String results = "LinkedList: ";

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            results += (currNode.val + " ");

            // Go to next node
            currNode = currNode.next;
        }
        return results;
    }

}
