import java.lang.Math.*;

public class rogue{
    public int strength = 1;
    public int agility = 4;
    public int stamina = 2;
    public int intelligence = 2;
    public int spirit = 1;
    public int health;
    public int mana;

    public rogue(int s, int a, int st, int i, int sp){
        strength *= s;
        agility *= a;
        stamina *= st;
        intelligence *= i;
        spirit *= sp;
        health = stamina * 2;
        mana = intelligence * 2;
    }
}

