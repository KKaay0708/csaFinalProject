import java.lang.Math.*;

public class items{
    Boolean weapon = false;
    Boolean head = false;
    Boolean body = false;
    Boolean feet = false;
    Boolean great = false;
    Boolean good = false;
    Boolean ok = false;
    String char;

    public items(c){
        char = c;
    }
    private void chooseItems(){
    System.out.println("You are given 1000 gold.  Please purchase three items.  You may only purchase one great item, one good item, and one okay item.");
    while(weapon || head || body || feet){
        if(weapon){
            if(char.equals("Barbarian")){
                if(great){
                    System.out.println("Great Axe - 500");
                    playerB.gold
                }
            }
        }
    }
}
}