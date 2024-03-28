
package main;

import java.util.ArrayList;


public class Weapon extends Equipment{
    private int additionalPower;
    private String job;
    private ArrayList<Weapon> dataWeapon;
    
    public Weapon(String name,int price,int additionaPower, String job){
        super(name,price);
        this.additionalPower = additionaPower;
        this.job = job;
        dataWeapon = new ArrayList<Weapon>();
        
    }
    public void setAdditionalPower(int additionalPower){
        this.additionalPower = additionalPower;
    }
    public int getAdditionalPower(){
        return this.additionalPower;
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return job;
    }
    public ArrayList<Weapon> getWeapon() {
        return this.dataWeapon;
    }

    public void setWeapon(ArrayList<Weapon> weapon) {
        this.dataWeapon = weapon;
    }

    @Override
    public int updateStat(int baseAtk) {
        return this.getAdditionalPower() + baseAtk;
    }	//Overloading
    public void showChar(){
        super.showChar(false);
		System.out.println("Type      -> " + this.job);
        System.out.println("Damage    -> " + this.additionalPower);
    }
    //Overloading
    public void showChar(boolean ver){
        if (ver) {
            super.showChar(true);
            System.out.println("Damage    -> " + this.additionalPower);
            System.out.println("Type      -> " + this.job);
        }
        else {
            showChar(false);
        }
    }
}
