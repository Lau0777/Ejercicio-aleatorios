fun main(){

    var number : Double

    number= readln().toDouble()

    var conv = "%.2f".format(number)


    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter { it % 2 == 0 }

    println(evenNumbers)


    val strings = listOf("a", "b", "c", "d", "e")

    val uppercaseStrings = strings.map { it.toUpperCase() }

    println(uppercaseStrings)


    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val sum = numbers2.reduce { a, b -> a + b }

    println(sum)

    val s = "  hello world!  "

    val trimmedString = s.trim()

    println(trimmedString)


    val s2 = "a,b,c,d,e"

    val substrings = s2.split(",")

    println(substrings)


    val s3 = "hello world"

    val replacedString = s3.replace("hello", "goodbye")

    println(replacedString)


    val x = 10
    val y = 20

    val maximum = kotlin.math.max(x, y)
    val minimum = kotlin.math.min(x, y)

    println(maximum) // prints 20
    println(minimum)
}









