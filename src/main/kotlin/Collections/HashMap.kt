package Collections

fun main(args: Array<String>) {
    // Kotlin HashMap is class of collection based on MutableMap interface.
    // It store the data in the form of key and value pair.
    // It is represented as HashMap<key, value> or HashMap<K, V>.


    //# Constructors
    // HashMap()	-> It constructs an empty HashMap instance
    //HashMap(initialCapacity: Int, loadFactor: Float = 0f)	-> It is used to constructs a HashMap of specified capacity.
    //HashMap(original: Map<out K, V>)	-> It constructs a HashMap instance filled with contents of specified original map.


    //# Functions of Kotlin HashMap class
    // put(key: K, value: V): V?	-> It puts the specified key and value in the map
    // get(key: K): V?	-> It returns the value of specified key, or null if no such specified key is available in map
    // containsKey(key: K): Boolean	-> It returns true if map contains specifies key.
    // containsValue(value: V): Boolean	It returns true if map contains keys to specified value.
    // clear()	-> It removes all elements from map.
    // remove(key: K): V?	-> It removes the specified key and its corresponding value from map

    //# Examples
    val students: HashMap<Int, String> = HashMap()
    students.put(1, "Hemant")
    students.put(2, "Gurudatt")
    students.put(3, "Rajesh")
    students.put(4, "Ankur")
    students.put(5, "Jayesh")

    for (e in students) {
        // here e is Pair<Int,Value>
        println("key : ${e.key} value : ${e.value}")
    }

    println()
    for (e in students.keys) {
        // here e is key // Int
        println("key : ${e} value : ${students.get(e)}")
    }

    println()
    for (e in students.values) {
        // here e is key // Int
        println("value : $e")
    }

    println()
    println(students.containsKey(2))
    println(students.containsValue("Hemant"))
    students.remove(2)
    println(students.containsKey(2))

    println(students.size)
    students.clear()
    println(students.size)


}