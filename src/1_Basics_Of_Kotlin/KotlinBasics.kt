package `1_Basics_Of_Kotlin`

/**
 *  A. Package
 *
 *  A package is a way to organize related kotlin files. It helps avoid naming conflicts.
 *
 *  you define a package at the top of a kotlin file.
 *
 *  If no package is defined the file belongs to the default package.
 *
 *
 *  B.Imports
 *
 *  The import keyword is used to import function and classes, and objects from other packages.
 *  You can use wildcard import (*) to import everything from a package.
 *  Kotlin automatically import some standard packages like kotlin.io, kotlin.math etc.
 *
 *  C. Comments in kotlin
 *
 *  Comments are ignore by the compiler and are used for documentation and explanation.
 *  Types of comments:
 *  Single line comment - //
 *  Multi-line comment - /* */
 *  KDoc comment used for documentation /** */
 *
 *
 *

 */

// 2. Entry point of the Program and print standard output.

/*fun main() {
     print("My name is singh")
     println("Android Developer")
     println("3 years of experience")
}*/

//3 . Variables lateinit and Data Types.

// Variables are used to store a value and value can be of type:
// val (Immutable) -> Read only,cannot be changed,
// val (Mutable) -> Can be changed.

/*
fun main() {

     val name ="Aman"

   //  name = "Shivam"

     println(name)


     var name2 = "Ro"

     name2 = "oR"

     println(name2)
}
*/

//4. lateinit used to initialize variables later
/*

fun main() {
     lateinit var name: String

     name = "Aman"

     println(name)
}

*/


//5.Standard Input
/*

fun main() {
     var  name = readln()
     println(name)
}


*/

//6. In kotlin collections are used to store and manipulate groups of data
//There are two main types of collections
//1.Immutable Collections
/*
List <T> Ordered Collection (duplicated allowed)
Set<T> Unique elements (unordered)
Map<K,V> Key value pair (unique keys)
 */

//2.Mutable Collections

/*
MutableList <T> Ordered Collection (duplicated allowed)
MutableSet<T> Unique elements (unordered)
MutableMap<K,V> Key value pair (unique keys)
 */

// Example:

/*fun main() {

     val fruits = mutableListOf("Apple","Banana","Cherry","Orange","Apple")
     println(fruits)
     println(fruits[1])
     println(fruits.size)

     // example of map
     val map = mutableMapOf("One" to 1,"Two" to 2,"Three" to 3)
     map.remove("One")
     print(map)
     println(map.get("One"))
}*/


//6. Operators

// Operators  in kotlin are special symbol used to perform operations on variables and values.

/*
Arithmetic -> +,-,*,/,%

Comparison -> ==,!=,>,<,>=,<=

Logical -> &&,||,!

Bitwise -> and,or,xor,inv,shl,shr,ushr

Assignment -> =,+=,-=,*=,/=,%=

Unary -> ++,--,-,+,!

Range -> ..,downTo,until,step
 */



















