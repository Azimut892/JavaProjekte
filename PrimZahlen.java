package daniel.basics;

public class PrimZahlen {

    public static void main(String[] args) {
        //erst List an zahlen erstellen
        for (int zahl = 1; zahl <= 100; zahl++) {
            //divisior definieren wir starten bei 2 und testen die zahlen und mit divisor++
            //addirt man immer +1 an den definierten divisor und testet noch mal die zahlen
            int divisor;
            for (divisor = 2; divisor < zahl; divisor++) {
                //controllieren ob zahl durch divisor 0 ergibt
                if (zahl % divisor == 0) {
                    break;
                }
            }
            //zahl printen die nur durch 1 und sich selbst teilbar ist also zahlen die

            if (divisor == zahl) {
                System.out.println(zahl);
            }
        }
    }
}
