
import java.util.Scanner;


public class GroessteZahl {

    public static void main(String[] args) {
        //erst scanner und uses definieren
        Scanner scanner = new Scanner(System.in);
        int uses = 0;
        int größteZahl = 0;

        //dann endless schleife um nummern zu adieren und gleichzeitig mit jeder nutzung uses um 1 incrementieren
        while (true) {
            System.out.println("gib mir eine zahl ");
            int zahl = scanner.nextInt();
            uses++;
            if (zahl > größteZahl) {
                größteZahl = zahl;
            }
                //0 um aus der schleife raus zu kommen und uses -1
                if (uses == 3 || zahl == 0) {
                    break;
                }
            }
            // output von summe und durchschnitt
            System.out.println("deine grösste zahl ist: " + größteZahl);

    }
}

