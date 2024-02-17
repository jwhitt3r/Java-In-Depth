# Week [1]: [OOP]

## Key Concepts

- **Objectives:** To understand a variety of different Data Structures and how to implement generics to maximise the efficiencies of them.

- **Core Concepts:**
    - Generics can provide flexibility
    - Interfaces allow for a loose coupling between components

## Hands-On Practice

- **Code Snippets:**
The following code snippet illustrates that while a Human and Parrot could share a superclass, if we were not in the capacity of providing strict class hierarchies we can use interfaces as a means of collecting the instantiated objects together to form some collection based on the ability of the objects satisfying the `speakable` interface.
```java
// Define a common interface with a shared functionality
interface Speakable {
    void speak();
}

// Implement the interface with different classes
class Human implements Speakable {
    public void speak() {
        System.out.println("Hello!");
    }
}

class Parrot implements Speakable {
    public void speak() {
        System.out.println("Squawk!");
    }
}

// Use generics to create a method that works with any Speakable objects
public <T extends Speakable> void makeItSpeak(List<T> speakables) {
    for (T speakable : speakables) {
        speakable.speak(); // This works because all T's are guaranteed to be Speakable
    }
}

// Now you can use the method with a list of any objects that implement Speakable
List<Speakable> mySpeakables = new ArrayList<>();
mySpeakables.add(new Human());
mySpeakables.add(new Parrot());

makeItSpeak(mySpeakables); // Both Human and Parrot instances can be used here
```

- **Projects:**
    - Review the workings of the three types of linked list:
      - Single
      - Double
      - Circular

## Challenges and Solutions

- **Challenges:**
    - Motivation on a difficult topic was tough, however, spending more time to understand the purpose of generics has been useful.
    - Did not want to look at more data structures for the time being.

- **Solutions:**
    - Spread the work across a few extra days and improve the understanding of the topic at hand in chunks.

## Reflection

- **What Went Well:**
    - Managed to get an understanding of generics within Java
    - Improved my understanding of generics further with a quiz, generics are **to provide compile-time type checking and eliminate the need for casting**

- **Areas for Improvement:**
    - Maintain motivation when struggling with interest...

## Additional Resources
N/A

## Future Focus

- **Key Takeaways:**
    - Interfaces allow for loose coupling based on behaviour
    - Superclasses can allow generic collections to maintain strong connectivity in relationships
    - Interfaces allow for type safety to be maintained when working with generics

- **Next Steps:**
    - N/A

## Personal Notes

- **Personal Observations:**
    - Generics allow for the ability to write a method once and have multiple different types to operate on it allowing for greater levels of flexibility
    - Type Safety is something that needs to be considered when working with generics in the future

- **Questions:**
    - N/A

