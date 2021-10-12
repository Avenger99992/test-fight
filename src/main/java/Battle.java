import java.util.Scanner;

public class Battle {
    static String army2 [] = new String [5];
    static EnemyArmy enemyarmy = new EnemyArmy();
    static Fighter enemyunit;
    static Fighter battleunit;
    static Army newarmy = new Army(army2);
    static Fight newfight = new Fight();
    static void battle () {
        int i=0, k=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите отряд, которым будете атаковать");
        for (int j=0; j<=4 ; j++)
        {
            System.out.println(j+1 + "." + army2[j]);
        }
        i = in.nextInt();
        switch (i) {
            case 1:
                battleunit = newarmy.armyForBattle[1];
                break;
            case 2:
                battleunit = newarmy.armyForBattle[2];
                break;
            case 3:
                battleunit = newarmy.armyForBattle[3];
                break;
            case 4:
                battleunit = newarmy.armyForBattle[4];
                break;
        }
        System.out.println("Выберите отряд, на который будете нападать");
        System.out.println("1. Лучники");
        System.out.println("2. Мечники");
        System.out.println("1. Мечники");
        System.out.println("1. Конница");
        k = in.nextInt();
        switch (k) {
            case 1:
                enemyunit = enemyarmy.enemyunit1;
                break;
            case 2:
                enemyunit = enemyarmy.enemyunit2;
                break;
            case 3:
                enemyunit = enemyarmy.enemyunit3;
                break;
            case 4:
                enemyunit = enemyarmy.enemyunit4;
                break;
        }
        newfight.attack(battleunit, enemyunit);
    }
}
