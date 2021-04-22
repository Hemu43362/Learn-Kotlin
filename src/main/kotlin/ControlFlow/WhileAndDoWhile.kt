package ControlFlow

fun main(args: Array<String>) {
    // Syntax

    // while(condition){
    //  body of loop
    //   }
    println("while loop :")
    var num = 0
    while (num < 10) {
        println(num)
        num++
    }

    //  do{
    //    body of do block
    //     }
    // while(condition);
    println("do while loop :")
    var num2 = 0
    do {
        println(num2)
        num2++
    } while (num2 < 10)


}