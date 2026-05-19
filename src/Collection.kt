fun collection_bai1() {
    val products = listOf("Laptop", "Phone", "Tablet")

    products.forEachIndexed { index, product ->
        println("${index + 1}. $product")
    }
}

fun collection_bai2() {
    val users = listOf("An", "Bao", "Cuong", "David")

    fun search(keyword: String): List<String> {
        return users.filter { it.contains(keyword, ignoreCase = true) }
    }

    println(search("a"))
}

fun collection_bai3() {
    val scores = listOf(6, 7, 8, 9)
    val formattedScores = scores.map { "Score: $it" }
    println(formattedScores)
}

fun collection_bai4(){
    val scores = listOf(4, 5, 7, 9)
    val rs = scores.filter{it >= 5}.map{"Pass: $it"}

    println(rs)
}

fun collection_bai5(){
    val users = listOf("An", "1", "Cuong")
    val rs = users.find { it == "Bao" } ?: "Not found"
    println(rs)
}

fun collection_bai6() {
    val names = listOf("An", null, "Bao", null)

    val nonNullNames = names.filterNotNull()

    println(nonNullNames)
    // Output: [An, Bao]
}

fun collection_bai7() {
    val names = listOf("An", "Bao", "Binh", "Cuong")

    val groupedNames = names.groupBy { it.first() }

    groupedNames.forEach { (char, list) ->
        println("$char -> $list")
    }
}


fun collection_bai8() {
    data class User(val name: String, val age: Int)

    val users = listOf(
        User("An", 18),
        User("Bao", 22),
        User("Cuong", 17)
    )

    val result = users
        .filter { it.age >= 18 }
        .map { it.name }

    println(result)
}


fun collection_bai9(){
    data class Product(val name: String, val price: Double)

    val products = listOf(
        Product("Laptop", 1000.0),
        Product("Phone", 500.0),
        Product("Tablet", 300.0)
    )

    val result = products
        .filter { it.price > 400 }
        .sortedByDescending { it.price }
        .map { it.name }

    println(result)
}

fun collection_bai10(){
    val scores = listOf(4, 6, 8, 10)

    println("Sum: ${scores.sum()}")
    println("Average: ${scores.average()}")
    println("Max: ${scores.max()}")
    println("Min: ${scores.min()}")
}


fun collection_bai11(){
    data class User(val name: String?, val age: Int?)

    val users = listOf(
        User("An", 18),
        User(null, 20),
        User("Bao", null)
    )

    val validUsers = users.filter { it.name != null && it.age != null }

    println(validUsers)
}


fun collection_bai12() {
    data class Product(val name: String, val price: Double)

    val products = listOf(
        Product("Laptop", 1000.0),
        Product("Phone", 500.0),
        Product("Tablet", 300.0),
        Product("Lamp", 50.0)
    )

    val result = products
        .filter { it.name.contains("La", ignoreCase = true) }
        .sortedBy { it.price }
        .map { "Product: ${it.name} - ${it.price}" }

    println(result)
}

fun collection_bai13(){
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val total = numbers
        .filter { it % 2 == 0 }.sumOf { it * 3 }

    println(total)
}