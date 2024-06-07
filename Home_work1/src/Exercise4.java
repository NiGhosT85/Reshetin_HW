import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //ввод чисел через клавиатуру деление (division)
        System.out.println("Введите два числа для деления:");
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Ведите первое число: ");
        float a = scanner3.nextFloat();
        System.out.print("Ведите второе число: ");
        float b = scanner3.nextFloat();
        float result = a / b;
        System.out.println("Результат деления введенных чисел равен: " + result);
    }
}
