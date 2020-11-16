
package vendingmachinetest;

public class Machine {
    private final Drink machine[];
    private int index=0;
    private Money mon;
    
    public Machine(int size){
        machine = new Drink[size<=0 ? 12 : size];
    }    
    public void addDrink(Drink drink){
        if(index<machine.length){
            machine[index] = drink;
            index++;
        }
    }    
    public int getNumDrink(int select){
        return machine[select].getNum();
    }    
    public int getCostDrink(int select){
        return machine[select].getCost();
    }
    public String getNameDrink(int select){
        return machine[select].getName();
    }
    public void tookOut(int select){
        machine[select].tookOut();
    }
    public void check(int money,int select){
        mon = new Money(money,select,machine);
    }
    
    
    @Override
    public String toString() {
        System.out.println("Allow drink in machine:");
        for (int i = 0; i < index; i++) {
            System.out.println(i + ": " + machine[i]);
        }
        return "";
    }
    
}
