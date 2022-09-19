import scala.io.StdIn.*;

object Q3{
    def volumeOfsphere(r: Double): Double = {
        (4.0 * math.Pi * math.pow(r, 3))/3;
    }

    def main(args: Array[String]) = {
        printf("Enter radius: ");
        var r = readDouble();       // r > 0

        printf("Volume: %.3f\n", volumeOfsphere(r));    // r =5 -> Volume: 523.599
    }
}