package Basics

fun main(args: Array<String>) {
    var a = 10;
    var b = 5;

    //Arithmetic Operator
    println(a + b);
    println(a - b);
    println(a * b);
    println(a / b);
    println(a % b);

    //Relation Operator
    println(a > b);
    println(a < b);
    println(a <= b);
    println(a >= b);
    println(a == b);
    println(a != b);

    //Assignment operator
    a += b  // a = a + b
    println(a)
    a -= b  // a = a + b
    println(a)
    a *= b  // a = a * b
    println(a)
    a /= b  // a = a / b
    println(a)
    a %= b  // a = a % b
    println(a)

    //Logical Operator
    println(true && false)
    println(true || false)
    println(!true)

}