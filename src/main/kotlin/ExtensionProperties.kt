class Animal6(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Animal6.getAnimalInfo: String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

class ProfileOfEkalma(var name: String, var kom: Char, var age: Int, var isStudent: Boolean)

val ProfileOfEkalma.infoEkalma: String
    get() = "Nama: ${this.name}, asal KOM: ${this.kom}, umur: ${this.age} tahun, dan ia ${if (isStudent == true){
        "adalah seorang mahasiswa"} else {
        " bukan seorang mahasiswa"
    }
    }"

fun main() {
    val dicodingCat = Animal6("Dicoding Miaw", 5.0, 2, true)

    println(dicodingCat.getAnimalInfo)

    val ekalmaSembiring = ProfileOfEkalma("Ekalma Toto Alloy Sembiring" , 'A' , 19 , true)

    println(ekalmaSembiring.infoEkalma)
}