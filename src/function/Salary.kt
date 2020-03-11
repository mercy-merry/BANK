package function



fun salarycalculator(
        netsalary: Int,
        allowances: Int,
         tax:Double=0.2*netsalary,
         insuarance:Int=1000,
        deduction:Double=tax+insuarance
        ){
        println(netsalary+allowances-deduction)
    }



fun main(args: Array<String>) {
    salarycalculator(30000,5000)
}