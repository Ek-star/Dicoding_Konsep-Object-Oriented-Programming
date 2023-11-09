class Animal5(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)
fun main() {
    // Konstruktor merupakan fungsi spesial yang digunakan untuk menginisialisasi properti yang terdapat pada kelas tersebut.

    // Primary Constructorp
    // jika kita akan membuat suatu objek dari sebuah kelas dan kelas tersebut memiliki primary constructor di dalamnya, maka kita diharuskan mengirim nilai sesuai properti yang dibutuhkan

    val dicodingCat = Animal5("Dicoding Miaw" , 4.2 , 2 , true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}