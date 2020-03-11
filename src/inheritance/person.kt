package inheritance

open class person(open val name:String,open val age:Int){
    fun speaks(name: String){
        println("Hey my name is $name")}
    fun getBirthyear()=2020-age
}
class employee(override val name: String,override val age: Int,val salary:Int):person(name, age){
    fun receivepay(salary: Int) { println(
        "salary is $salary")}

    override fun toString(): String {
        return "employee(name='$name', age=$age, salary=$salary)"
    }
}

class student(override val name: String,override val age: Int,course:String):person(name, age)
{fun course(course: String):String{return "Student is taking $course"}
    override fun toString(): String {
        return "student(name='$name', age=$age)"
    }
}
class child(override val name: String,override val age: Int,val school:String):person(name, age){
    fun school(school: String){
        println( "Child goes to $school")}

    override fun toString(): String {
        return "child(name='$name', age=$age, school='$school')"
    }


}
fun main(args: Array<String>) {
    val student1=student("Mercy",18,"Aerospace Engineering")
    println("Born in "+student1.getBirthyear())
    student1.speaks("Mercy")
   println( student1.course("Aerospace Engineering"))
    println(student1.toString())
    val emp1=employee("Lucy",20,30000)
    emp1.speaks("Lucy")
    println("was born in "+emp1.getBirthyear())
    emp1.receivepay(70000)
    val child1=child("Gladys",6,"Lakeview school")
    child1.speaks("Gladys")
    println("was born in "+child1.getBirthyear())
    child1.school("Lakeview school")
   println( child1.toString())
}

