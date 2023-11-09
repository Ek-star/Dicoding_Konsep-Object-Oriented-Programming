class Animal9{
    val name: String = "Dicoding Miaw"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}

fun main() {
    // Kotlin secara otomatis membuat sebuah default constructor pada kelas jika kita tidak membuat sebuah konstruktor secara manual.

    val dicodingCat = Animal9()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}