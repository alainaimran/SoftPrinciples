Polymorphism Principle - SoftPrinciples Project (GRASP)

Introduction to GRASP Principles
GRASP (General Responsibility Assignment Software Patterns) is a set of OOP design principles that help developers assign responsibilities in object-oriented systems.

What Are GRASP Principles?
GRASP consists of 9 key principles used in Object-Oriented Design (OOD):

1. Information Expert
2. Creator
3. Controller
4. Polymorphism
5. Indirection
6. Protected Variations
7. Pure Fabrication
8. Low Coupling
9. High Cohesion

What is the Polymorphism Principle in GRASP?
The Polymorphism Principle in GRASP states:

Different objects can respond to the same request in different ways, reducing dependencies and making the system flexible.

Why is Polymorphism Important in GRASP?
- Reduces complex if-else conditions.
- Allows extensibility - new behaviors can be added without modifying existing code.
- Promotes low coupling - ensuring that different parts of the system don’t depend too much on each other.
- Encourages reusability - different classes can share a common interface.

Understanding Polymorphism with Examples
Polymorphism is the ability of different objects to respond to the same method call in different ways. This allows for more flexible and reusable code.

Example:
A single remote control can be used for a TV, an AC, or a Music System, but each device responds differently to the "Power" button.
- TV turns on/off.
- AC adjusts temperature.
- Music System starts/stops music.

In Java, Polymorphism allows 'one method' to be used across different classes with different behaviors.

There are two types of Polymorphism in Java:

1. Compile-time Polymorphism (Method Overloading): Same method name, different parameters.
2. Runtime Polymorphism (Method Overriding): Same method name and parameters, different behavior in child classes.

Compile-Time Polymorphism (Method Overloading)
Method Overloading allows multiple methods to have the same name but different parameters.

Example:
class Printer {
    void print(int number) {
        System.out.println("Printing number: " + number);
    }

    void print(String text) {
        System.out.println("Printing text: " + text);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);      // Calls method that prints a number
        p.print("Hello"); // Calls method that prints text
    }
}

Output:
Printing number: 10
Printing text: Hello

Why is This Useful?
- No need to remember multiple method names.
- Java automatically selects the correct method based on arguments.

Runtime Polymorphism (Method Overriding)
Method Overriding allows a child class to change the behavior of a method from the parent class.

Example:
class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine starting...");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starting...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.startEngine();  // Calls the overridden method in Car
    }
}

Output:
Car engine starting...

Why is This Better?
- No If-Else Conditions → Cleaner, readable code.
- Easier to Extend → Just create a new class for a new object.
- Java automatically selects the correct method at runtime.
- More reusable and scalable.

EXPLANATION OF CODE LINE BY LINE(WITH PRINCIPLE)
Line	                                        -Explanation
-package Polymorphism.withPrinciple;	        -Defines the package where this class belongs.
-class Animal	                                -The parent class that contains the makeSound() method.
-void makeSound()	                        -This method is overridden by child classes to provide specific sounds.
-class Dog extends Animal	                -The Dog class inherits from Animal and overrides makeSound().
-class Cat extends Animal	                -The Cat class inherits from Animal and overrides makeSound().
-class Cow extends Animal	                -The Cow class inherits from Animal and overrides makeSound().
-Animal myAnimal;	                        -A parent class reference that can point to different child objects.
-myAnimal = new Dog(); myAnimal.makeSound();	-Runtime Polymorphism: Calls the Dog version of makeSound().
-myAnimal = new Cat(); myAnimal.makeSound();	-Calls the Cat version of makeSound().
-myAnimal = new Cow(); myAnimal.makeSound();	-Calls the Cow version of makeSound().

EXPLANATION OF CODE LINE BY LINE(WITHOUT PRINCIPLE)
Line	                                        Explanation
-package Polymorphism.withoutPrinciple;	        -Defines the package where this class belongs.
-class AnimalSound	                        -Defines a class to handle animal sounds.
-void makeSound(String animalType)	        -A method that determines the animal's sound based on input.
-if (animalType.equals("Dog"))	                -Checks if the input is "Dog" and prints "Dog barks".
-else if (animalType.equals("Cat"))	        -Checks if the input is "Cat" and prints "Cat meows".
-else if (animalType.equals("Cow"))	        -Checks if the input is "Cow" and prints "Cow moos".
-else	                                        -If the input does not match any known animal, prints "Unknown animal sound".
-public class WithoutPrinciple	                -The main class that executes the program.
-AnimalSound sound = new AnimalSound();	        -Creates an object of the AnimalSound class.
-sound.makeSound("Dog");	                -Calls the method and passes "Dog" as an argument.

Final Summary:
Without Polymorphism: Uses if-else conditions, making it hard to maintain.
With Polymorphism: Uses method overriding, making it flexible and scalable.
