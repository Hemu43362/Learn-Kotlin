package ControlFlow

fun main(args: Array<String>) {
    // Syntax : If

    // if(condition){
    //   //code statement
    // }

    if (5 > 4) {
        println("5 is greater than 4")
    }

    if (4 > 5) {
        println("4 is greater than 5")
    }

    // Syntax : If, Else If, Else

    // if (condition) {
    //     //code statement
    //    } else {
    //     // code statement
    //    }


    if (3 > 4) {
        println("3 is greater than 5")
    } else if (6 > 5) {
        println("6 is greater than 5")
    } else {
        println("4 is greater than 5")
    }


    // you can assign value by if else condition
    var x = if (2 > 3) {
        "2 is greater than 3"
    } else {
        "2 is less than 3"
    }
    println(x)

    //We can remove the curly braces of if-else body by writing if expression in only one statement.
    val y = if (2 > 3) "2 is greater than 3" else "2 is less than 3"
    println(y)

}