public class Army {
    Fighter unit;
    Fighter archer = new Fighter(15, 100, 100);
    Fighter swordsman = new Fighter(25, 100, 100);
    Fighter horseman = new Fighter(27, 100, 100);
    Magician magician = new Magician( 0,100, 100, 100);
    int val=0;
    Army () {

    }
    Army (String a[]) {
        a = army;
    }

    String army [] = new String [5];
    Fighter armyForBattle [] = new Fighter[5];
    public  void push (int i) {

        switch (i) {
            case 1:
                army[val] = "Пехота";
                unit = new Fighter (swordsman);
                armyForBattle[val++]=unit;
                Menu.menu();
                break;
            case 2:
                army[val] = "Лучники";
                unit = new Fighter (archer);
                armyForBattle[val++]=unit;
                Menu.menu();
                break;
            case 3:
                army[val] = "Конница";
                unit = new Fighter(horseman);
                armyForBattle[val++]=unit;
                Menu.menu();
                break;
            case 4:
                army[val] = "Маги";
                unit = new Magician(magician);
                armyForBattle[val++]=unit;
                Menu.menu();
                break;
            default:
                System.out.println("Повторите выбор");
                Menu.menu();
                break;
        }
    }
}
