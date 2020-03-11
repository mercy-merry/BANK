package loops

fun main(args: Array<String>) {
    for (i in 1..10){
        println("Hello $i")}

    println("----------------------------------------------")
    var sum=0
    for (i in 1..100){
        sum=sum+2
    }
    println("The total sum is"+sum)

    println("----------------------------------------------")
    val languages= listOf("Kotlin","PHP","Java","C")
    for (element in languages){
        println(element)}
    for ((index ,value)in languages.withIndex()){
        println("element at $index is $value")
    }
    println("----------------------------------------------")
    for (i in 1..10){
        outer@for (j in 1..10){
            if (i-j==5){
                println("our condition has been met")
                break@outer
            }
            println("$i-$j")
        }
    }
    println("----------------------------------------------")










}

