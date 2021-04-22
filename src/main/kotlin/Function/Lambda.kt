package Function

fun main(args: Array<String>) {
    // Lambda is a function which has no name.
    // Lambda is defined with a curly braces {} which takes variable as a parameter (if any) and body of function.
    // The body of function is written after variable (if any) followed by -> operator.

    // Syntax of Lambda
    // { variable -> body_of_function}

    // lambda function for Print with pattern design
    val myLambdaPrinter = { num: Int -> println("<--$num-->") }

    printSum(8, 3, myLambdaPrinter)
}

// Now we want a function we take two number and print those sum by lambdaPrinter
// so we make function here which take two number and also lambda Function as parameter
fun printSum(a: Int, b: Int, lambdaPrinter: (Int) -> Unit) {
    lambdaPrinter(a + b)
}
// printSum is high level function,which take lambda as parameter