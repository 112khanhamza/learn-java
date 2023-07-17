package com.fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setName("Hamza");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());

    }
}

class Demo {
    private String name;

    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }
}
