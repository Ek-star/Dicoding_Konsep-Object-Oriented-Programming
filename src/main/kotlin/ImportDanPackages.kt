import kotlin.random.Random
// import kotlin.math.PI
// import kotlin.math.cos
// import kotlin.math.sqrt
// Bisa disingkat menjadi:
import kotlin.math.*

fun main() {
    // Seluruh konten pada Kotlin, seperti kelas dan fungsi, dibungkus dalam sebuah package. Package tersebut digunakan untuk mengelompokkan kelas, fungsi dan variabel yang mempunyai kemiripan fungsionalitas. Untuk menggunakan kelas, fungsi maupun variabel yang berada pada suatu package, kita harus menuliskan secara lengkap alamat package tersebut.

    val someInt = Random(0).nextInt(1 , 10)
    println(someInt)

    println(PI)
    println(cos(120.0))
    println(sqrt(9.0))
}