package conditionals

import java.util.*

fun main(args: Array<String>) {
    val marks:Int
    val pick:Scanner= Scanner(System.`in`)
    println("Enter your marks")
    marks=pick.nextInt()
    when(marks){
        in 80..100->{
            println("A")}
        in 65..79->{
            println("B")}
        in 45..64->{
            println("C")}

        in 25..44->{
            println("D")}
        in 0..24->{
            println("E")}
    }
}