/*
 * This program demonstrates the concept of Polymorphism.
 * Instead of using if-else conditions, we use method overriding.
 * Each animal class provides its own version of the makeSound() method.
 */

package Polymorphism.withPrinciple;

/**
 * Parent class: Animal
 * Defines a generic makeSound() method that will be overridden in child classes.
 */
class Animal {
    /**
     * This method is defined in the parent class.
     * It will be overridden by child classes to provide specific behavior.
     */
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

/**
 * Child class: Dog
 * Inherits from Animal and overrides the makeSound() method.
 */
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");  // Specific behavior for Dog
    }
}

/**
 * Child class: Cat
 * Inherits from Animal and overrides the makeSound() method.
 */
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");  // Specific behavior for Cat
    }
}

/**
 * Child class: Cow
 * Inherits from Animal and overrides the makeSound() method.
 */
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos");  // Specific behavior for Cow
    }
}

/**
 * Main class: WithPrinciple
 * Demonstrates Polymorphism by calling the makeSound() method on different animal objects.
 */
public class WithPrinciple {
    public static void main(String[] args) {
        // Declaring a variable of type Animal (Parent class reference)
        Animal myAnimal;

        // Assigning a Dog object to the Animal reference
        myAnimal = new Dog();
        myAnimal.makeSound();  // Output: "Dog barks"

        // Assigning a Cat object to the Animal reference
        myAnimal = new Cat();
        myAnimal.makeSound();  // Output: "Cat meows"

        // Assigning a Cow object to the Animal reference
        myAnimal = new Cow();
        myAnimal.makeSound();  // Output: "Cow moos"
    }
}
