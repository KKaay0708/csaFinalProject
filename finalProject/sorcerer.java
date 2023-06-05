import java.lang.Math.*;

public class sorcerer{
    private int strength = 1;
    private int agility = 2;
    private int stamina = 1;
    private int intelligence = 3;
    private int spirit = 3;
    private int health;
    private int gold = 1000;
    private int mana;

    public sorcerer(int s, int a, int st, int i, int sp){
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

