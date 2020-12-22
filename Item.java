package Laba16;

public class Item {
    private String name;
    private String description;
    private int cost;
    Item(String name,String description,int cost){
        this.cost = cost;
        this.description = description;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getCost(){
        return cost;
    }
}
