import java.util.Scanner;

public class Day {
    public static void main (String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Понедельник");
            break;
            case 2:
                System.out.println("Вторник");
            break;
            case 3:
                System.out.println("Среда ");
                break;
            case 4:
                System.out.println("Четверг");
            break;
            case 5:
                System.out.println("Пятница");
            break;
            case 6:
                System.out.println("Субота ");
            break;
            case 7:
                System.out.println("Воскресенье");
            break;
        }


    }
}
