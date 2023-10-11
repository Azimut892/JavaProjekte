//decoder für strings die im Encoder.java produziert wurden

import java.util.Scanner;

public class Decoder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("was soll ich endcoden? ");
        String toDecode = scanner.next();
        for (int i = 0; i < toDecode.length(); i++) {
            char originalChar = toDecode.charAt(i);
            char encoded = (char) (originalChar - 1);
            System.out.print(encoded);
        }

    }
}
