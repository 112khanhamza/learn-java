package com.dsa.linkedlist.practice;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node temp = head;
        // if there are no elements in the list
        if (temp == null) return;
        // if head is the one which you want to delete
        if (temp.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        // else, do something
        do {
            Node n = temp.next;
            if (n.value == val) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
