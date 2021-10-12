import java.util.Scanner;

public class Menu {
    static Army newarmy = new Army();
    public static void menu () {
        int i=0;
        if (newarmy.val < 5 ) {
            Scanner in = new Scanner(System.in);
            System.out.println("Выберите отряд");
            System.out.println("1. Пехота");
            System.out.println("2. Лучники");
            System.out.println("3. Конница");
            System.out.println("4. Маги");
            i = in.nextInt();
            newarmy.push(i);
        }
        else {
            System.out.println("Набор окончен");
            Battle.battle();
        }
    }
}
