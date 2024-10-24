package view;

import java.util.Scanner;

public class Menu {
    private boolean flag = true;
    public void start() {
        while (flag) {
            System.out.println("1. Добавить нового пользователя\n2. Выход");
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите пункт меню: ");
            try {
                int input = scan.nextInt();
                if (input == 2) {
                    flag = false;
                } else if (input == 1) {
                    System.out.println("Введите данные в формате:");
                    System.out.println("<фамилия> <имя> <отчество> <номер телефона> <пол: f или m>");
                    System.out.print("Введите: ");
                    String inputData = scan.nextLine();
                    String[] arrInputData = inputData.split(" ");
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Введены не верные данные");
            }
        }
    }
}
