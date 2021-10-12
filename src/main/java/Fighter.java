

public class Fighter {
    int attack;
    int hp;
    int morale;

    Fighter (int attack, int hp, int morale) {
        this.attack = attack;
        this.hp = hp;
        this.morale = morale;
    }
    Fighter (Fighter unit) {
        attack = unit.attack;
        hp = unit.hp;
        morale = unit.morale;
    }

}
