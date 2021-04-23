package NullSafety

fun main(args: Array<String>) {

    // Sometime it is not possible to cast variable and it throws an exception, this is called as unsafe cast.


    // Examples

    // A nullable string (String?) cannot be cast to non nullabe string (String), this throw an exception.
    val str: String? = null
    val str1: String = str as String
    // Error : kotlin.TypeCastException: null cannot be cast to non-null type kotlin.String


    // While try to cast integer value of Any type into string type lead to generate a ClassCastException.
    val num: Int = 123
    val str2: String = num as String
    // Throws java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String



    // Kotlin provides a safe cast operator as? for safely cast to a type.
    // It returns a null if casting is not possible rather than throwing an ClassCastException exception.

    // Examples

    val num1: Int = 123
    val str3 = num1 as? String
    println(str3)  // null


}