class Animal12(private var name: String) {
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

// Class Calculator
class Calculator {
    fun add(value1: Int, value2: Int) = value1 + value2
    fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
    fun add(value1: Double, value2: Double) = value1 + value2
    fun add(value1: Float, value2: Float) = value1 + value2

    fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2
}

fun main() {
    // Overloading dapat dilakukan selama fungsi itu memiliki parameter yang berbeda. Berikut merupakan contoh overloading fungsi eat() pada sebuah kelas Animal.

    val dicodingCat = Animal12("Dicoding Miaw")

    // Pada kelas Animal12 terdapat beberapa fungsi dengan penamaan yang sama, tetapi tidak menyebabkan eror. Sebabnya, fungsi tersebut memiliki parameter yang berbeda sehingga tidak akan terjadi ambiguitas dalam penggunaan fungsi tersebut. Mari kita coba buat sebuah objek dari kelas tersebut dan mengakses fungsinya satu persatu.

    dicodingCat.eat()
    dicodingCat.eat("Ikan Tuna")
    dicodingCat.eat("Ikan Tuna", 450.0)

    // Calculator
    val calc = Calculator()

    println(calc.add(2, 4))
    println(calc.add(2.5, 2.2))
    println(calc.add(6f, 7f))
    println(calc.add(1, 2, 3))

    println(calc.min(9, 2))
    println(calc.min(17.2, 18.3))
}