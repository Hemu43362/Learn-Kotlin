package NullSafety

fun main(args: Array<String>) {

    // Elvis operator (?:) is used to return the not null value even the conditional expression is null.
    // It is also used to check the null safety of values.

    var str: String? = null
    var len1: Int = if (str != null) str.length else -1
    println("Length of str is ${len1}")

    // The above if . . . else operator can be expressed using Elvis operator as bellow:
    var len2: Int = str?.length ?: -1
    println("Length of str is ${len2}")

    // Elvis operator returns expression left to ?: eg. (str?. length) if it is not null
    // otherwise it returns expression right to ?: eg. -1

}