import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Умножение без отрицательных чисел."+"\n"+ "Ожидание ввода чисел для умножения:");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int result2 = a * b;
        if ((a < 0)||(b < 0)) {
            System.out.println("Одно из чисел не соотвествует условиям, я не хочу работать с отрицательными числами!");}
        else {
            System.out.println("Результат умножения чисел равен: " + result2);}
    }
}
