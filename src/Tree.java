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

        for (int h = 1; h < height; h++) {
            System.out.print(" ");
        }
        System.out.println(BROWN + "|" + RESET);
    }
}