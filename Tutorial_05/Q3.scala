object Q3{
    def sum(n: Int): Int = {
        if(n > 0){
            return n + sum(n-1);
        }
        return 0;
    }

    def main(args: Array[String]) = {
        print("Enter upper bound: ");
        var n: Int = scala.io.StdIn.readInt();     // n > 0

        println("Sum from 1 to " + n + ": " + sum(n));
    }
}