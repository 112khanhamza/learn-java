package com.dsa.linkedlist.practice;

public class DLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
         Node last = head;
         // reach on the last node
         while (last.next != null) {
             last = last.next;
         }
         Node node = new Node(val);
         node.next = null;
         node.prev = last;
         last.next = node;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        Node prevNode = get(index-1);
        Node node = new Node(val, prevNode.next, prevNode);
        prevNode.next.prev = node;
        prevNode.next = node;
    }

    private Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Printing in reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
