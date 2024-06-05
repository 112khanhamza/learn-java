package com.dsa.linkedlist.practice;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (head.next == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        // If there is no element in the list
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) throws Exception {
        if (index > size) throw new Exception("Index out of Bounds");
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node prevNode = get(index);
        Node node = new Node(val, prevNode.next);
        prevNode.next = node;
        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.value;
        Node secondLast = get(size-2);
        secondLast.next = null;
        tail = secondLast;
        size--;

        return val;
    }

    public int delete(int index) throws Exception {
        if (index >= size) throw new Exception("Index out of Bounds");
        if (index == 0) return deleteFirst();
        if (index == size-1) return deleteLast();

        Node prevNode = get(index-1);
        int val = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        size--;
        return val;
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
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
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

    public static void main(String[] args) {
        LL list = new LL();
        LL list2 = new LL();
        list.insertLast(1);
        list.insertLast(3);
        list.insertLast(5);

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);

        LL merged = merge(list, list2);
        merged.display();
    }

    // questions

    // recursion reverse
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in place reversal of linked list
    // https://leetcode.com/problems/reverse-linked-list/
    public void reverse() {
        if (size < 2) return;
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;
        LL merged = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                merged.insertLast(f.value);
                f = f.next;
            } else {
                merged.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            merged.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            merged.insertLast(s.value);
            s = s.next;
        }
        return merged;
    }




}
