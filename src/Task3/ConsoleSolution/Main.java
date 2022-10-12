package Task3.ConsoleSolution;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{34, 56, 22, 27, 78, 234, 5, 101, 66, 9, 101, 13, 234, 34};
        System.out.println("Дан массив целых чисел: " + Arrays.toString(array));
        System.out.println("Массив чисел кратных 3: " + outputArray(array));
    }

    public static ArrayList<Integer> outputArray(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int element : array) {
            if (element % 3 == 0) {
                result.add(element);
            }
        }
        return result;
    }
}
