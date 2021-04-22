package Basics

fun main(args: Array<String>) {
    println("Enter your name")
    val name = readLine()

    println("Enter your age")
    var age: Int = Integer.valueOf(readLine())

    println("Your name is $name and your age is $age")
}