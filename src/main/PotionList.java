
package main;

import java.util.ArrayList;

public class PotionList {
  
    Potion smallHPotion = new Potion("Small HP Potion",20,50,0,"Healing Potion");
    Potion mediumHPotion = new Potion("Medium HP Potion",50,100,0,"Healing Potion");
    Potion highHPotion = new Potion("High HP Potion",150,500,0,"Healing Potion");
    
    Potion smallMPotion = new Potion("Small MP Potion",20,0,20,"Mana Potion");
    Potion mediumMPotion = new Potion("Medium MP Potion",50,0,40,"Mana Potion");
    Potion highMPotion = new Potion("High MP Potion",150,0,100,"Mana Potion");
    
    public Potion getsmallHPotion(){
        return smallHPotion;
    }
    public Potion getmediumHPotion(){
        return mediumHPotion;
    }
    public Potion gethighHPotion(){
        return highHPotion;
    }
    
    public Potion getsmallMPotion(){
        return smallMPotion;
    }
    public Potion getmediumMPotion(){
        return mediumMPotion;
    }
    public Potion gethighMPotion(){
        return highMPotion;
    }
}
