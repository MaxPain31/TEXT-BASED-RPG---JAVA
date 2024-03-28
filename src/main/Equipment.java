
package main;


public abstract class Equipment {
    
    protected String name;
    protected int price;
    public abstract int updateStat(int baseAtk);
    
    public Equipment(String name,int price){
        this.name = name;
        this.price = price;
    }
   public String getName(){
       return this.name;
   }
   public void setName(String name){
       this.name = name;
   }
   public int getPrice(){
       return this.price;
   }
   public void setPrice(int price){
       this.price = price;
   }
   public void showChar(boolean ver){
        if (ver) {
            System.out.println("Name        -> " + this.name);
            System.out.println("Price       -> " + this.price);
        }
        else {
            System.out.println("Name        -> " + this.name);
            System.out.println("Price       -> " + this.price);
        }
    }
}
