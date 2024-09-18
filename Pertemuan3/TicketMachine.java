public class TicketMachine{
    private int price;
    private int balance;
    private int total;
    
    public TicketMachine(int cost){
        price = cost;
        balance = 0;
        total = 0;
    }
    
    public int hargaTiket(){
        return price;
    }
    
    public void masukkanUang(int amount){
        if(amount >= 0){
            balance = balance + amount;
        }else{
            System.out.println("Masukkan uang lebih dari " + amount);
        }
    }

    public int getUang(){
        return balance;
    }
    
    public int transaksi(){
        if(balance >= price){
            total = total + price;
            balance = balance - price;
            return balance;
        }else{
            System.out.println("Uang anda tidak cukup, kurang Rp." + (price - balance));
            return balance;
        }
    }
    
    public int kembalian(){
        int refund = balance;
        balance = 0;
        System.out.println("Kembalianmu adalah: Rp." + refund);
        return refund;
    }
    
    public void print(){
        if(balance >= price){
            System.out.println("********");
            System.out.println("* Ticket Machine BlueJ");
            System.out.println("* Rp." + price);
            System.out.println("* " + kembalian());
            System.out.println("********");
        }else{
            System.out.println("Uang anda tidak cukup, kurang Rp." + (price - balance));
        }
    }
    
    public int total(){
        return total;
    }
}
