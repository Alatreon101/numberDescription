package src.com.dragon;

import java.util.Scanner;

/*
 *
 */

public class NumberDescription {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Вы ввели - " + number);
        } else if (number > 0) {
            System.out.println(number + " - число положительное! ");
        } else {
            System.out.println(number + " - число отрицательное! ");
        }

        if ((number % 2) == 0) {
            System.out.println(number + " - число четное!");
        } else {
            System.out.println(number + " - число нечетное!");
        }
    }
}
