package Collections

fun main(args: Array<String>) {
    // Map interface holds data in the form of key and value pair.
    // Map key are unique and holds only one value for each key
    // he key and value may be of different pairs such as <Int, Int>,<Int, String>, <Char, String>etc
    // It is immutable, fixed size and its methods support read only access.

    // To use the Map interface we need to use its function called
    // mapOf() or mapOf<k,v>().

    // Example
    var myMap = mapOf<Int, String>(1 to "Hemant", 2 to "Patel", 3 to "HemantPatel")

    for (e in myMap) {
        // here "e" is a pair of key and value
        println("key is : ${e.key} and value is : ${e.value}")
    }

    println("")

    for (e in myMap.keys) {
        // here "e" is a key
        println("key is : $e and value is : ${myMap[e]}")
    }

    println("")

    for (e in myMap.values) {
        // here "e" is a value
        println("value is : $e")
    }


    //# Functions

    // getValue(key: K): V	-> It returns a value of given key or throws an exception if no such key is available in the map.

    // contains(key: K): Boolean -> It checks is the given key contains in map.
    println(myMap.contains(1))

    // containsKey(key: K): Boolean -> If map contains the specified key it returns true.
    println(myMap.containsKey(1))

    // containsValue(Value: V): Boolean -> If map contains the specified Value it returns true.
    println(myMap.containsValue("Hemant"))

    // getOrDefault(key: K,defaultValue: V): V	-> It returns the value which is given by key in mapped, or returns default value if map dose not contains mapping for the given key.
    println(myMap.getOrDefault(1, "HEMANT_PATEL"))
    println(myMap.getOrDefault(9, "HEMANT_PATEL"))

    println("")

    // iterator(): Iterator<Entry<K, V>> -> It returns an Iterator over the entries in the Map.
    var iterator = myMap.iterator()
    while (iterator.hasNext()) {
        val pair = iterator.next()
        println("key : ${pair.key} and value : ${pair.value}")
    }

    println("")

    // minus(key: K): Map -> It returns a map which contains all the entries of original map except the entry of mention key.
    val minusMap = myMap.minus(3)
    for (e in minusMap.keys) {
        // here "e" is a key
        println("key is : $e and value is : ${minusMap[e]}")
    }

    println("")

    // plus(pair: Pair<K, V>): Map<K, V> -> It creates a new read only map by adding or replacing an entry to current map from a given key-value pair.
    val plusMap = myMap.plus(Pair(4, "PATEL"))
    for (e in plusMap.keys) {
        // here "e" is a key
        println("key is : $e and value is : ${plusMap[e]}")
    }


}