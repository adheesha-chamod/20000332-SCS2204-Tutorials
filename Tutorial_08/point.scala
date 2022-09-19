import math.{sqrt, pow}

case class Point(a: Int, b: Int){
    def x: Int = a;     // x -> x coordinate
    def y: Int = b;     // y -> y coordinate

    /* add 2 given points */
    def +(that: Point): Point = {
        Point(this.x + that.x, this.y + that.y);
    }

    /* move the point by given distance dx and dy */
    def move(dx: Int, dy: Int): Point = {
        Point(this.x + dx, this.y + dy);
    }

    /* find distance from current point to a given point */
    def distance(that: Point): Double = {
        val dx = this.x - that.x;       // dx -> difference between x coordinates
        val dy = this.y - that.y;       // dy -> difference between y coordinates
        sqrt(pow(dx, 2) + pow(dy, 2));
    }

    /* switch the x and y coordinates of a given point */
    def invert(): Point = {
        Point(this.y, this.x);
    }
}

object Runner{
    def main(args: Array[String]): Unit = {
        var p1: Point = Point(4, 6);
        var p2: Point = Point(1, 2);

        printf("%s + %s: %s\n", p1, p2, (p1 + p2));

        printf("\n");

        printf("Before modify: %s\n", p1);
        printf("After modify: %s\n", p1.move(-2, 2));

        printf("\n");

        printf("Distance between %s and %s: %.2f\n", p1, p2, p1.distance(p2));

        printf("\n");

        printf("Before switch: %s\n", p1);
        printf("After switch: %s\n", p1.invert());
    }
}