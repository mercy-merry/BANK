package function

fun hellol(){
    println("hello world")
}
fun added(num1:Int,num2:Int)=num1+num2
fun circum(diameter:Double)=22/7*diameter
fun maximum(no1:Int,no2:Int){
    if (no1>no2){
        println(no1)}else{
        println(no2)}

}
fun happy(namee:String,years:Int){
    println("happy birthday $namee for turning $years years old")
}
fun main(args: Array<String>) {
    hellol()
    println(added(45,89))
    println(circum(7.0))
    maximum(78,90)
    happy("Soni",18)
}