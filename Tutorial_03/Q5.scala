object Q5{
    /* d <- distance */
    def easyPace(d: Int) = {
        d*8;    // d km * 8 min.km-1 => result: 8d min
    }

    def tempo(d: Int) = {
        d*7;    // d km * 7 min.km-1 => result: 7d min
    }

    def main(args: Array[String]) = {
        var totalTime: Int = easyPace(2) + tempo(3) + easyPace(2);
        println("Total running time: "+totalTime+" min");
    }
}