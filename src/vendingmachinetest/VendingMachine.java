
package vendingmachinetest;

import java.util.Scanner;

public class VendingMachine {
    
    public VendingMachine(String name){
        Drink cola = new Drink("Cola",15,0);
        Drink water = new Drink("Water",7,6);
        Drink milk = new Drink("Milk",12,4);
        Drink juice = new Drink("Orange Juice",13,2);
        Machine m = new Machine(6);
        m.addDrink(cola);
        m.addDrink(water);
        m.addDrink(milk);
        m.addDrink(juice);
        int select;
        int money;
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println(m);
            System.out.print("Enter your money:");
            money = scn.nextInt();
            System.out.print("Select Drink:");
            select = scn.nextInt();
            m.check(money,select);
            System.out.println("");
        }while(select!=-1);
    }
}
