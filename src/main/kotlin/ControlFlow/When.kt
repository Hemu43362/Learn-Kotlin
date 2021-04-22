package ControlFlow

fun main(args: Array<String>) {
    // when is same as switch of c++/JAVA and others language.
    var x = 4
    when (x) {
        1 -> println("value of x is : 1")
        2 -> println("value of x is : 2")
        3 -> println("value of x is : 3")
        4 -> println("value of x is : 4")
        5 -> println("value of x is : 5")
        else -> println("value of x is not in range of 1..5")
        //else is same as default of other language
    }


    // we can direct assign value by when
    var result = when (x) {
        1 -> "value of x is : 1"
        2 -> "value of x is : 2"
        3 -> "value of x is : 3"
        4 -> "value of x is : 4"
        5 -> "value of x is : 5"
        else -> "value of x is not in range of 1..5"
        //else is same as default of other language
    }
    println(result)


    // We can use multiple branches of condition separated with a comma.
    // It is used, when we need to run a same logic for multiple choices.

    var z = 6
    var output = when (z) {
        0, 2, 4, 6, 8, 10 -> "z is even number in range of 0 to 10"
        1, 3, 5, 7, 9 -> "z is odd number in range of 0 to 10"
        else -> "number is not in range of 0 to 10"
    }
    println(output)

    // we can use Range in inside the when
    var num = 12
    when (num) {
        in 0..10 -> println("num is in between 0 to 10")
        in 11..20 -> println("num is in between 11 to 20")
        else -> println("num is greater than 20")
    }

}