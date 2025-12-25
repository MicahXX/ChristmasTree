import java.util.Scanner;
import java.util.Random;

public class Tree {
    public static void main(String[] args) {
        Scanner ChristmasTree = new Scanner(System.in);
        Random random = new Random();

        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[32m";
        final String BROWN = "\u001B[38;5;94m";
        final String RED = "\u001B[31m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String MAGENTA = "\u001B[35m";
        final String CYAN = "\u001B[36m";
        final String GOLD = "\u001B[93m";

        String title = "Christmas Tree";
        String[] colors = {RED, YELLOW, BLUE, MAGENTA, CYAN};

        for (int i = 0; i < title.length(); i++) {
            System.out.print(colors[i % colors.length]
                    + title.charAt(i)
                    + RESET);
        }
        System.out.println("\n---------------");

        System.out.print("Enter height: ");
        int height = ChristmasTree.nextInt();
        System.out.println();

        for (int j = 1; j <= height; j++) {
            for (int h = height; h > j; h--) {
                System.out.print(" ");
            }
            if (j == 1) {
                System.out.println(GOLD + "*" + RESET);
                continue;
            }
            for (int i = 1; i <= (2 * j - 1); i++) {
                if (random.nextInt(4) == 0) {
                    String randomColor = colors[random.nextInt(colors.length)];
                    System.out.print(randomColor + "#" + RESET);
                } else {
                    System.out.print(GREEN + "#" + RESET);
                }
            }
            System.out.println();
        }

        int trunkHeight;
        int trunkWidth;
        if (height < 7) {
            trunkHeight = 1;
            trunkWidth = 1;
        } else {
            trunkHeight = Math.max(2, height / 5);
            trunkWidth = Math.max(3, height / 6);
            if (trunkWidth % 2 == 0) trunkWidth++;
        }

        int spaces = height - (trunkWidth / 2) - 1;

        for (int t = 0; t < trunkHeight; t++) {
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            System.out.println(BROWN + "|".repeat(trunkWidth) + RESET);
        }
    }
}