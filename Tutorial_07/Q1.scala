class Rational(n1: Int, n2: Int){
    def p: Int = n1;    // p must != 0 so => n1 must != 0
    def q: Int = n2;    // q must != 0 so => n2 must != 0

    def neg(): Rational = {
        new Rational(-p, q);
    }
}


object Q1{
    def main(args: Array[String]): Unit = {
        var n1: Int = 1;
        var n2: Int = 2;

        var x: Rational = new Rational(n1, n2);
        printf("Negation of %d/%d: %d/%d\n", n1, n2, x.neg().p, x.neg().q);
    }
}