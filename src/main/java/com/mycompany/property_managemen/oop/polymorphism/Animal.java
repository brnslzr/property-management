package com.mycompany.property_managemen.oop.polymorphism;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class TestPolymorphism3 {
    public static void main(String[] args) {
        Animal a;
//        a = new Dog(); //eating bread...
//        a.eat();
        Dog dog = new Dog();
        dog.eat();

        a = new Cat();
        a.eat();
        a = new Lion();
        a.eat();
    }
}