import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(100);
        }
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
