package `7_Classes&Objects`

/*
 A class in kotlin is a blueprint for creating objects. It defines:

 Properties(Variables)
 Methods(Functions) that operate on those properties

Think of a class likes a car blueprint - it tells how the car should be built but isn;t an actual

 */

// Constructors in kotlin

// Primary

// Secondary

//init block

// Types of class in kotlin

// Data class

data class Animal(val name:String = "")

//Enum class used for defining constant values

enum class Day  {
    MONDAY,TUESDAY
}

fun main() {
    val today = Day.TUESDAY
    print(today)
}

// sealed class is like an enum but with more flexibility used for defining restricted hierarchy

sealed class Shape {
    class Circle(val radius:Double) : Shape()
    class Square(val width:Int,val height:Int) : Shape()
}

fun printShape(shape: Shape) {
    when(shape) {
        is Shape.Square -> println("Square with ${shape.width+shape.height}")
        is Shape.Circle -> println("Circle with ${shape.radius}")
    }
}

fun mainOne() {
    val shape = Shape.Circle(5.0)
    printShape(shape)
}

//Abstract class

// it cannot be instantiated can only be inherited
abstract class AnimalOne {
    abstract fun makeSound()
}

class Dog: AnimalOne() {
    override fun makeSound() {
        TODO("Not yet implemented")
    }

}

// Singleton object single instance crate only one instance

object Database {
    fun connect() {}

}

fun mainTwo() {
    Database.connect()
}