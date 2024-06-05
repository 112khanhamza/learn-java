package com.testing;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        A.B b1 = new A.B("Alice");
        A.B b2 = new A.B("Bob");
        A.B b3 = new A.B("Charlie");

        A a1 = new A(Arrays.asList(b1, b2));
        A a2 = new A(Collections.singletonList(b3));

        Map<String, A> map = new HashMap<>();
        map.put("key1", a1);
        map.put("key2", a2);

        final Optional<A.B> alice = getName(map, "Alice");
        System.out.println(alice.isPresent() ? alice.get() : "Not Present");
    }

    public static Optional<A.B> getName(Map<String, A> map, String name) {
        return map.values().stream()
                .flatMap(a -> a.getbList().stream())
                .filter(a -> a.getName().equals(name))
                .findFirst();
    }
}
