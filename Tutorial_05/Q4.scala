object Q4{
    def check(n: Int): Any= {
        if(n > 1){
            check(n - 1);
        }

        if(n % 2 == 0){
            printf("%d is even\n", n);
        }else{
            printf("%d is odd\n", n);
        }
    }

    def main(args: Array[String]) = {
        print("Enter upper bound: ");
        var n: Int = scala.io.StdIn.readInt();     // n > 0

        check(n);
    }
}