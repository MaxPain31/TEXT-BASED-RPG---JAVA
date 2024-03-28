package main;

import java.io.IOException;
import java.util.Scanner;
/**
 * Show introduction
 */
public class IO {
    static Validator validator = new Validator();
    Player player;
    
    public Player createCharacter(){
        Scanner sc = new Scanner(System.in);
        boolean confirm = true;
        String playerName = "";
        String YesOrNoInput = "";
        do {            
            while (true) {
                boolean nameValid = false;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("=================================================");
                System.out.println("    C R E A T E   Y O U R   C H A R A C T E R    ");
                System.out.println("=================================================");
                System.out.print("Input your name: ");
                playerName = sc.nextLine();
                try {
                    validator.validate(playerName, 8);
                    nameValid = true;
                } catch (InvalidInputException ie) {
                    System.out.println(ie.getMessage() + "A character name must contain 8 characters or less and it can not be empty.");
                }
                if (nameValid) break;
            }
            //create Character
            player = new Player(playerName);
            //ask player to confirm
            while (true) {
                boolean yesOrNoEntered = false;
                System.out.println("Do you wish to continue with this character? [Y/N]");
                YesOrNoInput = sc.nextLine().toUpperCase();
                try {
                    validator.validate(YesOrNoInput, "Y", "N");
                    yesOrNoEntered = true;
                } catch (InvalidInputException ie) {
                    System.out.println(ie.getMessage() + "Please confirm with [Y] or reset character creation with [N].");
                }
                if (yesOrNoEntered) break;
            }

            if (YesOrNoInput.equals("Y")) {
                System.out.println("You successfully created a Character!");
                confirm = true;
            } else {
                confirm = false;
            }
        } while (confirm == false);
        return player;
    }
}
