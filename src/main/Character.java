
package main;

import java.util.ArrayList;

public class Character {
    protected String name;
    protected String playerClass;
    protected String type;
    protected String gender;
    protected int maxHp;
    protected int maxMp;
    protected int ATK;
    protected int MGC;
    protected int HP;
    protected int MP;
    protected int dmgSkill;
    protected int defense;
    protected int magicDefense;
    protected Armor armor;
    protected Weapon weapon;
    protected int level;
    protected int xp;
    protected int gold;
    protected boolean isAlive;
    
    protected ArrayList <Skill> skills;
    protected ArrayList <Armor> inventoryArmors = new ArrayList<>();
    protected ArrayList <Weapon> inventoryWeapons = new ArrayList<>();
    protected ArrayList <Potion> inventoryPotions = new ArrayList<>();
    
    protected ArrayList <Armor> dataArmor = new ArrayList<>();
    protected ArrayList <Weapon> dataWeapon = new ArrayList<>();
    protected ArrayList <Potion> dataPotion = new ArrayList<>();;
    
    public Character(){
        
    }
    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHp;
    }

    public int getCurrentHP() {
        return HP;
    }

    public void setHP(int hpToSet) {
        MP = hpToSet;
    }

    public int getMaxMP() {
        return maxMp;
    }

    public int getCurrentMP() {
        return MP;
    }

    public void setMP(int mpToSet) {
        MP = mpToSet;
    }

    public int getAtt() {
        return ATK;
    }

    public int getMagicAttack() {
        return MGC;
    }

    public int getDef() {
        return defense;
    }

    public int getMagDef() {
        return magicDefense;
    }
    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon Weapon) {
        this.weapon = Weapon;
    }

    public Armor getArmor() {
        return this.armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    public int getLevel() {
        return this.level;
    }
    public void setLevel(int Level) {
        this.level = Level;
    }
    public int getExp() {
        return this.xp;
    }

    public void setExp(int exp) {
        this.xp = exp;
    }
    public void addExp(int experiencePts) {
        this.xp += experiencePts;
    }
    public void addGold(int gold) {
        this.xp += gold;
    }
    public int getGold() {
        return this.gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    public ArrayList<Potion> getInventoryPotions() {
        return this.inventoryPotions;
    }

    public void setInventoryPotions(ArrayList<Potion> inventoryPotions) {
        this.inventoryPotions = inventoryPotions;
    }

    public ArrayList<Weapon> getInventoryWeapons() {
        return this.inventoryWeapons;
    }

    public void setInventoryWeapons(ArrayList<Weapon> inventoryWeapons) {
        this.inventoryWeapons = inventoryWeapons;
    }

    public ArrayList<Armor> getInventoryArmors() {
        return this.inventoryArmors;
    }

    public void setInventoryArmors(ArrayList<Armor> inventoryArmors) {
        this.inventoryArmors = inventoryArmors;
    }
    public boolean getIsAlive() {
        return this.isAlive;
    }
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    public String getPlayerClass(){
        return this.playerClass;
    }
    public void setPlayerClass(String job){
        this.playerClass = job;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    static int damageFormula(Character attacker) {
        // get damage into a dbl (needs to be a dbl to multiply with randomPercentage
        double dmg = attacker.getAtt();
        // Implement a simple randomizer so that damage isn't always the same
        // get random percentage between 0% and 13%
        double randomElement = dmg * randomPercentage();
        // Get a randomInt
        int randomInt = (int)Math.ceil(randomElement);
        // randomly select if randomInt should be used to increase or decrease damage output. Then return actual damage
        int decreaseOrIncrease = (int)Math.round(Math.random());
        if (decreaseOrIncrease == 0) {
            return (int)dmg - randomInt;
        } else {
            return (int)dmg + randomInt;
        }
    }
    static double randomPercentage() {
        return Math.floor(Math.random() * 9) / 100;
    }
    public int restartHP(int hp){
        return HP;
    }
}
