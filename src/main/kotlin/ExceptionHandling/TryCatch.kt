package ExceptionHandling

import java.lang.NullPointerException

fun main(args: Array<String>) {

    // Syntax try catch

    //     try {
    //           code that may throw exception
    //       } catch(e: SomeException) {
    //           code that handles exception  // execute when error occur
    //       } finally {
    //           optional finally block       // execute always
    //       }

    try {
        println("starting of try block")
        val data = 20 / 0   //may throw exception
        println("end of try block")
    } catch (e: Exception) {
        println("this is catch block with error : ".plus(e))
    } finally {
        println("this is finally block")
    }


    // try block as an Expression
    var x = try {
        20 / 0
    } catch (e: Exception) {
        "Infinite"
    }
    println(x)


    // multiple catch block
    //** Note : At a time only one exception is occured and at a time only one catch block is executed.

    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    } catch (e: ArithmeticException) {
        println("arithmetic exception catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outofbounds exception")
    } catch (e: Exception) {
        println("parent exception class")
    }
    println("code after try catch...")
}

