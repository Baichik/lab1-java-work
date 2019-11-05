import java.util.Scanner;
public class triangle {
    public static void main (String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение катета а >> ");
        double katet_a = scanner.nextDouble();
        System.out.println("Введите значение катета b >>");
        double katet_b = scanner.nextDouble();

        // Гипотенуза треугольника
        double katet_asquare = katet_a * katet_a;
        double katet_bsquare = katet_b * katet_b;
        double summa_k = katet_asquare + katet_bsquare;
        double gipotenuze = Math.sqrt(summa_k);
        System.out.println("Гипотенуза треугольника равна >> " + gipotenuze + " см");

        // Угол треугольника
        double delenie = katet_a / katet_b;
        double cos = Math.cos(delenie);
        double stepen = cos * (180 / Math.PI);
        System.out.println("Значение угла треугольника равна >> " + delenie + " градусов");

        //Высота треугольника
        double p = (katet_a + katet_b + gipotenuze) / 2;
        double a = 2 * (p - katet_a) * (p - katet_b) * (p - gipotenuze);
        double razdelit = a / katet_a;
        double height = (Math.sqrt(a) * 2) / katet_a;
        System.out.println("Высота треугольника равна >> " + height + " см");
        // Площадь треугольника
        double S = (katet_a * height) / 2;
        System.out.println("Площадь  треугольника равна >> " + S + " см^2");
        // Периметр треугольника
        double P = katet_a + katet_b + gipotenuze;
        System.out.println("Периметр треугольника равна >>" + P + " см");





    }
}
