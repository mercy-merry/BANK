package abstraction

interface Drive{
    fun drive()
}
interface Repair{
    var time:Int
    fun fix()
}
class Bike(var speed:Int):Drive,Repair{
    override fun drive() {
        println("Riding a bike with $speed speed")
    }

    override var time: Int=2



    override fun fix() {
println("fixing bike may take $time days")    }
}
class Track(var weight:Double):Drive{
    override fun drive() {
        println("Driving a track with $weight Tonnes")
    }

}

fun main(args: Array<String>) {
    val bike1=Bike(40)
    bike1.drive()
    bike1.fix()
    val track1=Track(1000.0)
    track1.drive()
}