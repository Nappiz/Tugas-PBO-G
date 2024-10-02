
/**
 * Write a description of class Bid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bid {
    private Person bidder;
    private double value;

    public Bid(Person bidder, double value) {
        this.bidder = bidder;
        this.value = value;
    }

    public Person getBidder() {
        return bidder;
    }

    public double getValue() {
        return value;
    }
}
