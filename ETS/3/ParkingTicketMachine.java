/**
 * Write a description of class t here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ParkingTicketMachine {
    private int balance;
    private final int ticketPrice;
    private int ticketTime;

    public ParkingTicketMachine(int ticketPrice) {
        this.balance = 0;
        this.ticketPrice = ticketPrice;
        this.ticketTime = 0;
    }

    public void insertMoney(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Uang berhasil ditambahkan: Rp" + amount);
        } else {
            System.out.println("Masukkan jumlah yang valid.");
        }
    }

    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;
            balance = balance % ticketPrice;
            System.out.println("Tiket dikeluarkan. Anda telah membeli waktu parkir selama " + ticketTime + " jam.");
        } else {
            System.out.println("Saldo tidak mencukupi untuk membeli tiket.");
        }
    }

    public int getTimePurchased() {
        return ticketTime;
    }

    // Metode untuk mengecek saldo
    public int getBalance() {
        return balance;
    }
}
