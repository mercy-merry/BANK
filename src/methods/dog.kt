package methods

class dog(var age:Int){
    fun bark(){
        println("woof")
    }
    fun run(feet:Int){
        println("your dog ran $feet feet!")
    }
    fun weight(kgs:Double){
        println("your dog is $kgs kgs")
    }
    fun vaccinated(boolean: Boolean){
        println("your dog has been vaccinated: $boolean")
    }
}

fun main(args: Array<String>) {
    val spike= dog(7)
    spike.bark()
    spike.run(40)
    spike.weight(50.0)
    spike.vaccinated(true)
}