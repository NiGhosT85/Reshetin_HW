public class Exercise12 {
    public static void main(String[] args) {
        // фактические значения , через for;
        int a = 4;
        int b = 1;
        int c;
        System.out.println("Диапазон чисел от " + a + " до " + b + " с шагом -1:");
        for (c = a - 1; c > b; c = c - 1){
            System.out.println( "значение: " + c );}
        System.out.println("Вывод значений диапазона с шагом в одну единицу завершен!"+ "\n");

        // фактические значения , через while;
        int a1 = -2;
        int b1 = 2;
        System.out.println("Диапазон чисел от " + a1 + " до " + b1 + " с шагом +1:");
        while (a1 < b1-1 ){
            a1 = a1 +1;
            System.out.println(a1);
        }
        System.out.println("Вывод значений диапазона с шагом в одну единицу завершен!");
    }
}
