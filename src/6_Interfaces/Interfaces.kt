package `6_Interfaces`

/*

Interface is a blueprint for a class that defines what a class should do but not how.
similar to abstract class but:

 */

// How to crate a interface
interface Animal {
    fun makeSound()


}

interface Bird {
    fun flapLegs()
}

//Hwo to implement interface in class
class Dog: Animal {
    override fun makeSound() {
        //
    }

}


// Implement multiple interfaces
class Platypus: Bird, Animal {
    override fun flapLegs() {

    }

    override fun makeSound() {

    }

}

// Handling conflicts in interfaces

interface A {
    fun show() {
        print("Hello")
    }
}

interface B {
    fun show() {
        print("World")
    }
}

class C:A,B {
    override fun show() {
        super<A>.show() // explicity call A's method
    }
}