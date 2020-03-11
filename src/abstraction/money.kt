package abstraction

interface bank{
    fun checkbalance(b:Int)
    fun deposit(d:Int)
    fun withdraw(w:Int)
}
class Customer(var name:String):bank{
    var balance:Int=0
    override fun checkbalance(b: Int) {
        balance=b
    }

    override fun deposit(d: Int) {
        balance+=d
    }

    override fun withdraw(w: Int) {
        balance-=w
    }

    override fun toString(): String {
        return "Customer(name='$name', balance=$balance)"
    }


}

fun main(args: Array<String>) {
    val customer1=Customer("Mercy")
    customer1.checkbalance(0)
    println(customer1.toString())
    customer1.deposit(90000)
    println(customer1.toString())
    customer1.withdraw(20000)
    println(customer1.toString())
}