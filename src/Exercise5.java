import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //ввод чисел через клавиатуру умножение (multiplication)
        System.out.println("Введите два числа для умножения:");
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Ведите первое число: ");
        int a = scanner4.nextInt();
        System.out.print("Ведите второе число: ");
        int b = scanner4.nextInt();
        int result = a * b;
        System.out.println("Результат умножения введенных чисел равен: " + result);

    }
}
