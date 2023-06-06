import java.util.Scanner;

class main{  
    public static void main(String args[]){  
        String[][] environment = new String[4][4];
        Scanner choice = new Scanner(System.in);
        private String character;
        private int talentPoints = 25;
        System.out.println("Type one of the following characters to select: Barbarian, Sorcerer, or Rogue");
        System.out.println("For more details on each character, type: Stats");
        character = choice.nextLine();
        if(character.equals("Stats")){
            System.out.println("Barbarian:");
            System.out.println("strength = 3, agility = 1, stamina = 4, intelligence = 1, spirit = 1");
            System.out.println("----------");
            System.out.println("Sorcerer:");
            System.out.println("strength = 1, agility = 2, stamina = 1, intelligence = 3, spirit = 3");
            System.out.println("----------");
            System.out.println("Rogue:");
            System.out.println("strength = 1, agility = 4, stamina = 2, intelligence = 2, spirit = 1;");
            System.out.println("Please select one of the characters:");
            character = choice.nextLine();
            System.out.println(character + "selected.");
        }

        while(talentPoints > 0){
            System.out.println("Please ration 25 talent points for " + character + "among the 5 categories (strength, agility, stamina, intelligence, spirit)");
            System.out.println("Determine the amount of talent points for strength");
            String s = choice.nextLine();
            talentPoints -= s;
            if(talentPoints <= 0) continue;
            System.out.println("Determine the amount of talent points for agility:");
            String a = choice.nextLine();
            talentPoints -= a;
            if(talentPoints <= 0) continue;
            System.out.println("Determine the amount of talent points for stamina");
            String st = choice.nextLine();
            talentPoints -= st;
            if(talentPoints <= 0) continue;
            System.out.println("Determine the amount of talent points for intelligence");
            String i = choice.nextLine();
            talentPoints -= i;
            if(talentPoints <= 0) continue;
            System.out.println("Determine the amount of talent points for spirit");
            String sp = choice.nextLine();
            talentPoints -= sp;
            if(talentPoints <= 0) continue;
        }
    }  
}  