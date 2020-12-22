package Laba16;

import java.util.Arrays;

public class TableOrder implements Order{
    private Item items[] = new Item[15];
    private int index,j;
    public int getIndex() {
        return index;
    }
    public boolean remove(String itemName){
        if(Arrays.asList(itemsNames()).contains(itemName)){
            for(int i=index-1;i>0;i--) {
                if (items[i].getName().equals(itemName)){
                    this.j=i;
                    i=0;
                }
            }
            for(int i=j;i<index;i++){
                items[i]=items[i+1];
            }
            this.index--;
            System.out.println(index);
            return true;
        }
        else {
            return false;
        }
    }
    public boolean removeAll(String itemName){
        if (remove(itemName)){
            System.out.println(true);
            while (!remove(itemName)) {
            }
            return true;
        }
        else {
            return false;
        }
    }
    public Item[] sortedItemsByCostDesc(){
        for(int i=0;i<index-1;i++){
            for(int j=0;j<index-1;j++) {
                if(items[j].getCost()<items[j+1].getCost()){
                    Item min = items[j];
                    items[j]=items[j+1];
                    items[j+1]=min;
                }
            }
        }
        return items;
    }
    public boolean add(Item item){
        if(index==15){
            return false;
        }
        items[index]=item;
        index++;
        return true;
    }
    public void addItems(Item array[]){
        for(int i=0;i< array.length;i++){
            items[index]=array[i];
            index++;
        }
    }
    public int itemQuantity(){
        int i=0;
        while (items[i]!=null){
            i++;
        }
        return i;
    }
    public Item[] getItems(){
        return items;
    }
    public int costTotal(){
        int cost=0;
        for(int i=0;i< index;i++){
            cost+=items[i].getCost();
        }
        return cost;
    }
    public int itemQuantity(Item item){
        int quantity=0;
        for(int i=0;i<index;i++){
            if (items[i].equals(item)) quantity++;
        }
        return  quantity;
    }
    public int itemQuantity(String itemName){
        int quantity=0;
        for(int i=0;i<index;i++){
            if (items[i].getName().equals(itemName)) quantity++;
        }
        return  quantity;
    }
    public String[] itemsNames(){
        String names[]= new String[index];
        int j=0;
        for(int i=0;i<index;i++){
            names[j]=items[i].getName();
            j++;
        }
        return names;
    }
}
