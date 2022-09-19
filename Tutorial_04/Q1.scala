import scala.io.StdIn.*;

object Q1{
    var rate1: Double = 0.02;       // rate for interest amount < 20000.00
    var rate2: Double = 0.035;      // rate for interest amount < 200000.00
    var rate3: Double = 0.04;       // rate for interest amount < 2000000.00
    var rate4: Double = 0.065;      // rate for interest amount >= 2000000.00

    def interest(amount: Double): Double = {
        amount match{
            case amount if amount <= 0 => 0;
            case amount if amount < 20000.00 => amount * rate1;
            case amount if amount < 200000.00 => amount * rate2;
            case amount if amount < 2000000.00 => amount * rate3;
            case _ => amount * rate4;
        }
    }

    def main(args: Array[String]) = {
        printf("Enter amount: Rs. ");
        var amount: Double = readDouble();

        printf("Interest for Rs. %.2f: Rs. %.2f", amount, interest(amount));
    }
}