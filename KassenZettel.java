package daniel.strings;


public class KassenZettel {
    public static void main(String[] args) {
        String[] artikel = {"Brot", "Milch", "Salami", "Butter", "Wein"};
        double[] preise = {3.49, 1.20, 6.43, 2.38, 7.65};
        double summe = 0.0;

        for (int i = 0; i < artikel.length; i++) {
            System.out.printf("%5s %-10s %10.2f%n", "", artikel[i], preise[i]);
            summe += preise[i];
        }

        System.out.printf("%5s %-10s%n"," ","-".repeat(21));
        System.out.printf("%27s%n", summe);
    }
}
