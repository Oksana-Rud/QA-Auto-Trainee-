package Task1.ConsoleSolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        try {
            do {
                System.out.println("Введите число");
                input = scan.nextInt();
            } while (input <= 7);
            if (input > 7) {
                System.out.println("Привет");
            }
        } catch (Exception ex) {
            System.out.println("Этот символ не является числом");
        }
    }
}
