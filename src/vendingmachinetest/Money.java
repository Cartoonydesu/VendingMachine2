
package vendingmachinetest;

public class Money {
    public Money(int money,int cost){
        if(money<0){
            System.out.println("Please enter money again");
        }
        else if(money<cost){
            notEnough(money);
        }
        else if(money>=cost){
            buy(money,cost);
        }
    }
    private void notEnough(int money){
            System.out.println("Not enough money to buy");
            System.out.println("Return : " + money + " bahts");   
    }
    private void buy(int money,int cost){
            money = money - cost;
            System.out.println("Output : " + "Receive drink"+
                                "\nChange : " + money + " bahts");
    }
}
