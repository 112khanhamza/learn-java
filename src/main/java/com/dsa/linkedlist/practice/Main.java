package com.dsa.linkedlist.practice;

public class Main {

    public static void main(String[] args) throws Exception {
//        LL list = new LL();
//        list.insertFirst(1);
////        list.insert(10, 10);
//        list.insertFirst(2);
//        list.insertFirst(3);
//
//        list.insertLast(4);
//        list.display();
//
//        list.insert(5, 2);
//        list.display();
//
//        list.insert(7, 4);
//
//        list.display();
//
//        System.out.println("Deleted First: " + list.deleteFirst());
//
//        list.display();
//
//        System.out.println("Deleted Last: " + list.deleteLast());
//
//        list.display();
//
//        System.out.println("Deleted at index: " + list.delete(1));
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
////        list.display();
//        list.insertLast(10);
//        list.display();
//        list.insert(99, 3);
//        list.display();

//        CLL list = new CLL();
//        list.insert(3);
//        list.insert(5);
//        list.insert(7);
//        list.insert(9);
//        list.display();

        LL list = new LL();
        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(7);
        list.insertLast(9);
        list.display();
        list.reverse();
        list.display();
    }
}
