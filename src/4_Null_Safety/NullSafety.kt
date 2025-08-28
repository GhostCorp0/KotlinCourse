package `4_Null_Safety`


/*
   We use 4 operators

   1.Safe call operator (?.)

   Access properties or call methods safely
   If variable is null, it returns null
 */

/*
fun main() {
    var name:String? = null
    println(name?.length)
}
*/


// 2. Elvis operator (?:)
// Used to provide a default value when the left hand side expression is null.
// If the left hand side expression is non null, it is returned.
// If the left hand side expression is  null then right side expression is returned.

/*
fun main() {
    var name:String? = null
    print(name?: "Naman ")
}*/


// 3.Not null assertion operator
/*
  Forces a nullable variable to be non-null
  if the variable is null then it throws a null pointer exception
  Use this operator only if absolute sure that variable is not null
 */

/*
fun main() {
    var name:String? = "aman"
    print(name!!)
}*/


// 4. Safe cast operator
//Used to safely cast a variable to a target type.
//If casting fails thrown null

/*
fun main() {
    val obj:Any = 42
    val str:String? = obj as? String // safe return null
    println(str)
}
*/

//5. Use of let with safe call operator
/*
   Used to execute a block of code only if it is not null
   ?. this checks if variable is null
   variable inside let is accessed using it.
 */

fun main() {
    var name:String? = "Aman"
    name?.let {
        println("name is $it")
    }
}








