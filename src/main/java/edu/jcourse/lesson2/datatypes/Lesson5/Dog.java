package edu.jcourse.lesson2.datatypes.Lesson5;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(getName() + " says gav-gav");

    }
}

