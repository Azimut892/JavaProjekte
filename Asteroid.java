package daniel.array;

import java.util.Random;

public class Asteroid {
    public static void main(String[] args) {
        int[][] feld = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            feld[x][y]++;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (feld[i][j] == 0) {
                    System.out.print("|_|");
                } else {
                    System.out.print("|" + feld[i][j] + "|");
                }
            }
            System.out.println();
        }
    }
}