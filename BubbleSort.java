
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        int sortedArray[] = bubbleSortSorted(array);
        System.out.println("\nSorted Array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] bubbleSortSorted(int[] bubbleSort) {
        int temp;
        for (int i = 0; i < bubbleSort.length; i++) {
            for (int j = 0; j < bubbleSort.length - 1; j++) {
                if (bubbleSort[j] > bubbleSort[j + 1]) {
                    temp = bubbleSort[j];
                    bubbleSort[j] = bubbleSort[j + 1];
                    bubbleSort[j + 1] = temp;
                }
            }
        }
        return bubbleSort;
    }
}
