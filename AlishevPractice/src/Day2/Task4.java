package Day2;

import java.util.Scanner;

/*Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x.
Для этого числа, по формуле выше, необходимо вычислить значение y и вывести его в консоль, используя метод System.out.println().

(Для этих вещественных чисел x и y необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно,
чтобы считать из консоли число x).*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите аргумент:");
        double x = scanner.nextDouble();
        if(x >= 5) {
            System.out.println("Значение функции: " + (Math.pow(x, 2) - 10)/(x + 7));
        } else if ((x > -3)&&(x < 5)) {
            System.out.println("Значение функции: " + (x + 3)*(Math.pow(x, 2) - 2));
        } else {
            System.out.println("Значение функции: " + 420);
        }
    }
}
