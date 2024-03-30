import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] weights = new double[10];
        double averageWeight = 0;
        int countPeople = 0;
        for (int i = 0; i < weights.length; i++) {
            weights[i] = (new Random().nextDouble() * 60) + 40;
            averageWeight += weights[i];
            if (weights[i] >= 60 && weights[i] <= 80) {
                countPeople++;
            }
        }
        System.out.println("Средний вес всех людей: " + averageWeight / weights.length + " кг");
        System.out.println("Кол-во людей, у к/х вес в промежутке от 60 до 80 кг включительно: " + countPeople);
    }
}
