package Collections

fun main(args: Array<String>) {
    // To use the MutableList interface we use its function called
    // mutableListOf() or mutableListOf<E>().
    // It is mutable and its methods supports read and write both functionalities.

    // Example
    val friends = mutableListOf("Ankur", "Gurudatt", "Rajesh", "Jayesh", "Gurudatt")
    for (friend in friends) {
        println("hello! $friend")
    }
    println("********* after add element ********")
    friends.add("Rajesh")
    for (friend in friends) {
        println("hello! $friend")
    }


    //### Functions for MutableList

    // add(element: E): Boolean ->	It adds the given element to the collection.
    // add(index: Int, element: E)	It adds the element at specified index.
    // addAll(elements: Collection<E>): Boolean	-> It adds all the elements of given collection to current collection.
    // clear() -> It removes all the elements from this collection.
    // remove(element: E): Boolean	-> It removes the specified element if it present in current collection.
    // removeAll(elements: Collection<E>): Boolean	-> It removes all the elements from the current list which are also present in the specified collection.
    // removeAt(index: Int): E	-> It removes element at given index from the list.
    // set(index: Int, element: E): E	-> It replaces the element and add new at given index with specified element.
    // subList(fromIndex: Int,toIndex: Int): MutableList<E> -> It returns part of list from specified fromIndex (inclusive) to toIndex (exclusive) from current list

}