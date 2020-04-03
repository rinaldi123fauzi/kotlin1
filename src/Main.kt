
fun getGreeting(): String?{
    return null
}

fun getGreeting2(): String = "Hello" //single expression function

fun sayHello(): Unit{
    println(getGreeting2())
}

fun sayHello2(itemToGreet:String){ //get params
    val msg = "Hello " + itemToGreet
    val msg2 = "Hello $itemToGreet"
    println(msg2)
}

fun sayHello3(itemToGreet:String) = println("Hello $itemToGreet") //single expression function

fun sayHello4(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet") //single expression function

fun sayHello5(greeting:String, itemToGreet:List<String>){
    itemToGreet.forEach{ itemToGreet->
        println("$greeting $itemToGreet")
    }
}


fun main(){
    println(getGreeting())
    sayHello()
    sayHello2("Guys")
    sayHello2("World")
    sayHello3("World")
    sayHello4("Hello", "World")

    // Collections
    print("\nCollections---------\n")

//    val interestingThings = arrayOf("Kotlin", "Programming")
    val interestingThings = listOf("Kotlin", "Programming")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
    sayHello5("Hi", interestingThings)

    val interestingThings2 = mutableListOf("Rinaldi")
    interestingThings2.add(" Fauzi")
    interestingThings2.forEach{
        print(it)
    }

    print("\n")

    for (interestingThing in interestingThings){
        println(interestingThing)
    }

    interestingThings.forEach {
        print(it)// "it" is default variable on forEach
    }

    print("\n")

    interestingThings.forEach { interestingThing ->
        print(interestingThing)
    }

    print("\n")

    interestingThings.forEachIndexed{ index, interestingThing ->
        print("$interestingThing is at index $index\n")
    }

    //Iteration
    print("\n\nIteration---------\n")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value")}

    print("\n")

    val map2 = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map2.put(4,"d")
    map2.forEach{ key, value -> println("$key -> $value")}

}