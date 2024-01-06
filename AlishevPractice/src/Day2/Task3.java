package Day2;

import java.util.Scanner;

/* Реализовать программу №2, используя цикл while.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        int count = a + 1;
        while (count < b) {
            if((count % 5 == 0) && (count%10 != 0)){
                System.out.println(count);
            }
            count++;
        }
    }
}
