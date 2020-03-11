package function

fun hello(){
    println("hello world")
}
fun square(num:Int)=num*num
fun add(NUM1:Int,NUM2:Int,NUM3:Int)=NUM1+NUM2+NUM3
fun product(NUM1:Int,NUM2:Int,NUM3:Int)=NUM1*NUM2*NUM3
fun circumference(radius:Double)=radius*2*22/7
fun area(radius:Double)=radius*radius*22/7
fun max(num1:Int,num2:Int){ if (num1>num2){
    println(num1) }else{
    println(num2) }}
fun min(num1:Int,num2:Int){ if (num1<num2){
    println(num1) }else{
    println(num2) }}
fun HappyBirthday(name:String,age:Int){
    println("Happy $age th birthday:$name")
}
fun main(args: Array<String>) {
    hello()
   println( square(56))
    println(add(45,53,74))
    HappyBirthday("Mercy",17)
    println(product(2,3,4))
    println(circumference(7.0))
    println(area(7.0))
    max(45,78)
    min(45,78)

}