package daniel.basics;
import java.util.Scanner;

public class EinMalEinsMitInput {

    public static void main(String[] args) {
        //scanner definieren
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir eine Zahl: ");
        int zahl = scanner.nextInt();
        //for loop um die gescante zahl 10 mal zu multiplitieren
        for (int i = 1; i <= 10; i++) {
            int moltiplicator = zahl * i;
            System.out.println(moltiplicator);
        }
    }
}