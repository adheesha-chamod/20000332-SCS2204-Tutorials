object Q1{
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

    def main(args: Array[String]) = {
        print("Enter positive integer: ");
        var n: Int = scala.io.StdIn.readInt();     // n > 0

        if(isPrime(n)){
            println(" Prime number");
        }else{
            println(" Not a prime number");
        }
    }
}