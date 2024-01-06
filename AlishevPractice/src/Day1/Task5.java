package Day1;
/* Повторить задание 4, но используя цикл for.*/
public class Task5 {
    public static void main(String[] args) {
        final int MIN_YEAR = 1980;
        final int MAX_YEAR = 2020;
        for (int count = MIN_YEAR; count <= MAX_YEAR; count += 4){
            System.out.println("Олимпиада " + count + " года");
        }
    }
}
