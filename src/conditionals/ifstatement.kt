package conditionals

import java.util.*

fun main(args: Array<String>) {
    val age:Int
    val pick:Scanner= Scanner(System.`in`)
 println("enter your age")
    age=pick.nextInt()
    if (age<18){
        println("Child")
    }else if (age<40){
        println("Youth")
    }else{
        println("Old")
    }
}