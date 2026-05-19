fun kotlinBasicP3_bai9() {
    var name: String = "Kmin"
    var nickname: String? = "K"

//    name = null
    nickname = null
}

fun kotlinBasicP3_bai10() {
    fun printLength(name: String?){
        println(name?.length)
    }

    printLength("duong")
    printLength(null)
}

fun kotlinBasicP3_bai11() {
    fun getLength(name: String?): Int{
        return name?.length ?: 0
    }

    println(getLength("Duong"))
    println(getLength(null))
}

fun printStringLength(obj: Any) {
    val text = obj as? String

    if (text != null) {
        println(text.length)
    } else {
        println("Not a string")
    }
}

fun kotlinBasicP3_bai12() {
    printStringLength("Hello Kotlin")
    printStringLength(100)
    printStringLength(true)
}

fun kotlinBasicP3_bai13(){
    val user: String? = "hai duong"

    if (user != null) {
        println(user?.uppercase())
        println(user?.length)
    } else {
        println("No user")
    }
}

fun processInput(input: Any?) {
    val stringVal = input as? String
    val intVal = input as? Int

    when {
        input == null -> println("Input is null")
        stringVal != null -> {
            println("Length: ${stringVal.length}")
            println("Uppercase: ${stringVal.uppercase()}")
        }
        intVal != null -> {
            println("Square: ${intVal * intVal}")
        }
        else -> println("Unsupported type")
    }
}
fun kotlinBasicP3_bai14() {
    processInput(null)
    processInput("kotlin")
    processInput(5)
    processInput(10.5)
}