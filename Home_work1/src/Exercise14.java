import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        //// Диапазон чисел с вводом данных от пользователя, через while
        System.out.println("Задайте нужный диапазон для поиска"+"\n"+"(с ограничением от -2^31 до 2^31-1 )");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a1 = scanner.nextInt();
        System.out.print("Введите второе число:");
        int b1 = scanner.nextInt();
        System.out.println("Диапазон чисел от " + a1 + " до " + b1 + " с шагом в единицу:");
        if (a1 < b1) {

            if (b1+1 == a1){
                System.out.println("Ошибка! Диапазон между числами с шагом в одну единицу отсутсвует! число является следующим.");}
            else if (b1-1 == a1) {
                System.out.println("Ошибка! Диапазон между числами с шагом в одну единицу отсутсвует! число является следующим.");}
            else {
                while (a1 < b1 - 1){
                    a1 = a1 + 1;
                    System.out.println(a1);}}}
        else if (a1 > b1){
            if (a1-1 == b1){
                System.out.println("Ошибка! Диапазон между числами с шагом в одну единицу отсутсвует! число является следующим.");}
            else if (a1+1 ==b1) {
                System.out.println("Ошибка! Диапазон между числами с шагом в одну единицу отсутсвует! число является следующим.");}
            else {
                System.out.println("(отсчет диапазона производится в обратном порядке)");
                while (a1 > b1 +1){
                    a1 = a1 - 1;
                    System.out.println(a1);}}}
        else System.out.println("Ошибка! Заданный диапазон отсутсвует, числа равны!");
    }
}
