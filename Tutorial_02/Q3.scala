object Q3{
    def main(args: Array[String]) = {
        var (a, b, c, d) = (2, 3, 4, 5);
        var k = 4.3f;

        //println("(a)-> "+(--b * a + c * d--));    // error
        b -= 1;
        println("(a)-> "+(b * a + c * d));          // 24
        d -= 1;

        //println("(b)-> "+(a++));                  // error
        println("(b)-> "+(a));                      // 2
        a += 1;

        //println("(c)-> "+(-2 * (g - k) + c));     // g ?
        
        //println("(d)-> "+(c = c++));              // error
        println("(d)-> "+c);                        // 4

        //println("(e)-> "+(c = ++c * a++));        // error
        c += 1;
        c = c * a;
        a += 1;
        println("(e)-> "+(c));                      // 15
    }
}