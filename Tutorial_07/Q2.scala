class Rational(n1: Int, n2: Int){
    def p: Int = n1;    // p must != 0 so => n1 must != 0
    def q: Int = n2;    // q must != 0 so => n2 must != 0

    /* to get absolute value of a given number */
    private def abs(n: Int): Int = if(n < 0) -n else n;

    /* to get negative of a given rational number */
    private def neg(): Rational = new Rational(-this.p, this.q);

    /* to get GCD of 2 numbers */
    private def GCD(x: Int, y: Int): Int = {
        var a: Int = abs(x);
        var b: Int = abs(y);

        if(b == 0){
            a;
        }else{
            GCD(b, a % b);
        }
    }

    /* to add 2 rational numbers */
    def add(r: Rational): Rational = {
        var a: Int = (this.p * r.q) + (r.p * this.q);
        var b: Int = this.q * r.q;

        new Rational(a/GCD(a, b), b/GCD(a, b));     // solve the rational number further
    }

    /* to substract 2 rational numbers */
    def sub(r: Rational): Rational = add(r.neg());
}


object Q2{
    def main(args: Array[String]): Unit = {
        var (x1, x2) = (3, 4);  // for x
        var x: Rational = new Rational(x1, x2);

        var (y1, y2) = (5, 8);  // for y
        var y: Rational = new Rational(y1, y2);

        var (z1, z2) = (2, 7);  // for z
        var z: Rational = new Rational(z1, z2);

        var ans: Rational = x.sub(y).sub(z);        // x - y - z

        printf("%d/%d - %d/%d - %d/%d = %d/%d", x.p, x.q , y.p, y.q, z.p, z.q, ans.p, ans.q);   // ans => -36/224 = -9/56
    }
}