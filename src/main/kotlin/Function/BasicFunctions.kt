package Function

fun main(args: Array<String>) {
    // Function is a group of inter related block of code which performs a specific task.
    // It makes reusability of code and makes program more manageable.

    // In Kotlin, functions are declared using fun keyword.
    // There are two types of functions depending on whether it is available in standard library or defined by user.
    //
    // Standard library function
    // User defined function

    // Standard Library : there are many standard (preDefined) functions like main(), sqrt(), print() etc.
    // User Defined Library : User defined function is a function which is created by user

    // Syntax for creating function
    //  fun functionName(param1: DataType, param2: DataType ....): DataTypeOfReturnValue{
    //       body of function
    //     }

    // Syntax for calling function
    // functionName(value1, value2 ....)

    fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    println(sum(3,5)) // 8


}