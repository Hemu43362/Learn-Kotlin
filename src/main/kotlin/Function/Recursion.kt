package Function

fun main(args: Array<String>) {

    // Syntax
    //  fun functionName(){
    //  functionName() //calling same function
    //    }

    var num = 0

    fun printNum() {
        println(num)
        if (num < 100) {
            num++
            printNum()
        }
    }

    printNum()
    println(getFact(9))
}

fun getFact(number: Int): Int {

    if (number == 1) {
        return number
    } else {
        return number * getFact(number - 1)
    }

}