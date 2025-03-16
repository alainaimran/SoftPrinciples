/*
 * This program demonstrates a solution WITHOUT using Polymorphism.
 * It uses an if-else structure to determine the behavior of different animals.
 * This is not a good design because adding new animals requires modifying existing code.
 */

package Polymorphism.withoutPrinciple;

/**
 * The AnimalSound class determines the sound of an animal
 * based on its type using if-else conditions.
 */
class AnimalSound {
    /**
     * This method takes an animal type as input and prints its sound.
     * It uses if-else conditions to check which animal is making the sound.
     * 
     * @param animalType The type of the animal (e.g., "Dog", "Cat", "Cow").
     */
    void makeSound(String animalType) {
        if (animalType.equals("Dog")) {
            System.out.println("Dog barks");  // Output for Dog
        } else if (animalType.equals("Cat")) {
            System.out.println("Cat meows");  // Output for Cat
        } else if (animalType.equals("Cow")) {
            System.out.println("Cow moos");  // Output for Cow
        } else {
            System.out.println("Unknown animal sound");  // Default case
        }
    }
}

/**
 * The WithoutPrinciple class contains the main method to run the program.
 */
public class WithoutPrinciple {
    public static void main(String[] args) {
        // Create an instance of the AnimalSound class
        AnimalSound sound = new AnimalSound();

        // Call the makeSound() method with different animal types
        sound.makeSound("Dog");  // Expected output: "Dog barks"
        sound.makeSound("Cat");  // Expected output: "Cat meows"
        sound.makeSound("Cow");  // Expected output: "Cow moos"
    }
}
