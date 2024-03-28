
package main;

import java.util.ArrayList;

public class Potion{
    protected String name;
    protected int price;
    protected int HP;
    protected int MP;
    protected String type;
    private ArrayList<Potion> dataPotion;
    
    public Potion(String name, int price,int HP,int MP,String type){
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.price = price;
        this.type = type;
        dataPotion = new ArrayList();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setHP(int HP){
        this.HP = HP;
    }
    public int getHP(){
        return HP;
    }
    public void setMP(int MP){
        this.MP = MP;
    }
    public int getMP(){
        return MP;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public ArrayList<Potion> getPotion(){
        return this.dataPotion;
    }
    public void setPotion(ArrayList<Potion> Potion){
        this.dataPotion = Potion;
    }
}
