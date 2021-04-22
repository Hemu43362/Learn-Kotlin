package String

fun main(args: Array<String>) {
    // String template expression is a piece of code which is evaluated and its result is returned into string
    // ** String templates starts with a dollar sign $ which consists either a variable name or
    // an arbitrary expression in curly braces.

    val name = "Hemant"

    // String template as variable name
    println("Hello! my name is $name")

    // String template as arbitrary expression in curly braces
    println("Hello! my full name is ${name.plus(" Patel")}")


}