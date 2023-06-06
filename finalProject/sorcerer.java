import java.lang.Math.*;

public class sorcerer{
    public int strength = 1;
    public int agility = 2;
    public int stamina = 1;
    public int intelligence = 3;
    public int spirit = 3;
    public int health;
    public int mana;

    public sorcerer(int s, int a, int st, int i, int sp){
        strength *= s;
        agility *= a;
        stamina *= st;
        intelligence *= i;
        spirit *= sp;
        health = stamina * 2;
        mana = intelligence * 2;
    }
}

