object Q2{
    def GCD(a: Int, b: Int): Int = {
        b match{
            case 0 => a;
            case b if b > a => GCD(b, a);
            case _ => GCD(b, a % b);
        }
    }

    def isPrime(n: Int, i: Int = 2):Boolean = {
        i match{
            case i if n == 1 => false;
            case i if n == i => true;
            case i if GCD(n, i) > 1 => false;
            case i => isPrime(n, i + 1);
        }
    }

    def primeSeq(n: Int): Any = {
        if(n > 0){
            primeSeq(n - 1);
        }

        if(isPrime(n)){
            printf("%d  ", n);
        }
    }


    def main(args: Array[String]) = {
        print("Enter upper bound: ");
        var n: Int = scala.io.StdIn.readInt();     // n > 1

        primeSeq(n);
    }
}