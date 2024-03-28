
package main;

import java.util.ArrayList;


public class Armor extends Equipment{
    protected int additionalHP;
    protected int additionalDef;
    protected int additionalMagicDef;
    private ArrayList<Armor> dataArmor;
    
    public Armor(String name,int price, int addHP,int addDef, int addMgcDef){
        super(name,price);
        this.additionalHP = addHP;
        this.additionalDef = addDef;
        this.additionalMagicDef = addMgcDef;
        this.price = price;
        dataArmor = new ArrayList<>();
    }
    @Override
    public int updateStat(int baseHP) {
        return this.getAdditionaHP() + baseHP;
    }
    public int updateStatDef(int baseDef){
        return this.getAdditionalDef() + baseDef;
    }
    public int updateStatMagicDef(int baseMgcDef){
        return this.getAdditionalMagicDef() + baseMgcDef;
    }
    public ArrayList<Armor> getArmor(){
        return this.dataArmor;
    }
    public void setArmor(ArrayList<Armor> Armor){
        this.dataArmor = Armor;
    }
    public int getAdditionaHP(){
        return this.additionalHP;
    }
    public void setAdditionalHP(int additionalHP){
        this.additionalHP = additionalHP;
    }
    public int getAdditionalDef(){
        return this.additionalDef;
    }
    public void setAdditionalDef(int additionalDef){
        this.additionalDef = additionalDef;
    }
    public int getAdditionalMagicDef(){
        return this.additionalMagicDef;
    }
    public void setAdditionalMagicDef(int additionalMagicDef){
        this.additionalMagicDef = additionalMagicDef;
    }
    //Overloading
    public void showChar(){
            super.showChar(false);
            System.out.println("Additonal HP -> " + this.additionalHP);
    }
    //Overloading
    public void showChar(boolean ver){
            if (ver) {
                super.showChar(true);
                System.out.println("Additional Hp -> " + this.additionalHP);
            }
            else {
                showChar();
            }
        }
}
