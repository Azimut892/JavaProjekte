
import java.util.Scanner;

public class Sterne {

    public static void main(String[] args) {
        //erst scanner und uses leerzeichen definieren
        Scanner scanner = new Scanner(System.in);
        int space = 0;
        System.out.println("wie gross soll deine stern figur sein? (ungrade zahl bitte!) ");
        //userinput scannen
        int sternDimension = scanner.nextInt();
        //user input in for loop verarbeiten von * so oft wie userinpt wiederholt wird und für
        //den nexten autput um 2 verringerd wird wo gleichzeitig bei jedem loop die leerzeichen um 1 gesteigerd wird
        for (int i = sternDimension; i >= 1; i -= 2) {
        String blank = " ".repeat(space);
        String stern = "*".repeat(i);
        space++;

            System.out.println(blank + stern);
        }


    }
}



