public class player{
    public int strength;
    public int agility;
    public int stamina;
    public int intelligence;
    public int spirit;
    public int health;
    public int mana;
    Boolean inFight = false;

    public player(barbarian plays){
        strength = plays.strength;
        agility = plays.agility;
        stamina = plays.stamina;
        intelligence = plays.intelligence;
        spirit = plays.spirit;
        health = plays.health;
        mana = plays.mana;
    }
    public player(sorcerer plays){
        strength = plays.strength;
        agility = plays.agility;
        stamina = plays.stamina;
        intelligence = plays.intelligence;
        spirit = plays.spirit;
        health = plays.health;
        mana = plays.mana;
    }
    public player (rogue plays){
        strength = plays.strength;
        agility = plays.agility;
        stamina = plays.stamina;
        intelligence = plays.intelligence;
        spirit = plays.spirit;
        health = plays.health;
        mana = plays.mana;
    }
    
    public double attack(){
        double damage = strength *2;
        if((int)(Math.random()*55) <= agility){
            return damage * 1.5;
        } else {
            return damage;
        }

    }
    
    public boolean dodge(){
        if((int)(Math.random()*55) <= agility){
            return true;
        } else {
            return false;
        }
    }

    public double castASpell(){
        mana -= 20;
        return spirit*2;
    }
    
    public Boolean run(){
        if(((int)(Math.random()*2+1)) == 1){
            return true;
        } else {
            return false;
        }
    }

    public void increaseMana(){
        mana += spirit;
    }

    
}