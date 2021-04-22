package String

fun main(args: Array<String>) {
    // The String class represents an array of char types.
    // Strings are immutable which means the length and elements cannot be changed after their creation.

    // A String can be simply declared within double quote (" ") known as escaped string or
    // triple quote(""" """) known as raw string.

    val str1 = "Hello, World" //escaped String
    val str2 = """Welcome To my Repository"""  //raw String


    //## Properties of String

    // length: Int -> It returns the length of string sequence.
    // indices: IntRange ->	It returns the ranges of valid character indices from current char sequence.
    // lastIndex: Int -> It returns the index of last character from char sequence.

    var name = "Hemant"
    println(name.length)
    println(name.lastIndex)
    println(name.indices)


}