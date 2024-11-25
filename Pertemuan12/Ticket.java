
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    protected double baseFare;
    
    public Ticket(double baseFare){
        this.baseFare = baseFare;
    }
    
    public double calculateFare(){
        return baseFare;
    }
    
    public void display(){
        System.out.println("Tarif Dasar: Rp." + baseFare);
        System.out.println("Total: Rp." + calculateFare());
    }
}
