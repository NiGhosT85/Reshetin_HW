import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        //ввод чисел через клавиатуру сложение (addition)
        System.out.println("Введите два числа для сложения:");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int result = a + b;
        System.out.println("Результат сложения введенных чисел равен: " + result);
    }
}
