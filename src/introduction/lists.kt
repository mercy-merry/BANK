package introduction

fun main(args: Array<String>){
    val ladies= arrayListOf("Mercy","Lucy","Gladys")
    val gents= arrayListOf("Ryan","William","Hiram")

    println( gents)
    val people=gents+ladies
    println( people[4])
    println( ladies.isEmpty())
    println( ladies.contains("Hiram"))
    gents.add("Wayne")
    println(gents)
    ladies.add(2,"Farhia")
    println(ladies[2])
    gents.removeAt(1)
    println(gents)
}