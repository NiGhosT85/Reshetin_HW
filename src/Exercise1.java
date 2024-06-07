public class Exercise1 {
    public static void main(String[] args) {

        // сложение/вычитание/умножение/деление
        byte a = 3;
        byte b = 6;
        float a1 = 5.7f;
        float b1 = 3f;
        int c = a + b;
        System.out.println("Результаты:"+"\n"+"Сложение: "+ c);
        int e = a - b;
        System.out.println("Вычитание: "+e);
        float d = a1 / b1;
        System.out.println("Деление: "+d);
        int i = a * b;
        System.out.println("Умножение:"+i+"\n");

        byte a2 = 3, b2 = 6;
        float a3 = 5.7f, b4 = 3f;
        int c2 = a2 + b2;
        int e2 = a2 - b2;
        float d2 = a3 / b4;
        float d3 = a3 % b4;
        int i2 = a2 * b2;
        System.out.println("Результаты:"+"\n"+"Сложение: "+c2+"\n"+"Вычитание: "+e2+"\n" + "Деление: "+d2+ "\n"+"Деление на остаток: "+d3+ "\n"+"Умножение :"+i2);

    }
}
