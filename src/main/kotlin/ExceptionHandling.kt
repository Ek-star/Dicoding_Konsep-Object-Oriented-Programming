fun main() {
    // Exception handling dapat diterapkan dengan beberapa cara. Di antaranya adalah dengan menggunakan try-catch, try-catch-finally, dan multiple catch. Mari kita pelajari ketiga cara tersebut.

    // Try-catch
    // Salah satu cara untuk menangani suatu exception adalah menggunakan try-catch. Kode yang dapat membangkitkan suatu exception disimpan dalam blok try, dan jika exception tersebut terjadi, maka blok catch akan terpanggil. Berikut cara penulisan try-catch pada Kotlin:

    /*
    try {
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: SomeException) {
        // Block catch akan terpanggil ketika exception bangkit.
    }
     */
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }

    // 2. Try-catch-finally

    // Selain terdapat blok try dan catch, ada juga blok finally. Hanya saja blok ini bersifat opsional. finally akan dieksekusi setelah program keluar dari blok try ataupun catch. Bahkan finally juga tereksekusi ketika terjadi exception yang tidak terduga. Exception tidak terduga terjadi ketika kita menggunakan NullPointerException pada catch namun exception yang terjadi adalah NumberFormatException.

    val someNullValue2: String? = null
    lateinit var someMustNotNullValue2: String

    try {
        someMustNotNullValue2 = someNullValue2!!
    } catch (e: Exception) {
        someMustNotNullValue2 = "Nilai String Null"
    } finally {
        println(someMustNotNullValue2)
    }
}