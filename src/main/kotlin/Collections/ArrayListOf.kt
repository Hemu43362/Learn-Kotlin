package Collections

fun main(args: Array<String>) {

    // An arrayListOf() is a function of ArrayList class.
    // ArrayList is mutable which means it provides both read am write functionalities.
    // arrayListOf() function returns an ArrayList type.

    var arrList = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (e in arrList) {
        print("$e ")
    }

}