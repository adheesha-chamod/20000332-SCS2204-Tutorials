import scala.io.StdIn.*;

object Q1{
    def areaOfDisk(r: Double): Double = {
        math.Pi * math.pow(r, 2);
    }

    def main(args: Array[String]) = {
        printf("Enter radius: ");
        var r = readDouble();       // r > 0

        printf("Area: %.2f\n", areaOfDisk(r));      // r = 5 -> Area: 78.54
    }
}