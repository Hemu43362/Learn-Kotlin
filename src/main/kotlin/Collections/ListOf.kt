package Collections

fun main(args: Array<String>) {
    // To use the List interface we need to use its function called
    // listOf() or listOf<E>().
    // It is immutable and its methods supports only read functionalities.


    // Example
    val friends = listOf("Ankur", "Gurudatt", "Rajesh", "Jayesh", "Gurudatt")
    for (friend in friends) {
        println("hello! $friend")
    }


    //### Functions for List

    // contains(element: E): Boolean ->	It checks specified element is contained in this collection.
    println(friends.contains("Rajesh"))

    // containsAll(elements: Collection<E>): Boolean ->	It checks all elements specified are contained in this collection.
    val fList = listOf("Ankur", "Rajesh")
    println(friends.containsAll(fList))

    // get(index: Int): E -> It returns the element at given index from the list.
    println(friends.get(0))

    // indexOf(element: E): Int -> Returns the index of first occurrence of specified element in the list, or -1 if specified element is not present in list.
    println(friends.indexOf("Jayesh"))

    // lastIndexOf(element: E): Int	It returns the index of last occurrence of specified element in the list, or return -1 if specified element is not present in list.
    println(friends.lastIndexOf("Gurudatt"))

    // isEmpty(): Boolean -> It returns the true if list is empty, otherwise false.
    println(friends.isEmpty())

    //  subList(fromIndex: Int, toIndex: Int): List ->	It returns a part of list between fromIndex (inclusive) to toIndex (exclusive).
    val fList2 = friends.subList(1, 3)
    println(fList2.toString())

    // there are many functions .........

}