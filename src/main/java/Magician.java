public class Magician extends Fighter{
int mana;

Magician (int attack, int hp, int morale, int mana) {
    super (attack, hp, morale);
    this.mana = mana;
}
Magician (Magician newMagician) {
    super (newMagician);
    mana = newMagician.mana;
}

}
