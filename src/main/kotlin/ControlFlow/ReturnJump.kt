package ControlFlow

fun main(args: Array<String>) {
    //There are three jump expressions in Kotlin
    //* break   -> A break expression is used for terminate the nearest enclosing loop
    //* continue
    //* return

    println("break: ")
    for (i in 1..10){
        if (i == 6) break
        print("$i ")
    }

    println("\nContinue: ")
    for (i in 1..10){
        if (i == 6) continue
        print("$i ")
    }

    println("\nReturn: ")
    for (i in 1..10){
        if (i == 6) return
        print("$i ")
    }

    println("complete")



}