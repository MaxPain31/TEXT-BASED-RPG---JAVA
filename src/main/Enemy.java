
package main;

import java.util.ArrayList;


public class Enemy extends Character {
    protected String description;
    private int expToGive;
    private int goldToGive;
    private ArrayList<Enemy> dataEnemy;
    public Enemy(String name,int HP,int atk,int exp,int gold, String Description){
       this.name = name;
       this.HP = HP;
       this.ATK = atk;
       this.isAlive = true;
       this.description = Description;
       this.expToGive = exp;
       this.goldToGive = gold;
    }
    public int getGoldToGive(){
        return this.goldToGive;
    }   
    public int getExpToGive(){
        return this.expToGive;
    }
    public String getDescription(){
        return this.description;
    }
    public void attack(Player p, Enemy e) {
        int damage = damageFormula(e);
        System.out.println( e.getName() + " attacks!\nDeals " + damage + " damage to " + p.getName() + " .");
        p.takeDamage(damage);
    }
    public void takeDamage(int dmg) {
        if (isAlive) {
            if (this.HP - dmg <= 0) {
                this.HP = 0;
                isAlive = false;
            } else {
                this.HP -= dmg;
            }
        }
    }
}
