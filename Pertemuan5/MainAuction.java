
/**
 * Write a description of class MainAucation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainAuction
{
    public static void main(String[] args) {
        Auction auction = new Auction();

        auction.enterLot("CBR-250RR");
        auction.enterLot("ZX-10R");
        auction.enterLot("KTM-250RC");

        System.out.println("Available Lots:");
        auction.showLots();

        Person person1 = new Person("Nafiz");
        Person person2 = new Person("Ivan");
        Person person3 = new Person("Cia");

        System.out.println("\nBidding:");

        auction.makeABid(1, person1, 100);
        auction.makeABid(1, person2, 80);
        auction.makeABid(1, person2, 120);
        auction.makeABid(2, person1, 5000);
        auction.makeABid(2, person3, 1000);
        auction.makeABid(3, person3, 2000);

        System.out.println("\nINFO:");
        auction.showLots();
    }
}
