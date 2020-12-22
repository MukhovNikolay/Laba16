package Laba16;

public class Drink extends Item{
    private DrinkTypeEnum type;
    public Drink(String name,String description,int cost,DrinkTypeEnum type){
        super(name,description,cost);
        this.type = type;
    }
}
