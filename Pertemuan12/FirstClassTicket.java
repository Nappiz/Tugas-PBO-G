
/**
 * Write a description of class FirstClassTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstClassTicket extends Ticket
{
    public FirstClassTicket(double baseFare){
        super(baseFare);
    }
    
    @Override
    public double calculateFare(){
        return baseFare + (baseFare * 0.50);
    }
}
