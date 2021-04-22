package Function

fun main(args: Array<String>) {
    //High order function (Higher level function) is a function which accepts
    // function as a parameter or
    // returns a function or
    // can do both

    // lambda function can be pass as parameter
    val myLambdaPrinter = { num: Int -> println("<--$num-->") }

    // higher order (higher level) function which takes parameter of function
    fun printSum(a: Int, b: Int, lambdaPrinter: (Int) -> Unit) {
        lambdaPrinter(a + b)
    }
    printSum(4, 7, myLambdaPrinter)

}
