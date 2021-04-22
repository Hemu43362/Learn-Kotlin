package ExceptionHandling

fun main(args: Array<String>) {

    //  Kotlin throw keyword is used to throw an explicit exception.
    //  It is used to throw a custom exception.

    //   Syntax of throw keyword
    //   throw SomeException()

    validate(21)
    validate(14)


}

fun validate(age: Int) {
    if (age < 18)
        throw ArithmeticException("under 18 year person not allowed!")
    else
        println("$age is eligible for drive")
}