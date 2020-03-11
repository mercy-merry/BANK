package methods

class man{
fun eat(){
    println("A man eats food")
}
fun run(){
    println("A man runs")
}
fun reads(){
    println("A man reads")
}
}

fun main(args: Array<String>) {
    val Merry=man()
   println("This is merry"+ Merry.eat())
   println("This is merry"+ Merry.run())
   println("This is merry"+ Merry.reads())
println("-------------------------------------------------------------")
}




