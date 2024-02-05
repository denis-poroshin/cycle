public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2){
            System.out.println(i);
        }
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задание 6");
        for (int i = 7; i <= 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\nЗадание 7");
        for(int i = 1; i <= 512; i *= 2){
            System.out.print(i + " ");
        }
        System.out.println("\nЗадание 8");
        int sum = 29_000;
        int total = 0;
        for(int i = 1; i <= 12; i++){
            total += sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание 9");
        total = 0;
        for(int i = 1; i <= 12; i++){
            total += total / 100;
            total += sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание 10");
        int variable;
        for(int i = 1; i <= 10; i++){
            variable = 2 * i;
            System.out.println("2*" + i + "=" + variable);
        }

        }
}