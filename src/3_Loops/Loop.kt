package `3_Loops`


/*
  In kotlin loops are used to execute a block of code repeatedly.
  Kotlin provides the following types of loops:
 */

// 1. For loop used to iterate over a range , array list or any iterable object.
// for(variable in range/collection) {
//         // Code to execute in each iteration
// }

// 1.Example
/*fun main() {

    for(j in 1..10){

        println(j)

    }

}*/

//2.Example

/*fun main() {
    val fruits = listOf("Apple","Banana","Orange")
    for(fruit in fruits) {
        println(fruit)
    }

}*/

// While loop
//Used to execute a loop of code as long as a condition is true.

fun main() {
    var number = 10
    while(number >5) {
        println("Aman")
        number--
    }
}
