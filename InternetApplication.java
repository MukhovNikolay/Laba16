package Laba16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InternetApplication extends JFrame {
    int flag=0;
    InternetApplication(String Login,String Password,Address address,Item [] items,Order Order) {
        JFrame F1 = new JFrame("Интернет заказ");
        JMenuBar Mb1 = new JMenuBar();
        JMenu Dish = new JMenu("Блюда");
        JMenu Drink = new JMenu("Напитки");
        JButton Enter = new JButton("Enter");
        JButton order = new JButton("Оформить заказ");
        JButton FOrder = new JButton("Закончить заказ");
        JTextField login = new JTextField();
        JTextField password = new JTextField();
        JMenuItem rice = new JMenuItem("Рис");
        JMenuItem fish = new JMenuItem("Рыба");
        JMenuItem meat = new JMenuItem("Мясо");
        JMenuItem makaroni = new JMenuItem("Макароны");
        JMenuItem vodka = new JMenuItem("Водка");
        JMenuItem juice = new JMenuItem("Сок");
        JMenuItem coffee = new JMenuItem("Кофе");
        JTextArea Ar1 = new JTextArea();
        Dish.add(rice);
        Dish.add(makaroni);
        Dish.add(meat);
        Dish.add(fish);
        Mb1.add(Dish);
        Drink.add(vodka);
        Drink.add(juice);
        Drink.add(coffee);
        Mb1.add(Drink);
        Ar1.setBounds(0,0,300,300);
        login.setBounds(200,200,200,50);
        password.setBounds(200,250,100,50);
        order.setBounds(200,100,250,50);
        FOrder.setBounds(300,100,250,50);
        Enter.setBounds(200,100,250,50);
        F1.setSize(600,400);
        F1.setLayout(null);
        F1.add(Enter);
        F1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    login.setText("Введите Login");
                    password.setText("Введите пароль");
                    F1.add(login);
                    F1.add(password);
                    flag = 1;
                    Enter.setText("Enter");
                    F1.add(Enter);
                }
                else{
                    if((login.getText().equals(Login))&&(password.getText().equals(Password))){
                        login.setText("");
                        password.setText("");
                        F1.remove(login);
                        F1.remove(password);
                        F1.add(Enter);
                        F1.setTitle("Личный кабинет пользователя "+Login);
                        F1.remove(Enter);
                        F1.add(order);
                        flag=0;
                        F1.repaint();
                    }
                    else{
                        Enter.setText("Пароль не верен ");
                        flag=0;
                    }
                }
            }
        });
        order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    order.setText("Оформить заказ");
                    login.setText("Введите адрес(Город улица дом)");
                    F1.add(login);
                    flag=1;
                }
                    else{
                        if(login.getText().equals(address.getCityName()+" "+address.getStreetName()+" "+address.getBuildingNumber())){
                            F1.remove(login);
                            F1.repaint();
                            F1.setJMenuBar(Mb1);
                            F1.add(Ar1);
                            F1.remove(order);
                            F1.add(FOrder);
                            F1.repaint();
                        }else{
                            order.setText("Адрес не верен");
                            flag=0;
                        }
                    }
            }
        });
        rice.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Order.add(items[1]);
            Ar1.setText(Ar1.getText()+"\n"+
                    items[1].getName()+" "+items[1].getDescription()+" "+items[1].getCost()+".руб");
        }
        });
        fish.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Order.add(items[0]);
                Ar1.setText(Ar1.getText()+"\n"+
                        items[0].getName()+" "+items[0].getDescription()+" "+items[0].getCost()+".руб");
            }
        });
        meat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Order.add(items[2]);
                Ar1.setText(Ar1.getText()+"\n"+
                        items[2].getName()+" "+items[2].getDescription()+" "+items[2].getCost()+".руб");
            }
        });
        makaroni.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Order.add(items[3]);
                Ar1.setText(Ar1.getText()+"\n"+
                        items[3].getName()+" "+items[3].getDescription()+" "+items[3].getCost()+".руб");
            }
        });
        vodka.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Order.add(items[4]);
                Ar1.setText(Ar1.getText()+"\n"+
                        items[4].getName()+" "+items[4].getDescription()+" "+items[4].getCost()+".руб");
            }
        });
        juice.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Order.add(items[5]);
                Ar1.setText(Ar1.getText()+"\n"+
                        items[5].getName()+" "+items[5].getDescription()+" "+items[5].getCost()+".руб");
            }
        });
        coffee.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Order.add(items[6]);
                Ar1.setText(Ar1.getText()+"\n"+
                        items[6].getName()+" "+items[6].getDescription()+" "+items[6].getCost()+".руб");
            }
        });
        FOrder.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Ar1.setText(Ar1.getText()+"\n"
                        +"Общая стоимость вашего заказа:"+Order.costTotal()+".руб"+"\nСпасибо за покупку");
                F1.remove(Mb1);
                F1.remove(FOrder);
                F1.repaint();

            }
        });
        F1.setVisible(true);
    }
}
