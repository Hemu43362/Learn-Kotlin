package String

fun main(args: Array<String>) {
    // Kotlin has two types of string literals:
    //  * Escaped String
    //  * Raw String

// ## Escaped String

    // Here is a list of escape characters supported in Kotlin:
    //  \t - Inserts tab
    //  \b - Inserts backspace
    //  \n - Inserts newline
    //  \r - Inserts carriage return
    //  \' - Inserts single quote character
    //  \" - Inserts double quote character
    //  \\ - Inserts backslash
    //  \$ - Inserts dollar character

    println("Hemant\tHemant\bHemant\nHemant\rHemant\'Hemant\"Hemant\\Hemant\$Hemant")


// ## Raw String
        // Row String is declared within triple quote (""" """).It provides facility to declare String in new lines and contain multiple lines.
        // Row String cannot contain any escape character.

        println(""" Hey Everyone! 
            |           I am Hemant Patel,
            |              Currenly I am Learning Kotlin Language.     
        """.trimMargin())





}