package com.fundamentals.designpatterns.builder;

public class Dog {
    private final String gender;
    private final String breed;
    private String name;
    private double price;
    private int age;

    public Dog(Builder builder) {
        this.gender = builder.gender;
        this.breed = builder.breed;
        this.name = builder.name;
        this.price = builder.price;
        this.age = builder.age;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAge() {
        return age;
    }

    private Dog setName(String name) {
        this.name = name;
        return this;
    }

    private Dog setPrice(double price) {
        this.price = price;
        return this;
    }

    private Dog setAge(int age) {
        this.age = age;
        return this;
    }

    public static class Builder {
        private String gender;
        private String breed;
        private String name;
        private double price;
        private int age;

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }
}
