package NullSafety

fun main(args: Array<String>) {
    // Nullable Types and NotNullableTypes
    // Nullable types are declared by putting a ? behind the String as:

    var str1: String? = "hello"
    str1 = null // ok

    var str2: String = "hello"
    // str2 = null // compile error  : Kotlin: Null can not be a value of a non-null type String

    // Normally,types of String are not nullable. To make string which holds null value,
    // we have to explicitly define them by putting a ? behind the String as: String?


}