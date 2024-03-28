
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dungeon {
    EnemyList eList = new EnemyList();
    Scanner sc = new Scanner(System.in);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(isr);
    ArrayList<Floor> dataFloors = new ArrayList<>();
    FloorList fList = new FloorList();
    Player player;
    public void showPrologue(Player player) throws IOException, InterruptedException{
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("======================================================================================================================");
        System.out.println("                                                     PROLOGUE                                                         ");
        System.out.println("======================================================================================================================");
        System.out.println("      In the peaceful realm of Arindale, a land blessed with tranquility and harmony, a strange event unfolded.       ");
        System.out.println(" One fateful morning, as the sun began its ascent over the rolling hills, a tower of immense proportions materialized ");
        System.out.println(" on the horizon. Its towering spires pierced the sky, casting an ominous shadow across the land. The Tower of Trials, ");
        System.out.println("        as it came to be known, seemed to defy the laws of reality, appearing without warning or explanation.         ");
        System.out.println();
        System.out.println("Please [ENTER] to continue...");
        input.readLine();
        System.out.println();
        System.out.println("   News of the tower's sudden arrival spread like wildfire, igniting curiosity and concern among the inhabitants of   ");
        System.out.println("Arindale. Legends whispered through the ages hinted at the tower's existence, said to be a mystical crucible of tests ");
        System.out.println("and trials that would challenge the mettle of any who dared to enter. Yet, its purpose and origin remained shrouded in");
        System.out.println("                                                      mystery.                                                        ");
        System.out.println();
        System.out.println("Please [ENTER] to continue...");
        input.readLine();
        System.out.println("    As days turned into weeks, brave adventurers from far and wide journeyed to the Tower of Trials, drawn by the     ");
        System.out.println("  allure of its secrets and the promise of untold rewards. Some sought glory and recognition, while others sought to  ");
        System.out.println("     uncover the truth behind this enigmatic structure. Whatever their motivations, they all shared a common goal     ");
        System.out.println("                               to conquer the tower's trials and emerge victorious.");
        System.out.println();
        System.out.println("Please [ENTER] to continue...");
        input.readLine();
        System.out.println("   With their weapons sharpened and their spirits aflame, these valiant souls ventured forth, ascending the tower's   ");
        System.out.println("labyrinthine levels. Each floor posed new challenges, testing their strength, wit, and resolve.Deadly traps, fearsome ");
        System.out.println("          creatures, and puzzles awaited them at every turn, pushing them to the limits of their abilities.");
        System.out.println();
        System.out.println("                         Save Arindale from Destruction and Complete the Tower of Trials.                             ");
        System.out.println();
        System.out.println("Please [ENTER] to continue...");
        input.readLine();
        floor1(player);
    }
    public void floor1(Player player) throws InterruptedException, IOException{
        this.dataFloors.add(fList.getFloor1());
        int floorIndex = 1;
        Floor selectedFloor = dataFloors.get(floorIndex - 1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("================================================================================================================================================");
        System.out.println("                                                         TOWER OF TRIALS                                                     ");
        System.out.println("================================================================================================================================================");
        System.out.println();
        System.out.println("                                               You enter FLOOR 1 : Verdant Grove");
        System.out.println();
        System.out.println("            Welcome to the Verdant Grove, a nature-themed dungeon floor bursting with vibrant life. The floor is coverede    ");
        System.out.println("          in lush greenery, towering trees, and colorful flowers. Sunlight filters through the canopy above, casting a gentle   ");
        System.out.println("          glow. Beware of carnivorous plants and elusive forest creatures as you navigate through this verdant maze. The   ");
        System.out.println("                    soothing sounds of chirping birds and rustling leaves create a serene atmosphere, but danger may lurk        ");
        System.out.println("                                                     behind every bush.                                                                                 ");
        System.out.println();
        System.out.println();
        System.out.println("What do you want to do? ");
        System.out.println("1. Explore");
        System.out.println("2. Profile");
        System.out.println("3. Inventory");
        System.out.println("0. Back");
        choose(player);
    }
    public void floor2(){
        this.dataFloors.add(fList.getFloor2());
        int floorIndex = 1;
        Floor selectedFloor = dataFloors.get(floorIndex - 1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("================================================================================================================================================");
        System.out.println("                                                         TOWER OF TRIALS                                                     ");
        System.out.println("================================================================================================================================================");
        System.out.println();
        System.out.println("                                               You enter FLOOR 2 : Inferno's Forge");
        System.out.println();   
        System.out.println("             Step into the heart of Inferno's Forge, a dungeon floor where the power of the flame reigns supreme. The floor    ");
        System.out.println("         is bathed in a fiery glow, with molten lava flowing through channels and cracks in the scorched earth. Intense heat ");
        System.out.println("               fills the air, making it difficult to breathe. The clang of blacksmith hammers and the crackling of flames echo      ");
        System.out.println("                 throughout the chamber. Beware of fiery traps and menacing fire elementals as you journey through this         ");
        System.out.println("                                                      searing and treacherous domain.                                                                ");
        System.out.println();
        System.out.println();
        System.out.println("What do you want to do? ");
        System.out.println("1. Explore");
        System.out.println("2. Profile");
        System.out.println("3. Inventory");
        System.out.println("0. Back");
    }
    public void floor3(){
        this.dataFloors.add(fList.getFloor3());
        int floorIndex = 1;
        Floor selectedFloor = dataFloors.get(floorIndex - 1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("================================================================================================================================================");
        System.out.println("                                                         TOWER OF TRIALS                                                     ");
        System.out.println("================================================================================================================================================");
        System.out.println();
        System.out.println("                                                You enter FLOOR 3 : Frostfall Citadel ");
        System.out.println();   
        System.out.println("             Welcome to Frostfall Citadel, a chilling dungeon floor forged in ice and frost. The floor is covered in a thick layer ");
        System.out.println("           of glistening ice, with towering ice formations and shimmering stalactites. The air is bitterly cold, causing your breath");
        System.out.println("            to crystallize in the frigid atmosphere. Beware of treacherous icy patches and ice elemental guardians as you traverse");
        System.out.println("           this icy labyrinth. The sound of cracking ice and distant howling winds creates an environment of isolation and danger.");
        System.out.println("What do you want to do? ");
        System.out.println("1. Explore");
        System.out.println("2. Profile");
        System.out.println("3. Inventory");
        System.out.println("0. Back");
    }
    public void floor4(){
        this.dataFloors.add(fList.getFloor4());
        int floorIndex = 1;
        Floor selectedFloor = dataFloors.get(floorIndex - 1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
       System.out.println("================================================================================================================================================");
        System.out.println("                                                         TOWER OF TRIALS                                                     ");
        System.out.println("================================================================================================================================================");
        System.out.println();
        System.out.println("                                               You enter FLOOR 4 : Twilight Abyss ");
        System.out.println();    
        System.out.println("               Descend into the depths of the Twilight Abyss, a dungeon floor cloaked in eternal darkness. The floor is shrouded in");
        System.out.println("              deep shadows and punctuated by eerie, dimly lit torches. Sinister whispers and unsettling echoes fill the air, instilling ");
        System.out.println("             a sense of unease. The floor is rife with hidden traps and devious illusions that can lead astray even the most cautious");
        System.out.println("                     adventurers. Be prepared to confront the darkness within yourself as you navigate through this haunting and ");
        System.out.println("                                                             enigmatic abyss.");
         System.out.println("What do you want to do? ");
        System.out.println("1. Explore");
        System.out.println("2. Profile");
        System.out.println("3. Inventory");
        System.out.println("0. Back");
    }
    public void floor5(){
        this.dataFloors.add(fList.getFloor5());
        int floorIndex = 1;
        Floor selectedFloor = dataFloors.get(floorIndex - 1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("================================================================================================================================================");
        System.out.println("                                                         TOWER OF TRIALS                                                     ");
        System.out.println("================================================================================================================================================");
        System.out.println();
        System.out.println("                                               You enter FLOOR 5 : Forbidden Sanctuary ");
        System.out.println();   
        System.out.println("                A secluded dungeon floor shrouded in mystery and guarded by ancient wards. The floor is adorned with ornate symbols");
        System.out.println("              intricate statues, and mystical artifacts. The air crackles with arcane energy, and the presence of powerful guardians adds");
        System.out.println("                  to the sense of trepidation. Unlock the secrets of this sanctuary, but be prepared for the consequences of trespassing ");
        System.out.println("                                                             forbidden grounds.");
         System.out.println("What do you want to do? ");
        System.out.println("1. Explore");
        System.out.println("2. Profile");
        System.out.println("3. Inventory");
        System.out.println("0. Back");
    }
    public void choose(Player player) throws InterruptedException, IOException {
        Home home = new Home();
        System.out.print("ENTER CHOICE >> ");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                exploreFloor1(player);
                break;
            case 2:
                player.showProfile(player);
                break;
            case 3:
                player.showInventory(player);
                break;
            case 0:
                home.showHome(player);
                break;
            default:
                System.out.println("Invalid Input.");
                choose(player);
        }
    }
    public void exploreFloor1(Player player) throws InterruptedException, IOException{
        EnemyList enemyList = new EnemyList();
        enemyList.enemyBoss();
        Enemy selectedBoss = enemyList.getEnemyBoss1();
        Battle battle = new Battle();
        int totalPeriods = 10;  // Total number of periods to display
        int millisecondsDelay = 500;  // Delay between each period (in milliseconds)
        System.out.print("Travelling");
        for (int i = 0; i < totalPeriods; i++) {
            Thread.sleep(millisecondsDelay);
            System.out.print(".");
        }
        System.out.println();
            if (player.level == 10) {
            System.out.println("You found Dungeon Boss !!");
            System.out.println(selectedBoss.getName()+"Floor Boss appeared ");
            System.out.println("\nPlayer HP: " + player.getCurrentHP() + "/" + player.getMaxHP());
            System.out.println("MP: " + player.getCurrentMP() + "/" + player.getMaxMP());
            System.out.println("Enemy HP: " + selectedBoss.getCurrentHP());
            System.out.println("\nWhat do you want to do?");
                   System.out.println("1. Attack");
                   System.out.println("2. Use Skill");
                   System.out.println("3. Escape");
                   System.out.print("Enter your choice: ");
                   int choice = sc.nextInt();
                   switch (choice) {
            case 1:
                player.attack(player, selectedBoss);
                break;
            case 2:
                player.useSkill(selectedBoss);
                break;
            case 3:
                boolean escaped = player.tryEscape();
                if (escaped) {
                    System.out.println("You successfully escaped from battle!");
                    exploreFloor1(player);
                } else {
                    System.out.println("You failed to escape!");
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        // Enemy's turn to attack
        if (selectedBoss.getIsAlive()) {
            selectedBoss.attack(player, selectedBoss);
        }
        } else {
                battle.doBattle(player);
            } 
    }
    public void exploreFloor2() throws InterruptedException{
        int totalPeriods = 10;  // Total number of periods to display
        int millisecondsDelay = 500;  // Delay between each period (in milliseconds)
        System.out.print("Travelling");
        for (int i = 0; i < totalPeriods; i++) {
            Thread.sleep(millisecondsDelay);
            System.out.print(".");
        }
        
    }
    public void exploreFloor3() throws InterruptedException{
        int totalPeriods = 10;  // Total number of periods to display
        int millisecondsDelay = 500;  // Delay between each period (in milliseconds)
        System.out.print("Travelling");
        for (int i = 0; i < totalPeriods; i++) {
            Thread.sleep(millisecondsDelay);
            System.out.print(".");
        }
        
    }
    public void exploreFloor4() throws InterruptedException{
        int totalPeriods = 10;  // Total number of periods to display
        int millisecondsDelay = 500;  // Delay between each period (in milliseconds)
        System.out.print("Travelling");
        for (int i = 0; i < totalPeriods; i++) {
            Thread.sleep(millisecondsDelay);
            System.out.print(".");
        }
        
    }
    public void exploreFloor5() throws InterruptedException{
        int totalPeriods = 10;  // Total number of periods to display
        int millisecondsDelay = 500;  // Delay between each period (in milliseconds)
        System.out.print("Travelling");
        for (int i = 0; i < totalPeriods; i++) {
            Thread.sleep(millisecondsDelay);
            System.out.print(".");
        }
        
    }
}
