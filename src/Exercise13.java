import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        // Диапазон чисел с вводом данных от пользователя, через for
        System.out.println("Задайте нужный диапазон для поиска"+"\n"+"(с ограничением от -2^31 до 2^31-1 )");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = scanner.nextInt();
        System.out.print("Введите второе число:");
        int b = scanner.nextInt();
        int c;
        if (a > b){
            if (a-1 == b){
                System.out.println("Ошибка! Диапазон между числами с шагом в одну единицу отсутсвует! число является следующим.");}
            else if (a+1 ==b) {
                System.out.println("Ошибка! Диапазон между числами с шагом в одну единицу отсутсвует! число является следующим.");}
            else {
                System.out.println("(отсчет диапазона производится в обратном порядке)");
                System.out.println("Диапазон чисел от " + a + " до " + b + " с шагом в единицу");
                for (c = a - 1; c > b; c = c - 1){
                    System.out.println( "равен: " + c );}}}
        else if (a < b) {
            if (b+1 == a){
                System.out.println("Ошибка! Диапазон между числами с шагом в одну единицу отсутсвует! число является следующим.");}
            else if (b-1 == a) {
                System.out.println("Ошибка! Диапазон между числами с шагом в одну единицу отсутсвует! число является следующим.");
            }
            else {
                System.out.println("Диапазон чисел от " + a + " до " + b + " с шагом в единицу");
                for (c = a + 1; c < b; c = c + 1) {
                    System.out.println("равен: " + c);
                }}}
        else {
            System.out.println("Ошибка! Заданный диапазон отсутсвует, числа равны!");}
        System.out.println("Вывод значений диапазона с шагом в одну единицу завершен!");
    }
}
