import java.util.Scanner;

class main{  
    public static void main(String args[]){  
        String[][] environment = new String[4][4];
        Scanner choice = new Scanner(System.in);
        System.out.println("Type one of the following characters to select: Barbarian, Sorcerer, or Rogue");
        System.out.println("For more details on each character, type: Stats");
        String character = choice.nextLine();
        if(character.equals("Stats")){
            System.out.println("Barbarian:");
            System.out.println("Strengths - Strength & Stamina");
            System.out.println("----------");
            System.out.println("Sorcerer:");
            System.out.println("Strengths - Intelligence & Spirit");
            System.out.println("----------");
            System.out.println("Rogue:");
            System.out.println("Strenghs - Agility");
            System.out.println("Please select one of the characters:");
            character = choice.nextLine();
        }
    }  
}  