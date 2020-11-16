
package vendingmachinetest;

public class Money {
    private int mon;
    Machine machine[];
        
    public Money(int money, int select,Drink[] machine){
        if(machine[select].getNum()==0){
            soldOut(money);
        }
        else if(money<machine[select].getCost()){
            notEnough(money);
        }
        else if(money>=machine[select].getCost()){
            buy(money, select,machine);
        }
    }
    public void soldOut(int money){
            System.out.println("Sold Out");
            System.out.println("Return : " + money + " bahts");
    }
    public void notEnough(int money){
            System.out.println("Not enough money to buy");
            System.out.println("Return : " + money + " bahts");   
    }
    public void buy(int money,int select,Drink[] machine){
            money = money - machine[select].getCost();
            machine[select].tookOut();
            System.out.println("Output : " + machine[select].getName()+
                                "\nChange : " + money + " bahts");
    }
}
