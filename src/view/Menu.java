package view;

import presenter.Presenter;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private boolean flag = true;
    Presenter presenter;
    public Menu () {
        presenter = new Presenter();
    }
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
                    System.out.println("<фамилия> <имя> <отчество> <дата рождения в формате дд.мм.гггг> <номер телефона> <пол: f или m>");
                    System.out.print("Введите: ");
                    String inputData = scan.nextLine();
                    String[] arrInputData = inputData.split(" ");
                    if (presenter.checkCount(arrInputData) && presenter.dateOfBirthCheck(arrInputData[3]) && presenter.sexCheck(arrInputData[5])) {
                        try {
                            presenter.save(arrInputData);
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Введены не верные данные");
                        for (int i = 0; i < arrInputData.length; i++) {
                            System.out.println(arrInputData[i]);
                        }
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Введены не верные данные");
            }
        }
    }
}
