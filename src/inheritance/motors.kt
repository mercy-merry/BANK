package inheritance

open class VEHICLE(open val plate:String,open val year:Int){
    fun pno(plate: String){
        println("The number plate is $plate")
    }
    fun yr(year: Int){
        println("made in $year")
    }
}
class MERCIDES(override val plate: String,override val year: Int,val model:String,val price:Int):VEHICLE(plate, year){
    fun mod(model: String){
        println("The model is $model")
    }
    fun pri(price: Int){
        println("price at $price")}

    override fun toString(): String {
        return "mercides(plate='$plate', year=$year)"
    }
}
class TOYOTA(override val plate: String,override val year: Int,val model: String,val price:Int):VEHICLE(plate, year){
    fun mod(model: String){
        println("The model is $model")
    }
    fun pri(price: Int){
        println("price at $price")}

    override fun toString(): String {
        return "TOYOTA(plate='$plate', year=$year, model='$model')"
    }
}

fun main(args: Array<String>) {
    val car1=MERCIDES("KCE 993D",2016,"C230",2000000)
    car1.pno("KCE 993D")
    car1.yr(2016)
    car1.mod("C230")
    car1.pri(2000000)
    println(car1.toString())
    println("------------------------------------------------------")
    val car2=TOYOTA("KCH",2017,"HARRIER",3000000)
    car2.pno("KCH")
    car2.yr(2017)
    car2.mod("HARRIER")
    car2.pri(3000000)
    println(car2.toString())
}
