
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
        if(select==-1){
            System.out.println("Admin using");
        }
        else if(select<0||select>3){
            System.out.println("Unknown input");
        }
        else if(machine[select].getNum()==0){
            System.out.println("Sold out");
        }
        else if(select<index){
            int cost = machine[select].getCost();
            mon = new Money(money,select,cost);
            if(money>=cost){
                machine[select].tookOut();
            }
        }
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
