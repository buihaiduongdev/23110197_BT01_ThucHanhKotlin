fun kotlinBasicP1_bai1() {
    println("Kotlin - \"I love you\"")
}

fun sumOfSquares(a: Double, b: Double): Double = a * a + b * b

fun kotlinBasicP1_bai2() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    println(sumOfSquares(a, b))
}

fun greet(name: String = "Kotlin"): Unit {
    println("Hi, $name!")
}

fun kotlinBasicP1_bai3() {
    val name = readln().trim()
    greet(name)
}

fun addAndDivide(a: Int, b: Int) {
    println("a + b = ${a + b}")
    val div = a.toDouble() / b.toDouble()
    println("a / b = $div")
}

fun kotlinBasicP1_bai4() {
    val a = readln().toInt()
    val b = readln().toInt()
    addAndDivide(a = a, b = b)
}
