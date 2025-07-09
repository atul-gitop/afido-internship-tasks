// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Method Overriding
    @Override 
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
       animal.sound();  // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.sound();            // Output: Dog barks

        // Polymorphism
        Animal animalDog = new Dog();
        animalDog.sound();      // Output: Dog barks
    }
}
