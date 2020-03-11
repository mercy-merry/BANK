package abstraction

interface Ride{
    fun speedup(a:Int)
    fun applybrakes(a:Int)
    fun changeGear(a: Int)
}
class Mybike:Ride{
    var speed=0
    var gear=0
    override fun speedup(a: Int) {
        speed+=a

    }

    override fun applybrakes(a: Int) {
speed-=a    }

    override fun changeGear(a: Int) {
gear=a    }

    override fun toString(): String {
        return "Mybike(speed=$speed, gear=$gear)"
    }

}

fun main(args: Array<String>) {
    val blackmamba = Mybike()
    println(blackmamba.toString())
    blackmamba.speedup(5)
    blackmamba.changeGear(1)
    println(blackmamba.toString())
    blackmamba.changeGear(2)
    blackmamba.speedup(20)
    println(blackmamba.toString())
    blackmamba.applybrakes(2)
    println(blackmamba.toString())


}