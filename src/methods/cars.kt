package methods

class cars(noplate:String){
    fun color(color:String){
        println("your car is $color in colour")
    }
    fun speed(khr:Int){
        println("This car can go $khr k/hr")
    }
    fun make(make:String){
        println("This car is a $make model")
    }
}

fun main(args: Array<String>) {
    val max=cars("KCH 933J")
    max.color("black")
    max.make("BMW")
    max.speed(80)


}


