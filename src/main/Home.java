/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class Home {
    Scanner sc = new Scanner(System.in);
    private SkillList listSkill = new SkillList();
    private WeaponList weaponList = new WeaponList();
    private ArmorList armorList = new ArmorList();
    private PotionList potionList = new PotionList();
    
    protected ArrayList <Armor> dataArmor = new ArrayList<>();
    protected ArrayList <Weapon> dataWeapon = new ArrayList<>();
    protected ArrayList <Potion> dataPotion = new ArrayList<>();;
    
    public void showHome(Player player) throws IOException, InterruptedException{
        Dungeon dungeon = new Dungeon();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean status = false;
        System.out.println("=================================================");
        System.out.println("                     H O M E                     ");
        System.out.println("=================================================");
        System.out.println("1. Adventure");
        System.out.println("2. Profile");
        System.out.println("3. Inventory");
        System.out.println("4. Shop");
        System.out.println("0. Exit");
        System.out.print("ENTER CHOICE >> ");
        choice = sc.nextInt();
            switch (choice) {
                case 1:
                    dungeon.showPrologue(player);
                    break;
                case 2:
                    player.showProfile(player);
                    break;
                case 3:
                    player.showInventory(player);
                    break;
                case 4:
                    showShop(player);
                    break;
                case 0:
                    System.out.println("You Exit from the game!");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
    }
    public void showShop(Player player) throws IOException, InterruptedException{
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("=================================================");
        System.out.println("                     S H O P                     ");
        System.out.println("=================================================");
        System.out.println("1. WEAPON");
        System.out.println("2. POTION");
        System.out.println("3. ARMOR");
        System.out.println("0. Back");
        System.out.print("ENTER CHOICE >> ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                showShopWeapon(player);
                break;
            case 2:
                
                break;
            case 3:
                showShopArmor(player);
                break;
            case 0:
                showHome(player);
                break;
            default:
                System.out.println("Invalid Input.");
                showShop(player);
        }
    }
        public void showShopWeapon(Player player) throws IOException, InterruptedException{
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        int yourGold = player.gold;
        int i = 1;
        System.out.println("Your Gold: "+player.gold);
        System.out.println("=================[WEAPON]========================");
        for (Weapon weapon : dataWeapon) {
                System.out.println(i + ". Weapon name: " + weapon.getName() + " | Damage: " + weapon.getAdditionalPower() + " | Price: " + weapon.getPrice());
                i++;
            }
            System.out.println("0. Back");
            System.out.println("ENTER CHOICE TO BUY >> ");
            int weaponIndex = sc.nextInt();
            if (weaponIndex > 0 && weaponIndex <= dataWeapon.size()) {
            Weapon selectedWeapon = dataWeapon.get(weaponIndex - 1);
            if (selectedWeapon.getPrice() <= player.gold) {
                player.gold -= selectedWeapon.getPrice();
                player.addToInventoryWeapon(selectedWeapon);
                System.out.println("Congratulations! You bought the weapon: " + selectedWeapon.getName());
                showShop(player);
            } else {
                System.out.println("Insufficient gold. You cannot afford this weapon.");
                showShopWeapon(player);
            }
            } else if (weaponIndex == 0){
                showShop(player);
            } else {
                System.out.println("Invalid selection. No weapon was bought.");
                showShopWeapon(player);
            }
    }
    public void showShopArmor(Player player) throws IOException, InterruptedException{
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
       int yourGold = player.gold;
        System.out.println("Your Gold: "+player.gold);
        System.out.println("==================[ARMOR]========================");
        for (int j = 0; j < dataArmor.size(); j++) {
                Armor armor = dataArmor.get(j);
                int armorIndex = j + 1;
                System.out.println(armorIndex + ". Armor name: " + armor.getName() + " | HP: " + armor.getAdditionaHP() + " | Defense: " +armor.getAdditionalDef()+" | Magic Defense:"+armor.getAdditionalMagicDef()+" | Price: "+armor.getPrice());
            }
            System.out.println("0. Back");
            System.out.println("ENTER CHOICE TO BUY >> ");
            int armorIndex = sc.nextInt();
            if (armorIndex > 0 && armorIndex <= dataWeapon.size()) {
            Armor selectedArmor = dataArmor.get(armorIndex - 1);
            if (selectedArmor.getPrice() <= player.gold) {
                player.gold -= selectedArmor.getPrice();
                player.addToInventoryArmor(selectedArmor);
                System.out.println("Congratulations! You bought the armor: " + selectedArmor.getName());
                showShop(player);
            } else {
                System.out.println("Insufficient gold. You cannot afford this armor.");
                showShopArmor(player);
            }
            } else if (armorIndex == 0){
                showShop(player);
            } else {
                System.out.println("Invalid selection. No armor was bought.");
                showShopArmor(player);
            }
    }
    public void addallweapon(){
        this.dataWeapon = new ArrayList<Weapon>();
        this.dataWeapon.add(weaponList.getnoviceBlade());
        this.dataWeapon.add(weaponList.getnoviceBlade());
        this.dataWeapon.add(weaponList.getmasterSwordSteel());
        this.dataWeapon.add(weaponList.getdivineSword());
        
        this.dataArmor = new ArrayList<Armor>();
        this.dataArmor.add(armorList.getadeptPlate());
        this.dataArmor.add(armorList.geteliteVanguard());
        this.dataArmor.add(armorList.getlegendaryWarplate());
        
        this.dataPotion = new ArrayList<Potion>();
        this.dataPotion.add(potionList.getsmallHPotion());
        this.dataPotion.add(potionList.getmediumHPotion());
        this.dataPotion.add(potionList.gethighHPotion());
        
        this.dataPotion.add(potionList.getsmallMPotion());
        this.dataPotion.add(potionList.getmediumMPotion());
        this.dataPotion.add(potionList.gethighMPotion());
    }
}
