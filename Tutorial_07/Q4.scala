class Account(a: String, b: Double){
    val acNo = a;
    var balance = b;

    /* to display the object values */
    override def toString = " [" + acNo + " => " + balance + "] ";
}

object Q4{
    def main(args: Array[String]): Unit = {
        var bank: List[Account] = List();
        bank = bank :+ new Account("AC1001", -10000);
        bank = bank :+ new Account("AC1002", 90000);
        bank = bank :+ new Account("AC1003", 50000);
        bank = bank :+ new Account("AC1004", -20000);

        println(bank);

        /* list of accounts with negative balances */
        var negBal =  bank.filter((x: Account) => x.balance < 0);
        println("Accounts with negative balances: " +negBal);

        /* total of all account balances */
        var tot: Double = bank.filter((x: Account) => x.balance != 0).map(bank => bank.balance).reduce((x, y) => x + y);
        println("Total of all account balances: " +tot);

        /* final balances of all accounts after apply the interest */
        var finalBal =  bank.map((x: Account) => 
            if(x.balance > 0){
                x.balance = x.balance * 1.05;
            }else {
                x.balance = x.balance * 1.1;
            }
        );
        println("Final balances with interest: " + bank);
    }
}
