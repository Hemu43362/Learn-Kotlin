package Basics

fun main(args: Array<String>) {
    //In Java
    //int value1 = 10;
    //long value2 = value1;  //Valid code

    //In Kotlin
    //var value1 = 10
    //val value2: Long = value1  //Compile error, type mismatch

    // Note : However in Kotlin, conversion is done by explicit
    // in which smaller data type is converted into larger data type and vice-versa.
    // This is done by using helper function.

    var value1 = 10.5
    println(value1)
    var value2: Int = value1.toInt()
    println(value2)

    //The list of helper functions used for numeric conversion in Kotlin is given below:
    //
    //toByte()
    //toShort()
    //toInt()
    //toLong()
    //toFloat()
    //toDouble()
    //toChar()

}