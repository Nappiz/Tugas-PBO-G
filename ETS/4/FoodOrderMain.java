public class FoodOrderMain {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        
        order.addItem("Nasi Goreng", 25000);
        order.addItem("Ayam Bakar", 30000);
        order.addItem("Es Teh", 5000);
        
        order.printOrderDetails();
        
        order.markAsPaid();
        
        order.printOrderDetails();
    }
}
