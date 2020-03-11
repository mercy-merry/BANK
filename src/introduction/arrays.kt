package introduction

fun main(args: Array<String>){
    val valueone= arrayOf("Nairobi","Kisumu","Mombasa")
    println(valueone[0])
    println(valueone)

    val  mixed= arrayOf("Kotlin",8,false,34,89)
    println("The boolean data type is "+mixed[2])
    println(mixed[3])
    val age= intArrayOf(78,98,90)
    println(age[2])
    //string as array
    val name="eMobilis"
    println("char at 2 is "+name[2])
    //working with two arrays
    val towns= arrayOf("kiambu","nairobi","nakuru")
    val counties=valueone+towns
    println( counties.size)
    println("The county at 4 is "+counties[4])

    if (counties.contains("Samburu")){
        println("it contains samburu")
    }else{
        println("it doesn't ")
}}