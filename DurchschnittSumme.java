
import java.util.Scanner;


public class DurchschnittSumme {

    public static void main(String[] args) {
        //erst scanner summe und uses definieren
        Scanner scanner = new Scanner(System.in);
        double summe = 0;
        int uses = 0;
        //dann endless schleife um nummern zu adieren und gleichzeitig mit jeder nutzung uses um 1 incrementieren
        while (true) {
            System.out.println("gib mir eine zahl (0 für exit): ");
            int zahl = scanner.nextInt();
            uses++;
            //0 um aus der schleife raus zu kommen und uses -1
            if (zahl == 0) {
                uses -= 1;
                break;
            }
            summe += zahl;
        }
        // output von summe und durchschnitt
        System.out.println("deine summe ist: " + summe + " und dein durchschnitt ist: " + (summe/uses));

    }

}
