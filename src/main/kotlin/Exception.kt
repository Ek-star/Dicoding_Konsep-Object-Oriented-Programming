fun main() {
    // Kode yang baik yaitu kode yang terhindar dari segala bentuk kejadian dengan efek buruk pada aplikasi kita. Kejadian tersebut pada programming disebut Exception. Hal terburuk yang disebabkan oleh exception ini adalah dapat terhentinya aplikasi ketika dijalankan. Hal seperti ini seharusnya kita hindari. Nah karena itu kita harus mengetahui cara menangani suatu exception (Exception Handling) pada sub-modul selanjutnya.

    // Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program. Pada Kotlin semua exception bersifat Unchecked, yang artinya exception terjadi karena kesalahan pada kode kita. Berikut ini beberapa contoh Unchecked Exception yang sering mengganggu jalannya program kita:

    // 1. ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol. Berikut merupakan contoh kode yang dapat membangkitkan ArithmeticException.

    /*
        val someValue = 6
        println(someValue / 0)
     */

    // 2. NumberFormatException disebabkan karena terjadi kesalahan dalam format angka. Sebagai contoh, kita akan mengubah sebuah nilai String menjadi Integer tetapi nilai String yang akan kita ubah tidak memiliki format angka yang benar, sehingga dapat membangkitkan NumberFormatException. Berikut contoh kodenya:

    /*
        val someStringValue = "18.0"
        println(someStringValue.toInt())
     */

    // 3. Dan yang terakhir adalah NullPointerException atau NPE. Walaupun Kotlin memiliki operator Null Safety, NPE tetap bisa saja terjadi. NPE terjadi karena sebuah variabel atau objek memiliki nilai null, padahal seharusnya objek atau variabel tersebut tidak boleh null. Berikut contoh kasus yang dapat menyebabkan NullPointerException:
    /*
        val someNullValue: String? = null
        val someMustNotNullValue: String = someNullValue!!
        println(someMustNotNullValue)
     */
}