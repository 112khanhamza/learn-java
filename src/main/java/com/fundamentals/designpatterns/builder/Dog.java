package com.fundamentals.designpatterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
