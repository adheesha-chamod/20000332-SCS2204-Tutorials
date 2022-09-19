import scala.io.StdIn.*;

object Q2{
    def main(args: Array[String]) = {
        print("Enter integer value: ");
        var x: Int = readInt();

        x match{
            case x if x < 0 || x == 0 => println("Negative/Zero");
            case x if x%2 == 0 => println("Even");
            case _ => println("Odd");
        }
    }
}