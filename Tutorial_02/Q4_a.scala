object Q4_a{
    var pay1: Float = 250.0;    // normal pay per hour
    var pay2: Float = 85.0;     // OT pay per hour
    var taxR: Float = 0.12;     // tax rate

    def normalPay(h: Int): Float = {
        pay1 * h;   // h-> normal working hours
    }

    def otPay(h: Int): Float = {
        pay2 * h;   // h-> OT hours
    }

    def totalSalary(nHour: Int, otHour: Int): Float = {
        normalPay(nHour) + otPay(otHour);   // nHour-> normal working hours, otHours-> OT hours
    }

    def tax(salary: Float): Float = {
        salary * taxR                       // salary-> total salary
    }

    def netSalary(nHour: Int, otHour: Int): Float = {
        totalSalary(nHour, otHour) - tax(totalSalary(nHour, otHour));
    }

    def main(args: Array[String]) = {
        println("Normal-40h, OT-30h : Rs."+netSalary(40, 30));
        println("Normal-20h, OT-15h : Rs."+netSalary(20, 15));
    }
}