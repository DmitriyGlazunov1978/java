import java.util.Random;

public class lesson1 {
    public static void main(String[] args) {
        printThreeWords();

        checkSum(-34, 5);

        printColor();

        compareNumbers(5, 6);
    }

    private static void compareNumbers(int a, int b) {
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    private static void printColor() {
        int min = -200;
        int max = 200;
        Random random = new Random();

        int value = random.nextInt((max - min) + 1) + min;
        if (value <= 0) System.out.println("Красный");
        else if ((value > 0) && (value <= 100)) System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    private static void checkSum(int a, int b) {
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }


}
