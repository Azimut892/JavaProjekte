
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int array[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
    }
}
