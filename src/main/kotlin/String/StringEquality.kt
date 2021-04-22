package String

fun main(args: Array<String>) {

    // strings equality comparisons are done on the basis of
    // structural equality (==) and  // It's work on value
    // referential equality (===).   // It's work on address

    //* In structural equality two objects have separate instances in memory but contain same value.
    //* Referential equality specifies that two different references point the same instance in memory.


    // Structural equality (==)
    val str1 = "Hello, World!"
    val str2 = "Hello, World!"

    println(str1 == str2) //true
    println(str1 != str2) //false

    // Referential equality (===)
    val str3 = "Hello, World!"
    val str4 = "Hello, World!"
    val str5 = str3

    println(str3 === str4) //true
    println(str3 !== str4) //false
    println(str3 === str5) //true


}