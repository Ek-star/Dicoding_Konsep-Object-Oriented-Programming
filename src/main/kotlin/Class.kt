private class Animal(val name: String,
             val weight: Double,
             val age: Int,
             val isAnimal: Boolean) {
    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    // Cukup gunakan kata kunci class diikuti dengan nama kelas yang akan dibuat

    val dicodingCat = Animal("Dicoding Miaw" , 4.2 , 2 , true)
    println("Nama: ${dicodingCat.name} , Berat: ${dicodingCat.weight} , umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isAnimal}")
    dicodingCat.eat()
    dicodingCat.sleep()
}