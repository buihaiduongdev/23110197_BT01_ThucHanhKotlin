fun kotlinBasicP2_bai5() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    val result = { x: Double, y: Double, z: Double
        -> if (x == y && y == z) "yes" else "no" }

    println(result(a, b, c))

}

fun kotlinBasicP2_bai6() {
    val a = readln().toDouble()
    val b = readln().toDouble()

    if (a == 0.0){
        if (b == 0.0)
            println("VSN")
        else
            println("VN")
    }
    else{
        println(-b/a)
    }
}

fun kotlinBasicP2_bai7() {
    fun isPrime(x: Int): Boolean {
        if (x < 2) return false
        if (x == 2) return true
        if (x % 2 == 0) return false
        var i = 3
        while (i.toLong() * i <= x) {
            if (x % i == 0) return false
            i += 2
        }
        return true
    }

    var aVal = 1
    var bVal = 8

    var sum = 0
    for (i in aVal..bVal) {
        if (isPrime(i)) sum += i
    }

    println(sum)
}

fun kotlinBasicP2_bai8() {
    val secret = kotlin.random.Random.nextInt(1, 101)
    val scoreMap = mapOf(1 to 100, 2 to 50, 3 to 30)
    var won = false

    listOf(1, 2, 3).forEach {
        if (won) return@forEach
        val line = readln().trim()
        val guess = line.toIntOrNull() ?: run {
            println("Vui lòng nhập một số nguyên"); return@forEach
        }

        if (guess == secret) {
            println("Bạn đoán đúng! Điểm: ${scoreMap[it]}")
            won = true
            return@forEach
        } else if (guess < secret) {
            println("Số của bạn nhỏ quá")
        } else {
            println("Số của bạn lớn quá")
        }
    }

    if (!won) println("Game over")
}
