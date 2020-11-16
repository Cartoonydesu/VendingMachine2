
package vendingmachinetest;

 public class Drink {
    private final String name;
    private final int cost;
    private int num;
    
    public Drink(String name,int cost,int num){
        this.name = name;
        this.cost = cost;
        this.num = num;
    }
    public String getName(){return name;}
    public int getCost(){return cost;}
    public int getNum(){return num;}
    public void addNum(int add){num+=add;}
    public void tookOut(){num=num-1;}
    
    @Override
    public String toString(){
        return this.getName() + " [" + "cost: " + this.getCost() + " bahts, num left: " + this.getNum() + " bottles]";
    }
}
