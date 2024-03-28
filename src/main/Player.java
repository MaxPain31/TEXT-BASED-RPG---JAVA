
package main;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * The Player class represents a player character in a game.
 * It extends the Character class and contains methods and attributes specific to the player.
 */
public class Player extends Character{
    Dungeon d = new Dungeon();
    Battle b = new Battle();
    Home home = new Home();
    private Weapon equippedWeapon;
    private SkillList listSkill = new SkillList();
    private WeaponList weaponList = new WeaponList();
    private ArmorList armorList = new ArmorList();
    private PotionList potionList = new PotionList();
    static Validator validator = new Validator();
    
    Scanner sc = new Scanner(System.in);
    
    /**
     * Constructs a new Player object with the given name and initializes its attributes.
     *
     * @param name the name of the player
     */
    public Player(String name){
        //Trail Blaizer
        this.name = name;
        this.playerClass = "Trail Blaizer";
        this.type = type;
        this.level = 1;
        this.maxHp = 200;
        this.maxMp = 20;
        this.HP = 200;
        this.MP = 20;
        this.ATK = 20;
        this.MGC = 5;
        this.defense = 30;
        this.magicDefense = 30;
        this.gold = 100;
        this.xp = 0;
        this.isAlive = true;
        this.skills = new ArrayList<>();
        this.skills.add(listSkill.getLightningStrike(this));
        this.skills.add(listSkill.getMeditate(this));
        this.inventoryWeapons.add(weaponList.getBeginnerSword());
        this.inventoryArmors.add(armorList.getbeginnerArmor());
    }
        /**
     * Displays the player's profile information.
     *
     * @param player the player object
     * @throws IOException            if an I/O error occurs
     * @throws InterruptedException if the execution is interrupted
     */
    public void showProfile(Player player) throws IOException, InterruptedException{
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        boolean status = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("               P R O F I L E                     ");
        System.out.println("=================[STATUS]========================");
        System.out.println("Name            : "+this.name);
        System.out.println("Class           : "+this.playerClass);
        System.out.println("Level           : "+this.level);
        System.out.println("-------------------------------------------------");
        System.out.println("HP              : "+this.HP+"/"+this.maxHp);
        System.out.println("MP              : "+this.MP+"/"+this.maxMp);
        System.out.println("Attack          : "+this.ATK);
        System.out.println("Magic           : "+this.MGC);
        System.out.println("Defense         : "+this.defense);
        System.out.println("Magic Defense   : "+this.magicDefense);
        showSkill();
        System.out.println();
        System.out.println("0. Back");
        do {
            boolean inputValid = false;
            System.out.print("ENTER CHOICE >> ");
            String input = sc.nextLine();
            try{
                validator.validate(input, "0");
                inputValid = true;
            }catch(InvalidInputException ie){
                System.out.println("Invalid input.");
            }
            if (input.equals("0")) {
                home.showHome(player);
            }
            if (status) break;
        } while (status == false);
    }
        /**
     * Displays the player's skills.
     */
    public void showSkill(){
        int i = 1;
            System.out.println("=================[SKILLS]========================");
            for (Skill skill : skills) {
                System.out.println(i+" : " + skill.getSkillName() + " - " + skill.getMpCost() + " MP");
                i++;
            }
    }
        /**
     * Displays the available potions in the shop.
     *
     * @param player the player object
     */
    public void showShopPotion(Player player){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        int i = 1;
        if (this.playerClass.equals("Trail Blaizer") || this.playerClass.equals("Arcaine")) {
            System.out.println("=================[POTION]========================");
            for (Potion potion : dataPotion) {
                System.out.println(i+". Potion name: " + potion.getName() + " | Health Restore: " + potion.getHP() + " | Mana Restore : "+potion.getMP()+" | Price : "+potion.getPrice());
                i++;
            }
        } else {
            System.out.println("=================[POTION]========================");
            for (Potion potion : dataPotion) {
                System.out.println(i+". Potion name: " + potion.getName() + " | Health Restore: " + potion.getHP() + " | Mana Restore : "+potion.getMP()+" | Price : "+potion.getPrice());
                i++;
            }
        }    
    }
        /**
     * Displays the player's inventory.
     *
     * @param player the player object
     * @throws IOException            if an I/O error occurs
     * @throws InterruptedException if the execution is interrupted
     */
    public void showInventory(Player player) throws IOException, InterruptedException{
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        int i = 1;
        System.out.println("=================[WEAPON]========================");
        if (inventoryWeapons.isEmpty()){
            System.out.println("Your inventory in Weapon is empty");
        } else {
            for (Weapon weapon : inventoryWeapons) {
                System.out.println(i+". Weapon name: "+weapon.getName()+" | Damage: "+weapon.getAdditionalPower());
                i++;
            }
        }
        System.out.println("==================[ARMOR]========================");
        if (inventoryArmors.isEmpty()){
            System.out.println("Your inventory in Armor is empty");
        } else {
            for (Armor armor : inventoryArmors) {
                System.out.println(i+". Weapon name: "+armor.getName());
                i++;
            }
        }
        System.out.println("==================[POTION]=======================");
        if (inventoryPotions.isEmpty()) {
            System.out.println("Your inventory in Potion is empty");
        }else{
            for (Potion potion : inventoryPotions) {
                System.out.println(i+". Weapon name: "+potion.getName());
                i++;
           }
        }
        while (true) {
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("1. Change Weapon");
            System.out.println("2. Change Armor");
            System.out.println("0. Back");
            System.out.println("ENTER CHOICE >> ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    changeWeapon(player);
                    break;
                case "2":
                    changeArmor(player);
                    break;
                case "0":
                    home.showHome(player);
                    break;
                default:
                    System.out.println("Invalid Input");
                    showInventory(player);
            }
        }
    }
        /**
     * Changes the equipped weapon of the player.
     *
     * @param player the player object
     * @throws IOException            if an I/O error occurs
     * @throws InterruptedException if the execution is interrupted
     */
    private void changeWeapon(Player player) throws IOException, InterruptedException {
        System.out.println("ENTER CHOICE WEAPON>> ");
        int weaponNumber = sc.nextInt();
        sc.nextLine(); // Clear the input buffer

        if (weaponNumber >= 1 && weaponNumber <= inventoryWeapons.size()) {
            equippedWeapon = inventoryWeapons.get(weaponNumber - 1);
            this.ATK += equippedWeapon.getAdditionalPower();
            System.out.println("Successfully equipped weapon to " + equippedWeapon.getName()+" !");
            showInventory(player);
        } else {
            System.out.println("Invalid input.");
            changeWeapon(player);
        }
    }
        /**
     * Changes the equipped armor of the player.
     *
     * @param player the player object
     * @throws IOException            if an I/O error occurs
     * @throws InterruptedException if the execution is interrupted
     */
    private void changeArmor(Player player) throws IOException, InterruptedException {
        System.out.println("ENTER CHOICE ARMOR >> ");
        int armorNumber = sc.nextInt();
        sc.nextLine(); // Clear the input buffer

        if (armorNumber >= 1 && armorNumber <= inventoryArmors.size()) {
            Armor equippedArmor = inventoryArmors.get(armorNumber - 1);
            this.HP += equippedArmor.additionalHP;
            this.defense += equippedArmor.additionalDef;
            this.magicDefense += equippedArmor.additionalMagicDef;
            System.out.println("Successfully equipped armor to " + equippedArmor.getName()+" !");
            showInventory(player);
        } else {
            System.out.println("Invalid input.");
            changeArmor(player);
        }
    }
    public void addToInventoryWeapon(Weapon weapon){
        inventoryWeapons.add(weapon);
    }
    public void addToInventoryArmor(Armor armor){
        inventoryArmors.add(armor);
    }
    public void addToInventoryPotion(Potion potion){
        inventoryPotions.add(potion);
    }
    public void attack(Player p,Enemy e){
        int dmg = damageFormula(p);
        System.out.println(p.getName() + " attacks!\nDeals " +
                dmg + " damage to " + e.getName());
        e.takeDamage(dmg);
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
    
    public boolean tryEscape(){
        if (Math.random() < 0.5) {
            return true; // 50% chance of escape
        } else {
            return false;
        }
    }
    
    
    public int levelUp(int exp){
        if (level < 50) {
            level++;
            maxHp += 50;
            maxMp += 5;
            ATK += 5;
            MGC += 2;
            defense += 5;
            magicDefense += 5;
        // Learn additional skills at specific levels
        if (level == 25) {
            skills.add(listSkill.getSwiftBlade(this));
        } else if (level == 40) {
            skills.add(listSkill.getEmberStrike(this));
            System.out.println("Congratulations you level up and stats has been improve. ");
        }
    }
        return this.xp;
    }
    
    public void useSkill(Enemy e) throws InterruptedException, IOException {
        int i = 1;
        System.out.println("=================[SKILLS]========================");
        for (Skill skill : skills) {
            System.out.println(i+" : " + skill.getSkillName() + " - " + skill.getMpCost() + " MP");
            i++;
        }
        System.out.println("0. Back");
        System.out.println("ENTER CHOICE >> ");
        int skillIndex = sc.nextInt();
        if (skillIndex > 0 && skillIndex <= skills.size()) {
            Skill selectedSkill = skills.get(skillIndex - 1);
            if (selectedSkill.getType().equals("Physical Attack") ) {
                if (selectedSkill.getMpCost()<= this.getCurrentMP()) {
                    this.MP -= selectedSkill.getMpCost();
                    System.out.println("You use skill " + selectedSkill.getSkillName());
                    int damage = selectedSkill.getPower();
                    e.HP -= damage;
                    System.out.println("You dealt "+damage+" damage to the enemy");
                }
            } else if ( selectedSkill.getType().equals("Healing")) {
                if (selectedSkill.getMpCost()<= this.getCurrentMP()) {
                    this.MP -= selectedSkill.getMpCost();
                    System.out.println("You use skill " + selectedSkill.getSkillName());
                    int increaseHP = selectedSkill.getPower();
                    this.HP += increaseHP;
                    System.out.println("You healed "+increaseHP+" HP.");
                }
            } else {
                System.out.println("Insufficient mana.");
                useSkill(e);
            }
            } else if (skillIndex == 0){
                b.doBattle(this);
            } else {
                System.out.println("Invalid selection.");
                useSkill(e);
            }
    }
}
