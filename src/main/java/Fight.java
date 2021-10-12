public class Fight {



    void attack (Fighter a, Fighter b) {
        b.morale-=5;
        b.hp -= a.attack;
        System.out.println(b.hp);
        Battle.battle();
    }
    void spell (Magician a, Fighter b) {
        a.mana -= 10;
        b.hp -= 25;
    }
    void spellcurse (Magician a, Fighter b) {
        a.mana -=25;
        b.morale -=40;
    }

    void spellbuff (Magician a, Fighter b) {
        a.mana -=30;
        b.hp +=15;
    }

}
