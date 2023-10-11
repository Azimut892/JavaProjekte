
public class UngradeZahlen {

    public static void main(String[] args) {
        //erst List an zahlen erstellen
        for (int zahl = 1; zahl <= 50; zahl++) {
            //dann kontrollieren welche zahlen die geteilt durch 2 werden keinen rest hinterlassen
            //und nur die zahlen die ein rest hinterlasse ausgeben
            if (zahl % 2 != 0) {
                System.out.println(zahl);
            }
        }
    }
}
