import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<String> menuItems;
    private int totalPrice;
    private boolean isPaid;

    public FoodOrder() {
        menuItems = new ArrayList<>();
        totalPrice = 0;
        isPaid = false;
    }

    public void addItem(String item, int price) {
        menuItems.add(item);
        totalPrice += price;
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public void printOrderDetails() {
        System.out.println("Rincian Pesanan:");
        for (String item : menuItems) {
            System.out.println("- " + item);
        }
        System.out.println("Total Harga: Rp" + totalPrice);
        System.out.println("Status Pembayaran: " + (isPaid ? "Sudah Dibayar" : "Belum Dibayar"));
    }
}
