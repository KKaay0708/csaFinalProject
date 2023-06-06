import java.lang.Math.*;

public class barbarian{
    public int strength = 3;
    public int agility = 1;
    public int stamina = 4;
    public int intelligence = 1;
    public int spirit = 1;
    public int health;
    public int mana;

    public barbarian(int s, int a, int st, int i, int sp){
        strength *= s;
        agility *= a;
        stamina *= st;
        intelligence *= i;
        spirit *= sp;
        health = stamina * 2;
        mana = intelligence * 2;
    }


}

