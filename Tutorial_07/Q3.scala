class Account(a: String, b: Double){
    val acNo = a;
    var balance = b;

    /* to withdraw money */
    def withdraw(amount: Double) = {
        if(amount < this.balance){
            this.balance = this.balance - amount;
        }
    }

    /* to deposit money */
    def deposit(amount: Double) = {
        this.balance = this.balance + amount;
    }

    def transfer (acc: Account, amount: Double) = {
        if(amount < this.balance){
            this.withdraw(amount);
            acc.deposit(amount);
        }
    }


    /* to display the object values */
    override def toString = " [" + acNo + " => " + balance + "] ";
}

object Q3{
    def main(args: Array[String]): Unit = {
        var bank: List[Account] = List();
        bank = bank :+ new Account("AC1001", 10000);
        bank = bank :+ new Account("AC1002", 90000);
        bank = bank :+ new Account("AC1003", 50000);
        bank = bank :+ new Account("AC1004", 20000);

        print("Before the transaction:");
        println(bank);

        /* transfer 50000 from 2nd account(bank(1)) to 1st account(bank(0)) */
        bank(1).transfer(bank(0), 50000);
        
        print("After the transaction:");
        println(bank)
    }
}
