import javax.swing.*;

public abstract class Card {
    private int Mana;
    private int Attack;
    private int Health;
    private double Dodge;

    public Card(int Mana, int Attack, int Health, double Dodge) {
        Mana = 0;
        Attack = 1;
        Health = 1;
        Dodge = 0.3;
    }
    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public double getDodge() {
        return Dodge;
    }

    public void setDodge(double dodge) {
        Dodge = dodge;
    }
    public abstract void PlayAgainst();
}
