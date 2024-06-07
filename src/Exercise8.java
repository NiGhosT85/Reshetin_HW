import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        //отрицательное (negative)
        System.out.println("Сложение без отрицательных чисел."+"\n"+ "Ожидание ввода чисел для сложения:");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int result = a + b;
        if ((a < 0)||(b < 0)) {
            System.out.println("Одно из чисел не соотвествует условиям, я не хочу работать с отрицательными числами!");}
        else {
            System.out.println("Сумма чисел равна: " + result);}
    }
}
