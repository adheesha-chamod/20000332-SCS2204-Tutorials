object Q3{
    def toUpper(str: String): String = {
        str.toUpperCase();
    }

    def toLower(str: String): String = {
        str.toLowerCase();
    }

    def formatName(name: String)(func: String => String): String = {
        func(name);
    }

    def main(args: Array[String]) = {
        var s1: String = "Benny";
        var s2: String = "Niroshan";
        var s3: String = "Saman";
        var s4: String = "Kumara";

        println(formatName(s1)(toUpper(_)));        // BENNY
        println(formatName(s2.substring(0,2))(toUpper(_)) + s2.substring(2));   // NIroshan
        println(formatName(s3)(toLower(_)));        // saman
        println(formatName(s4.substring(0,1))(toUpper(_)) + s4.substring(1,5) + formatName(s4.substring(5))(toUpper(_)));   // KumarA
    }
}