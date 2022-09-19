object Q1{
    def main(args: Array[String]) = {
        var k, i, j = 2;
        var m, n = 5;
        var f = 12f;
        var g = 4f;
        var c = 'X';

        println("(a)-> "+(k + 12 * m));     // 62
        
        println("(b)-> "+(m / j));          // 2
        
        println("(c)-> "+(n % j));          // 1
        
        println("(d)-> "+(m / j * j));      // 4
        
        println("(e)-> "+(f + 10 * 5 + g)); // 66.0
        
        //println("(f) -> "+(++i * n));     // error
        i += 1;
        println("(f)-> "+(i*n));            // 15
    }
}