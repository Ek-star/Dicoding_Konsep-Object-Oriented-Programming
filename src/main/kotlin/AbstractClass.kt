abstract class Animal13(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}
fun main() {
    // Seperti namanya, abstract merupakan gambaran umum dari sebuah kelas. Ia tidak dapat direalisasikan dalam sebuah objek. Pada sub-modul sebelumnya kita sudah mempunyai kelas Animal. Secara harfiah hewan merupakan sebuah sifat. Kita tidak tahu bagaimana objek hewan tersebut. Kita tahu bentuk kucing, ikan dan ular seperti apa tetapi tidak untuk hewan. Maka dari itu konsep abstract class perlu diterapkan agar kelas Animal tidak dapat direalisasikan dalam bentuk objek namun tetap dapat menurunkan sifatnya kepada child class-nya.

    // Untuk menjadikan sebuah kelas abstract, kita hanya perlu menambahkan keyword abstract sebelum menuliskan nama kelas:

    // val animal = Animal13("dicoding animal", 2.6, 1, true)
}