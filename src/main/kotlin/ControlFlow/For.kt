package ControlFlow

fun main(args: Array<String>) {
    // Syntax For
    //  for (item in collection){
    //       body of loop
    //    }


    val marks = arrayOf(80, 85, 60, 90, 70)
    for (item in marks) {
        println(item)
    }

    //If the body of for loop contains only one single line of statement, it is not necessary to enclose within curly braces {}.
    val marks2 = arrayOf(80, 85, 60, 90, 70)
    for (item in marks)
        println(item)


    // ** The elements of an array are iterated on the basis of indices (index) of array.
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in arr.indices)
        println(arr[i])

    // we can use range also
    for (i in 0..10)
        print("$i ")


}