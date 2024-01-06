package Day1;
/*Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.
Вывод в консоль должен быть таким:
JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA*/
public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            if(count < 9) {
                System.out.print("JAVA ");
                count ++;
            } else {
                System.out.print("JAVA");
                count++;
            }
        }
    }
}
