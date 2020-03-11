package loops

fun main(args: Array<String>) {
    var x=10
    while (x>=2){
        println("the value of x is $x")
        x--
    }
    println("----------------------------------------------")
    while (x<=10){
        x++
        println("the value of x is $x")
    }
}