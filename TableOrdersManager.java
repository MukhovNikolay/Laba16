package Laba16;

import java.util.HashMap;
import java.util.Set;

public class TableOrdersManager implements OrdersManager{
    HashMap<Integer, Order> TabOrd = new HashMap<>();
    public void add(int tableNumber, Order order) {
        TabOrd.put(tableNumber,order);
    }
    public Order getOrder(int tableNumber){
        return TabOrd.get(tableNumber);
    }
    public void remove(int tableNumber){
        TabOrd.remove(tableNumber);
    }
    public int freeTableNumber() {
        Set<Integer> tables = TabOrd.keySet();
        int free = -1;
        Integer[] intTables = tables.toArray(new Integer[0]);
        for (int i = 0; i < intTables.length; i++) {
            for (int j = 0; j < 15; i++) {
                if (j != intTables[i]) {
                    free = j;
                    j = 15;
                    i = intTables.length;
                }
            }
        }
        return free;
    }
    public int[] freeTableNumbers(){
        Set<Integer> tables = TabOrd.keySet();
        int free[] = new int[15-tables.size()];
        int freeIndex=0;
        Integer [] intTables = tables.toArray(new Integer[0]);
        for(int i=0;i<intTables.length;i++){
            for(int j=0;j<15;i++){
                if(j!=intTables[i]) {
                    free[freeIndex++]=j;
                    j=15;
                    i=intTables.length;
                }
            }
        }
        return free;
    }
    public void addItem (int tableNumber, Item item){
        getOrder(tableNumber).add(item);
    }
    public Order[] getOrders(){
        Set<Integer> tables = TabOrd.keySet();
        Integer [] intTables = tables.toArray(new Integer[0]);
        Order[] orders = new Order[tables.size()];
        for(int i=0;i<intTables.length;i++){
            orders[i] = getOrder(intTables[i]);
        }
        return  orders;
    }
    public int ordersCostSummary(){
        Set<Integer> tables = TabOrd.keySet();
        Integer [] intTables = tables.toArray(new Integer[0]);
        int cost=0;
        for(int i=0;i<intTables.length;i++){
            cost+=getOrder(intTables[i]).costTotal();
        }
        return cost;
    }
    public int ordersQuantity(){
        Set<Integer> tables = TabOrd.keySet();
        return tables.size();
    }
    public int itemsQuantity(String itemName){
        Set<Integer> tables = TabOrd.keySet();
        Integer [] intTables = tables.toArray(new Integer[0]);
        int quantity=0;
        for(int i=0;i<intTables.length;i++){
            quantity+=getOrder(intTables[i]).itemQuantity(itemName);
        }
        return quantity;
    }
    public int itemsQuantity(Item item){
        Set<Integer> tables = TabOrd.keySet();
        Integer [] intTables = tables.toArray(new Integer[0]);
        int quantity=0;
        for(int i=0;i<intTables.length;i++){
            quantity+=getOrder(intTables[i]).itemQuantity(item);
        }
        return quantity;
    }
}
