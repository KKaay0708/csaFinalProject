import java.lang.Math.*;

public class rogue{
    private int strength = 1;
    private int agility = 4;
    private int stamina = 2;
    private int intelligence = 2;
    private int spirit = 1;
    private int health;
    private int gold = 1000;
    private int mana;

    public rogue(int s, int a, int st, int i, int sp){
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

    private double attack(){
        private double damage;
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

