package Task3.ConsoleSolution;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{34, 56, 22, 27, 78, 234, 5, 101, 66, 9};
        System.out.println(outputArray(array));
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
