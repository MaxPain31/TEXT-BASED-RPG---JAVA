
package main;

import java.io.IOException;
import java.util.Scanner;
import static main.IO.validator;

public class Battle {
    Scanner sc = new Scanner(System.in);
    
public void doBattle(Player player) throws InterruptedException, IOException {
    Dungeon d = new Dungeon();
    EnemyList enemyList = new EnemyList();
    enemyList.EnemyFloor1();
    Enemy selectedEnemy = enemyList.getRandomEnemyFloor1();
    System.out.println("You encounter a " + selectedEnemy.getName() + "!");
    System.out.println(selectedEnemy.getDescription());
    System.out.println();
    boolean select = false;

    while (player.getIsAlive() && selectedEnemy.getIsAlive()) {
        System.out.println("\nPlayer HP: " + player.getCurrentHP() + "/" + player.getMaxHP());
        System.out.println("MP: " + player.getCurrentMP() + "/" + player.getMaxMP());
        System.out.println("Enemy HP: " + selectedEnemy.getCurrentHP());
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Attack");
        System.out.println("2. Use Skill");
        System.out.println("3. Escape");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                player.attack(player, selectedEnemy);
                select = true;
                break;
            case 2:
                player.useSkill(selectedEnemy);
                select = true;
                break;
            case 3:
                boolean escaped = player.tryEscape();
                if (escaped) {
                    System.out.println("You successfully escaped from battle!");
                    d.floor1(player);
                } else {
                    System.out.println("You failed to escape!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        // Enemy's turn to attack
        if (selectedEnemy.getIsAlive()) {
            selectedEnemy.attack(player, selectedEnemy);
        }
    }

    if (player.getIsAlive()) {
        String YesOrNoInput = "";
        boolean confirm;
        System.out.println("You defeated the enemy!");
        int expToGive = selectedEnemy.getExpToGive();
        int goldToGive = selectedEnemy.getGoldToGive();
        player.addExp(expToGive);
        player.addGold(goldToGive);
        player.levelUp(selectedEnemy.getExpToGive());
        System.out.println("You gained " + expToGive + " experience points.");
        System.out.println("You got "+goldToGive+" gold! ");
        System.out.println();
                boolean yesOrNoEntered = false;
                System.out.println("Do you want to explore again the dungeon? [Y/N]");
                YesOrNoInput = sc.nextLine().toUpperCase();
                if (YesOrNoInput.equals("Y")) {
                d.exploreFloor1(player);
                confirm = true;
            } else {
                d.floor1(player);
                confirm = false;
            }
    } else {
        System.out.println("You were defeated by the enemy!");
        int restartHP = player.getMaxHP();
        player.restartHP(restartHP);
        d.floor1(player);
    }
}
}
