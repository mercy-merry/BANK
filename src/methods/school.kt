package methods

class school{
    fun teach(){
        println(" teaches")
    }
    fun play(){
        println(" have fun")
    }
    fun learn(){
        println("learns")
    }
}

fun main(args: Array<String>) {
    val MrMunene=school()
    val Gladys=school()
    println("mr munene"+ MrMunene.teach())
    println("Gladys"+ Gladys.learn())
}

