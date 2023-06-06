public class player{
    public int strength;
    public int agility;
    public int stamina;
    public int intelligence;
    public int spirit;
    public int health;
    public int mana;
    Boolean inFight;

    public player(barbarian play){
        strength = play.strength;
        agility = play.agility;
        stamina = play.stamina;
        intelligence = play.intelligence;
        spirit = play.spirit;
        health = play.health;
        mana = play.mana;
    }
    public player(sorcerer play){
        strength = play.strength;
        agility = play.agility;
        stamina = play.stamina;
        intelligence = play.intelligence;
        spirit = play.spirit;
        health = play.health;
        mana = play.mana;
    }
    public player (rogue play){
        strength = play.strength;
        agility = play.agility;
        stamina = play.stamina;
        intelligence = play.intelligence;
        spirit = play.spirit;
        health = play.health;
        mana = play.mana;
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
        mana -= 20;
        return spirit*2;
    }
    
    private void run(){
        if(((int)Math.random()*2+1) == 1){
            return true;
        } else {
            return false;
        }
    }

    private void increaseMana(){
        mana += spirit;
    }

    
}