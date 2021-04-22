package Array

fun main(args: Array<String>) {

    // Kotlin Array can be created using arrayOf(),
    // intArrayOf(), charArrayOf(), booleanArrayOf(),
    // longArrayOf(), shortArrayOf(), byteArrayOf() functions.

    var myArray1 = arrayOf(1, 10, 4, 6, 15)
    var myArray2 = arrayOf<Int>(1, 10, 4, 6, 15)
    var myArray3 = intArrayOf(1, 10, 4, 6, 15)
    var myArray4 = arrayOf<String>("Ajay", "Prakesh", "Michel", "John", "Sumit")
    var myArray5 = arrayOf(1, 10, 4, "Ajay", "Prakesh")


    // access elements of array
    println(myArray1[1])
    println(myArray1.get(1))

    // modify elements of array
    myArray1[1] = 35
    println(myArray1[1])
    myArray1.set(1,95)
    println(myArray1.get(1))


    // traverse elements of array
    for (e in myArray1)
        print("$e ")

    println()

    // traverse by using index
    for(i in 0..(myArray1.size-1))
        print("${myArray1[i]} ")
}