package Laba16;

public class TestApplication {
    public static void main(String[]args){
        Item [] items= new Item[7];
        Order Or1 = new InternetOrder();
        items[0]=new Dish("Рыба","Жаренная ",300);
        items[1] = new Dish("Рис", "Вареный", 200);
        items[2] = new Dish("Мясо", "Жаренное", 500);
        items[3] = new Dish("Макароны", "Альденте", 250);
        items[4] = new Drink("Водка", "0.5 л", 300,DrinkTypeEnum.Vodka);
        items[5] = new Drink("Сок", "1 л", 250,DrinkTypeEnum.Juice);
        items[6] = new Drink("Кофе", "0.25 л", 100,DrinkTypeEnum.Coffee);
        Address address = new Address("Тула","Переулок",29);
        InternetApplication A1 = new InternetApplication("White","Niko",address,items,Or1);
    }
}
