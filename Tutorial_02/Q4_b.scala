object Q4_b{
    var cost1: Float = 500.0;   // fixed cost
    var cost2: Float = 3.0;     // cost for each attendee

    def attendeesCount(ticket: Int): Int = {
        120 + ((15 - ticket) / 5) * 20;     // ticket-> ticket price
    }

    def totalIncome(ticket: Int): Int = {
        attendeesCount(ticket) * ticket;
    }

    def totalCost(ticket: Int): Float = {
        cost1 + cost2 * attendeesCount(ticket);
    }

    def profit(ticket: Int): Float = {
        totalIncome(ticket) - totalCost(ticket);
    }

    def main(args: Array[String])={
        println("Ticket price Rs. 10-> Profit: Rs."+profit(10));
        println("Ticket price Rs. 15-> Profit: Rs."+profit(15));
        println("Ticket price Rs. 20-> Profit: Rs."+profit(20));
    }
}