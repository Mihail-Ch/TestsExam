package org.example;

import java.util.Scanner;

public class InputData {

    public String[] enterData() {
        Scanner isScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку через пробел (строка должна содержать Ф.И.О., и дату рожждения - dd.mm.yyyy, номер телефона - цифры, пол - f/m) : ");
            String data = isScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return  arrayData;
            } else if (arrayData.length < 6) {
                System.out.println("you have not entered all the data, please try again");
            } else System.out.println("you entered more data, please try again");
        }
    }
}
