open class Animal10(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal10(pName, pWeight)

fun main() {
    // Public: Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.

    //Private: Hak akses yang cakupannya paling terbatas. Anggota yang menerapkannya hanya dapat diakses pada scope yang sama.

    //Protected: Hak akses yang cakupannya terbatas pada hirarki kelas. Anggota hanya dapat diakses pada kelas turunannya atau kelas itu sendiri.

    //Internal: Hak akses yang cakupannya terbatas pada satu modul. Anggota yang menggunakannya tidak dapat diakses diluar dari modulnya tersebut.

    // PUBLIC
    // Seecra Default kita sudah menggunakan Public dikarenakan Default Modifiers

    // PRIVATE
    // Ketika suatu anggota memiliki hak akses private, maka anggota tersebut tidak dapat diakses dari luar scope-nya. Untuk menggunakan modifier private kita perlu menambahkan keyword private seperti contoh berikut:

    /*
        class Animal(
            private val name: String,
            private val weight: Double,
            private val age: Int,
            private val isMammal: Boolean
        )

     */

    // PROTECTED
    // Hak akses protected mirip seperti private, namun pembatasannya lebih luas dalam sebuah hirarki kelas. Hak akses protected digunakan ketika kita menginginkan sebuah anggota dari induk kelas dapat diakses hanya oleh kelas yang merupakan turunannya. Perhatikan kode di bawah ini untuk contoh penggunaan hak akses protected.

    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
    // println("Berat Kucing: ${cat.weight}") // error: expecting a top level declaration

    // Internal
    // Internal merupakan hak akses baru yang diperkenalkan pada Kotlin. Hak akses ini membatasi suatu anggota untuk dapat diakses hanya pada satu modul. Berikut ini contoh penggunaan hak akses internal:

    // internal class Animal(val name: String)
    // Pada contoh di atas, kelas Animal telah ditetapkan sebagai kelas internal, maka kelas tersebut hanya dapat diakses dari modul yang sama. Hak akses ini sangat berguna ketika kita mengembangkan sebuah aplikasi yang memiliki beberapa modul di dalamnya.

}