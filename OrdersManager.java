package Laba16;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(Item item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();

}
