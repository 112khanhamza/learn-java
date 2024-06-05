package com.testing;

import java.util.List;

public class A {
    private List<B> bList;

    public A(List<B> bList) {
        this.bList = bList;
    }

    public List<B> getbList() {
        return bList;
    }

    public void setbList(List<B> bList) {
        this.bList = bList;
    }

    @Override
    public String toString() {
        return "A{" +
                "bList=" + bList +
                '}';
    }

    static class B {
        private String name;

        public B(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "B{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
