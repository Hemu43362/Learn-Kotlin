package Collections

fun main(args: Array<String>) {
    // ArrayList class is used to create a dynamic array
    // Which means the size of ArrayList class can be increased or decreased according to requirement.
    // ArrayList class provides both read and write functionalities.

    // Constructor of Kotlin ArrayList
    // ArrayList<E>()	-> It is used to create an empty ArrayList
    // ArrayList(capacity: Int)	-> It is used to create an ArrayList of specified capacity.
    // ArrayList(elements: Collection<E>)	-> It is used to create an ArrayList filled from the elements of collection.

    // Example
    val fruits = ArrayList<String>()
    fruits.add("Apple")
    fruits.add("Grapes")
    fruits.add("Mango")
    fruits.add("Papaya")
    fruits.add("Banana")

    for (fruit in fruits) {
        print("$fruit ")
    }

    print("\n")

    // traverse using iterator
    val iterator = fruits.iterator()
    while (iterator.hasNext()) {
        print("${iterator.next()} ")
    }

    // Some function of ArrayList
    // toArray(): Array<Any?>	-> It is used to return new array of type Array<Any?> with the elements of this collection.
    // toString(): String	-> It is used to returns a string representation of the object.

}