package NullSafety

fun main(args: Array<String>) {

    var str1 : String? = "Hello"
   // println(str1.length) // compile error

    if (str1 != null) {  // -> smart cast
        println(str1.length)  // -> It works now!
    }



    // While using is or !is for checking the variable,
    // the compiler tracks this information and internally cast the variable to target type.
    // This is done inside the scope if is or !is returns true.

    var str2 : String? = "Hemant"

    if (str2 is String){
        // No Explicit Casting needed.
        println(str2.length)
    }

    if (str2 !is String){
        println("str2 is not string")
    }else{
        // No Explicit Casting needed.
        println(str2.length)
    }

}