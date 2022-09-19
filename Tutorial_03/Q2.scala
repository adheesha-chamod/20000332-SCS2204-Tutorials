import scala.io.StdIn.*;

object Q2{
    def toFahrenheit(c: Double): Double = {
        c*1.8 + 32.0;
    }

    def main(args: Array[String]) = {
        printf("Enter temperature in C: ");
        var c = readDouble();

        printf("%g C = %g F\n", c, toFahrenheit(c));    // 35C = 95F
    }
}