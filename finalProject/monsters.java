public class monsters{
    public double health;
    public int minDamage;
    public int damageDifference;

    public monsters(){
        health = 0;
        minDamage = 0;
        damageDifference = 0;
    }

    public monsters(double h, int min, int diff){
        health = h;
        minDamage = min;
        damageDifference = diff;
    }  
    
    public double getHealth(){
        return health;
    }
    
    public int getDiff(){
        return damageDifference;
    }

    public int getMinDamage(){
        return minDamage;
    }
}