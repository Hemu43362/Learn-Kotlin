package Function

fun main(args: Array<String>) {
    // Default Argument
    // with parameter
    println(myInfo("Hemant"))
    // without parameter
    println(myInfo())
    // function use default argument in case of not send any argument

    // Named Argument
    println(myContact(email = "hemant@hmail.com", phone = 9876543210))
    // order of argument is not important if you using named argument
}


// default argument
fun myInfo(name: String = "Anonymous"): String {
    return "Hey! my name is $name"
}

// name argument
fun myContact(phone: Long, email: String): String {
    return "my phone number is $phone and my email is $email"
}