interface IFly2 {
    fun fly()
    val numberOfWings: Int
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

fun main() {
    // Seperti namanya, yang dimaksud dengan anonymous adalah class yang tak memiliki nama. Alih-alih mendefinisikan class menggunakan keyword class, Anda bisa langsung mendefinisikan isi dari sebuah class dengan menggunakan keyword object:

    flyWithWings(object : IFly {
        override fun fly() {
            if(numberOfWings > 0) println("Flying with $numberOfWings wings")
            else println("I'm Flying without wings")
        }
        override val numberOfWings: Int
            get() = 2
    })
}