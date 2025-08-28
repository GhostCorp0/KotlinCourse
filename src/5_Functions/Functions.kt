package `5_Functions`

/*

  A block of code that performs specific tasks.
  function are reusable and can be called multiple times.
 */

//1. main function (Entry point )
/*
fun main() {

}*/

//2.User defined function
fun greet() {
    "Hello Shivam"
}

//3.Parameterized function
fun greet(name1:String,name2: String){
    println("Hello, $name1, Hello $name2 ")
}

//4. Unit returning function

fun run():Unit {
    println("I am running")
}

fun add(a:Int,b:Int) : Int{
    return a+b
}

//5. Single expression function
fun square(n:Int) = n*n  // no need for return keyword

fun mains() {
    println(square(5))
}


//6.Explicit return function
// when explicitly defined the return data type

fun addNumber(a:Int,b:Int) : Int{
    return a+b
}

//7. Generic function
//function can work with any type of data type

fun <T> printData(data:T) {
    println("Data: $data")
}

//8.Lambda function High order function
/*
   Lambda function: A function without a name,that can be assigned to a variable.

   //High order function :A function that takes another function as a parameter or returns one.

 */

//lambda function

val greet :(String) -> String = {name -> "Hello,$name"}

val greetOne :(String) -> String = {name -> "Hi $name"}

fun mainOne() {
    println(greet("Aman"))
}


// High order

fun greet(name:String,action:(String) -> String) :String{
    return action(name)
}


fun mainTwo() {
    val message = greet("Aman") {name -> "Hello $name"}
    println(message)
}


// Member function
// A function inside a class is called a member function
class Personal(val name:String) {
    fun introduce() {
        println("Hi, my name is $name")
    }
}


//Overriding function
//Used in inheritance when a subclass used a specific implementation of a function

open class Animal {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Dog: Animal() {


}

fun main() {
    val dog = Dog()
    dog.makeSound()
}





