package String

fun main(args: Array<String>) {

    var name = "Hemant"

    //## String Functions

    // compareTo(other: String): Int	// It returns zero if current is equals to specified other object.
    println(name.compareTo("Hemant"))
    println(name.compareTo("hemant"))

    // plus(other: Any?): String     // It returns the concatenate string with the string representation of the given other string
    println(name.plus(" Patel"))

    // subSequence(startIndex: Int,endIndex: Int): CharSequence      // It returns the new character sequence from current character sequence, from startIndex to endIndex.
    println(name.subSequence(2, 4))

    // CharSequence.contains(other: CharSequence):Boolean      // It returns true if the character sequence contains the other specified character sequence.
    println(name.contains("ema")) // true
    println(name.contains("Ema", true))  // true
    println(name.contains("Ema", false)) // false

    // CharSequence.count(): Int       // It returns the length of char sequence.
    println(name.length)

    // String.drop(n: Int): String      // It returns a string after removing the first n character.
    println(name.drop(3))

    // String.dropLast(n: Int): String   // It returns a string after removing the last n character.
    println(name.dropLast(2))

    // CharSequence.elementAt(index: Int): Char        // It returns a character at the given index or throws an IndexOutOfBoundsException if the index does not exist in character sequence.
    println(name.elementAt(2))

    // CharSequence.indexOf(char: Char ): Int   //  It returns the index of first occurrence of the given character, starting from the given index value otherwise return -1.
    println(name.indexOf("man"))  //  2 -> H e man t
    println(name.indexOf("nam"))  // -1
    println(name.indexOf("MaN", ignoreCase = true))  // 2


    // CharSequence.trimMargin() : String      // Leading whitespace can be removed with trimMargin() function. By default, trimMargin() function uses | as margin prefix.
    val text = """Kotlin is official language  
    ^            announce by Google for  
    ^        android application development  
    """
    println(text)
    println(text.trimMargin("^"))


}