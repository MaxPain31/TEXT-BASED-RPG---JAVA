
package main;

import java.io.IOException;

public class LoadingScreen {
    public static void showLoadingScreen() {
        System.out.println("Loading...");

        // Simulate rendering a loading bar
        int total = 7;
        for (int progress = 1; progress <= total; progress++) {
            System.out.print("■");
            for (int i = 0; i < progress; i++) {
                System.out.print("■");
            }
            for (int i = progress; i < total; i++) {
                System.out.print("");
            }
            System.out.print("\r"); // Move the cursor back to the beginning of the line
            try {
                Thread.sleep(500); // Add a small delay between each progress update
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static void simulateLoading() {
        try {
            // Simulate a delay of 3 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void startGame() throws IOException, InterruptedException {
        Main main = new Main();
        System.out.println("Game started!");

        Thread.sleep(1000); // Add a delay before calling IO.newGameIntroduction()
        main.newGameIntroduction();
    }
}
