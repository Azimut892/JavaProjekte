//encoder von strings zum decoden Decoder.java benutzen

import java.util.Scanner;

public class Encoder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("was soll ich encoden? ");
        String toEncode = scanner.next();
        for (int i = 0; i < toEncode.length(); i++) {
            char originalChar = toEncode.charAt(i);
            char encoded = (char) (originalChar + 1);
            System.out.print(encoded);
        }

    }
}
