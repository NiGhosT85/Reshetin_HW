import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //сравнение (comparison)
        System.out.println("Сравнение чисел.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Первое введенное число больше и равно: " + a);}
        else if (a < b) {
            System.out.println("Второе введенное число больше и равно: " + b);}
        else {
            System.out.println("Числа равны!");
        }
    }
}
