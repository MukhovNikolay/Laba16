package Laba16;

import java.util.HashMap;
import java.util.Set;

public class InternetOrderManager implements OrdersManager{
    HashMap<String, Order> AdrOrd = new HashMap<>();
    public void add(String address, Order order) {
        AdrOrd.put(address,order);
    }
    public Order Order(String address){
        return AdrOrd.get(address);
    }
    public Order remove(String address){
        return AdrOrd.remove(address);
    }
    public void addItem (String address, Item item){
        Order(address).add(item);
    }
    public Order[] getOrders(){
        Set<String> address = AdrOrd.keySet();
        String [] StrAddress = address.toArray(new String[0]);
        Order[] orders = new Order[address.size()];
        for(int i=0;i<StrAddress.length;i++){
            orders[i] = Order(StrAddress[i]);
        }
        return  orders;
    }
    public int ordersCostSummary(){
        Set<String> address = AdrOrd.keySet();
        String [] StrAddress = address.toArray(new String[0]);
        int cost=0;
        for(int i=0;i<StrAddress.length;i++){
            cost+=Order(StrAddress[i]).costTotal();
        }
        return cost;
    }
    public int ordersQuantity(){
        Set<String> address = AdrOrd.keySet();
        return address.size();
    }
    public int itemsQuantity(String itemName){
        Set<String> address = AdrOrd.keySet();
        String [] StrAddress = address.toArray(new String[0]);
        int quantity=0;
        for(int i=0;i<StrAddress.length;i++){
            quantity+=Order(StrAddress[i]).itemQuantity(itemName);
        }
        return quantity;
    }
    public int itemsQuantity(Item item){
        Set<String> address = AdrOrd.keySet();
        String [] StrAddress = address.toArray(new String[0]);
        int quantity=0;
        for(int i=0;i<StrAddress.length;i++){
            quantity+=Order(StrAddress[i]).itemQuantity(item);
        }
        return quantity;
    }
}
