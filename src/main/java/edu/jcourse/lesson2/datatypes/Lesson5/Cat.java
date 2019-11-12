package edu.jcourse.lesson2.datatypes.Lesson5;


public class Cat extends Animal {
    public Cat(String name,int age)
    {
        super(name,age);
    }
        @Override
        public void sayHello() {
            System.out.println(getName() + " says Meow");

        }

    }

