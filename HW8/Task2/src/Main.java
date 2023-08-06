import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double middleWeight = 0;
        int peopleCoumt = 0;

        double[] weights = new double[10];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = (new Random().nextDouble() * 60) + 40;
            middleWeight += weights[i];
            if (weights[i] >= 60 && weights[i] <= 80) {
                peopleCoumt++;
            }
        }
        System.out.println("Средний вес:" + middleWeight / weights.length);
        System.out.println("Кол-во людей в весе от 60 до 80 кг: " + peopleCoumt);
    }
}

