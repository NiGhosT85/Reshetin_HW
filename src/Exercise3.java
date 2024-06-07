import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //ввод чисел через клавиатуру вычитание (subtraction)
        System.out.println("Введите два числа для вычитания:");
        Scanner scanner2 = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        int a = scanner2.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner2.nextInt();
        int result = a - b;
        System.out.println("Результат вычитания введенных чисел равен: " + result);
    }
}
