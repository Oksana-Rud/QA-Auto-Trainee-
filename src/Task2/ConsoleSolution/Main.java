package Task2.ConsoleSolution;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String expectedName = "Вячеслав";
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = scan.nextLine();
        try {
            checkInputData(name, expectedName);
        } catch (Exception ex) {
            System.out.println("Введите имя правильно.");
        }
    }

    public static void checkInputData(String name, String expectedName) {
        if (!name.matches("^[a-яA-Я]*$") || name.matches("^[a-zA-Z]*$"))
            throw new IllegalArgumentException("Not a Cyrillic symbols");
        if (Objects.equals(name, expectedName)) {
            System.out.println("Привет, " + expectedName);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
