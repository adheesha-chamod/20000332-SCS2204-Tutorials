object Q6{
    def fib(n: Int): Int = {
        n match{
            case 0 | 1 => n;
            case _ => fib(n - 1) + fib(n - 2);
        }
    }

    def fibSeq(n: Int): Any = {
        if(n > 0){
            fibSeq(n - 1);
        }

        printf("%d  ", fib(n));
    }

    def main(args: Array[String]) = {
        print("Enter integer: ");
        var n: Int = scala.io.StdIn.readInt();     // n > 0

        fibSeq(n - 1);
    }
}