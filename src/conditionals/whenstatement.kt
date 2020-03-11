package conditionals

import java.util.*

fun main(args: Array<String>) {
    val age:Int
    val pick: Scanner = Scanner(System.`in`)
    println("enter your age")
    age=pick.nextInt()
   when(age){
       in 1..17->{ println("Child")}
       in 18..45->{println("Youth")}
       in 46..150->{println("Old")}
       else->{println("NO SUCH AGE")}
   }



}