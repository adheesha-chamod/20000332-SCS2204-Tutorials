import scala.io.StdIn.*;

object Q4{
    val cost1: Double = 24.95;      // cover price
    val cost2: Double = 3.0;        // shipping costs for the first 50 copies
    val cost3: Double = 0.75;       // shipping cost for additional copies
    val discount: Double = 0.4      // discount

    /* N <- number of books */

    def totalCoverPrice(N: Int): Double = {
        N*cost1;
    }

    def totalShippingCost(N: Int): Double = {
        if(N <= 50){
            3.00;
        }else{
            3.00 + (N - 50)*0.75;
        }
    }

    def totalCost(N: Int): Double = {
        totalCoverPrice(N) + totalShippingCost(N);
    }

    def totalDiscount(cost: Double): Double = {
        cost*0.4;
    }

    def main(args: Array[String]) = {
        printf("Enter number of copies: ");
        var N: Int = readInt();

        var cost = totalCost(N) - totalDiscount(totalCost(N));
        printf("Total wholesale cost: Rs. %.2f\n", cost);      // N = 60 -> Total wholesale cost: Rs. 904.50
    }
}