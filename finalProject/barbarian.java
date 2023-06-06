import java.lang.Math.*;

public class barbarian{
    public int strength = 3;
    public int agility = 1;
    public int stamina = 4;
    public int intelligence = 1;
    public int spirit = 1;
    public int health;
    public int gold = 1000;
    public int mana;

    public barbarian(int s, int a, int st, int i, int sp){
        strength *= s;
        agility *= a;
        stamina *= st;
        intelligence *= i;
        spirit *= sp;
    }

    private void addItem(int s, int a, int st, int i, int sp){
        strength += s;
        agility += a;
        stamina += st;
        intelligence += i;
        spirit += sp;
        health = stamina * 5;
        mana = intelligence * 5;
    }

    public String printString(){
        return("Strength" + strength + "\n" + "Agility" + agility + "\n" + "Stamina" + stamina + "\n" + "Intelligence" + intelligence + "\n" + "Spririt" + spirit);
    }

    private double attack(){
        double damage;
        damage = strength + (int)Math.random()*2;
        if(Math.random()*55 <= agility){
            return damage * 1.5;
        } else {
            return damage;
        }

    }
    
    private boolean dodge(){
        if(Math.random()*55 <= agility){
            return true;
        } else {
            return false;
        }
    }

    private double castASpell(){
        mana -= 15;
        return spirit*2;
    }
    
    private void run(){

    }
}

