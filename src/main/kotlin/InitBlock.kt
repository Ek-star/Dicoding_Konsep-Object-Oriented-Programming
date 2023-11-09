class Animal7(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(pWeight < 0) 0.1 else pWeight
        this.age = if(pAge < 0) 0 else pAge
        this.name = pName
        this.isMammal = pIsMammal
    }
}

fun main() {
    // Kotlin menyediakan blok init yang memungkinkan kita untuk menuliskan properti di dalam body class ketika kita menggunakan primary constructor.

    // Pada kelas "Animal7" contohnya, kita dapat melakukan verifikasi bahwa berat dan umur hewan tidak boleh bernilai kurang dari nol.
    val dicodingCat = Animal7("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}