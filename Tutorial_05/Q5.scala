object Q5{
    def evenSum(n: Int): Int = {
        var x: Int = 0;

        if(n > 0){
            if(n % 2 == 0){
                x = n + evenSum(n-2);
            }else{
                x = (n-1) + evenSum(n-3);
            }
        }
        
        return x;
    }

    def main(args: Array[String]) = {
        print("Enter upper bound: ");
        var n: Int = scala.io.StdIn.readInt();     // n > 0

        println("Even sum from 0 to " + n + ": " + evenSum(n));
    }
}