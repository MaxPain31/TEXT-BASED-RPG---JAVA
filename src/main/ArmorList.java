package main;

import java.util.ArrayList;


public class ArmorList {
    private ArrayList<Armor> dataArmor;
        Armor beginnerArmor = new Armor("Beginner Armor",100,25,10,10);
        Armor adeptPlate = new Armor("Adept's Plate",200,50,20,20);
        Armor eliteVanguard = new Armor("Elite's Vanguard",1000,200,50,50);
        Armor legendaryWarplate = new Armor("Legendary's Warplate",5000,500,75,75);
    
    public Armor getbeginnerArmor(){
        return beginnerArmor;
    }
    public Armor getadeptPlate(){
        return adeptPlate;
    }
    public Armor geteliteVanguard(){
        return eliteVanguard;
    }
    public Armor getlegendaryWarplate(){
        return legendaryWarplate;
    }   
    
}
