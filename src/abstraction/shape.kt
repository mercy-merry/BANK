package abstraction

abstract class shape(open var color:String){
    abstract fun area():Double
    abstract fun perimeter():Double
    abstract fun printout():String
}
class circle(override var color: String, var radius:Double):shape(color) {
    override fun area(): Double {
        return Math.PI*radius*radius
    }

    override fun perimeter(): Double {
return Math.PI*2*radius   }

    override fun printout(): String {
return "Perimeter is "+perimeter()+" area is "+area()   }

    override fun toString(): String {
        return "circle(color='$color', radius=$radius)"
    }

}
class Rectangle(override var color: String,var length:Double,var width:Double):shape(color) {
    override fun area(): Double {
        return length*width
    }

    override fun perimeter(): Double {
return (length+width)*2   }

    override fun printout(): String {
return "the area of rectangle is "+area()+" while the perimeter is "+perimeter()   }

    override fun toString(): String {
        return "Rectangle(color='$color', length=$length, width=$width)"
    }

}
class Triangle(override var color: String,var base:Double,var height:Double,var side1:Double,var side2:Double):shape(color) {
    override fun area(): Double {
        return 0.5*base*height
    }

    override fun perimeter(): Double {
return base+side1+side2   }

    override fun printout(): String {
return "the area of triangle is "+area()+" while the perimeter is "+perimeter()  }

    override fun toString(): String {
        return "Triangle(color='$color', base=$base, height=$height, side1=$side1, side2=$side2)"
    }

}
class Square(override var color: String,var length:Double):shape(color) {
    override fun area(): Double {
        return length * length
    }

    override fun perimeter(): Double {
        return (length) * 4
    }

    override fun printout(): String {
        return "the area of square is " + area() + " while the perimeter is " + perimeter()
    }

    override fun toString(): String {
        return "Square(color='$color', length=$length)"
    }

}

fun main(args: Array<String>) {
    val circle1=circle("black",21.0)
    println(circle1.area())
    println(circle1.perimeter())
    println(circle1.printout())
    println(circle1.toString())
    println("-------------------------------------------------")
    val rectangle1=Rectangle("red",8.0,7.0)
    println(rectangle1.area())
    println(rectangle1.perimeter())
    println(rectangle1.printout())
    println(rectangle1.toString())
    println("-------------------------------------------------")
    val triangle1=Triangle("red",8.0,7.0,4.0,4.0)
    println(triangle1.area())
    println(triangle1.perimeter())
    println(triangle1.printout())
    println(triangle1.toString())
    println("-------------------------------------------------")
    val square1=Square("red",8.0)
    println(square1.area())
    println(square1.perimeter())
    println(square1.printout())
    println(square1.toString())

}