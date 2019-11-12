package edu.jcourse.lesson2.datatypes.Lesson5;

public class OopMain {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.setName("Abstract Animal");
        animal.sayHello();

        Animal cat =new Cat("Pushok",10);
        cat.setName("Pushok");
        cat.setAge(10);
        cat.sayHello();
        cat.printAge();

        Dog dog=new Dog("Sharik",5);
        dog.setName("Sharik");
        dog.setAge(5);
        dog.sayHello();
        dog.printAge();

        System.out.println(animal);
        System.out.println(cat);
    }
}
