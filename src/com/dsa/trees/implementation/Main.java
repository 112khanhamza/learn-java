package com.dsa.trees.implementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.prettyDisplay();

        BinarySearchTree bst = new BinarySearchTree();
//        bst.populate(new int[] {5, 2, 7, 1, 4, 6, 9, 8, 3, 10});
        bst.populateSorted(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
        bst.display();
    }
}
