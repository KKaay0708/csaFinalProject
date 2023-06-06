import java.util.Scanner;
import java.util.ArrayList;

class main{  
    public static void main(String args[]){  
        String[][] environment = new String[4][4];
        Scanner choice = new Scanner(System.in);
        String character;
        int talentPoints = 25;
        int s = 0;
        int a = 0;
        int st = 0;
        int i = 0;
        int sp = 0;
        barbarian playerB;
        sorcerer playerS;
        rogue playerR;
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

        Scanner points = new Scanner(System.in);
        while(talentPoints > 0){
            System.out.println("Please ration 25 talent points for " + character + "among the 5 categories (strength, agility, stamina, intelligence, spirit)");
            System.out.println("Determine the amount of talent points for strength");
            s = points.nextInt();
            talentPoints -= s;
            if(talentPoints < 0){
                System.out.println("Ran out of talent points.  Please reassign.");
                talentPoints = 25;
                continue;
            }
            System.out.println("Determine the amount of talent points for agility:");
            a = points.nextInt();
            talentPoints -= a;
            if(talentPoints < 0){
                System.out.println("Ran out of talent points.  Please reassign.");
                talentPoints = 25;
                continue;
            }            System.out.println("Determine the amount of talent points for stamina");
            st = points.nextInt();
            talentPoints -= st;
            if(talentPoints < 0){
                System.out.println("Ran out of talent points.  Please reassign.");
                talentPoints = 25;
                continue;
            }            System.out.println("Determine the amount of talent points for intelligence");
            i = points.nextInt();
            talentPoints -= i;
            if(talentPoints < 0){
                System.out.println("Ran out of talent points.  Please reassign.");
                talentPoints = 25;
                continue;
            }            System.out.println("Determine the amount of talent points for spirit");
            sp = points.nextInt();
            talentPoints -= sp;
            if(talentPoints < 0){
                System.out.println("Ran out of talent points.  Please reassign.");
                talentPoints = 25;
                continue;
            }        
            talentPoints = 0;
        }

        System.out.println("You are given 1000 gold.  Please purchase three items.  You may only purchase one great item, one good item, and one okay item.  Please enter the entire item.  For example, \"Weapon: Great Axe - 500\".");
        Boolean weapon = true;
        Boolean head = true;
        Boolean body = true;
        Boolean feet = true;
        Boolean great = true;
        Boolean good = true;
        Boolean okay = true;
        int gold = 1000;
        ArrayList<String> items = new ArrayList<String>();
        String addItem;

        while((weapon || head || body || feet) && (gold > 0)&& (great || good || okay)){
            if(character.equals("Barbarian")){
                if(weapon){
                    if(great){
                        System.out.println("Weapon: Great Axe - 500");
                    }
                    if (good){
                        System.out.println("Weapon: Good Axe - 300");
                    }
                    if (okay){
                        System.out.println("Weapon: Okay Axe- 200");
                    }
                }
                if(head){
                    if(great){
                        System.out.println("Head: Great Helment - 500");
                    }
                    if (good){
                        System.out.println("Head: Good Helment - 300");
                    }
                    if (okay){
                        System.out.println("Head: Okay Helment - 200");
                    }
                }
                if(body){
                    if(great){
                        System.out.println("Body: Great Chestplate - 500");
                    }
                    if (good){
                        System.out.println("Body: Good Chestplate - 300");
                    }
                    if (okay){
                        System.out.println("Body: Okay Chestplate - 200");
                    }
                }
                if(feet){
                    if(great){
                        System.out.println("Feet: Great Greave - 500");
                    }
                    if (good){
                        System.out.println("Feet: Good Greave - 300");
                    }
                    if (okay){
                        System.out.println("Feet: Okay Greave - 200");
                    }
                }
            }
            if(character.equals("Sorcerer")){
                if(weapon){
                    if(great){
                        System.out.println("Weapon: Great Wand - 500");
                    }
                    if (good){
                        System.out.println("Weapon: Good Wand - 300");
                    }
                    if (okay){
                        System.out.println("Weapon: Okay Wand - 200");
                    }
                }
                if(head){
                    if(great){
                        System.out.println("Head: Great Crown - 500");
                    }
                    if (good){
                        System.out.println("Head: Good Crown - 300");
                    }
                    if (okay){
                        System.out.println("Head: Okay Crown - 200");
                    }
                }
                if(body){
                    if(great){
                        System.out.println("Body: Great Cloak - 500");
                    }
                    if (good){
                        System.out.println("Body: Good Cloak - 300");
                    }
                    if (okay){
                        System.out.println("Body: Okay Cloak - 200");
                    }
                }
                if(feet){
                    if(great){
                        System.out.println("Feet: Great Shoes - 500");
                    }
                    if (good){
                        System.out.println("Feet: Good Shoes - 300");
                    }
                    if (okay){
                        System.out.println("Feet: Okay Shoes - 200");
                    }
                }
            }
            if(character.equals("Rogue")){
                if(weapon){
                    if(great){
                        System.out.println("Weapon: Great Dagger - 500");
                    }
                    if (good){
                        System.out.println("Weapon: Good Dagger - 300");
                    }
                    if (okay){
                        System.out.println("Weapon: Okay Dagger - 200");
                    }
                }
                if(head){
                    if(great){
                        System.out.println("Head: Great Hood - 500");
                    }
                    if (good){
                        System.out.println("Head: Good Hood - 300");
                    }
                    if (okay){
                        System.out.println("Head: Okay Hood - 200");
                    }
                }
                if(body){
                    if(great){
                        System.out.println("Body: Great Cape - 500");
                    }
                    if (good){
                        System.out.println("Body: Good Cape - 300");
                    }
                    if (okay){
                        System.out.println("Body: Okay Cape - 200");
                    }
                }
                if(feet){
                    if(great){
                        System.out.println("Feet: Great Boots - 500");
                    }
                    if (good){
                        System.out.println("Feet: Good Boots - 300");
                    }
                    if (okay){
                        System.out.println("Feet: Okay Boots - 200");
                    }
                }
            }
            addItem = choice.nextLine();
            if(addItem.contains("Great") && great){
                if((addItem.contains("Weapon") && weapon)||(addItem.contains("Head") && head)||(addItem.contains("Body") && body)||(addItem.contains("Feet") && feet)){
                    great = false;
                    gold -= 500;
                    items.add(addItem);
                    System.out.println(addItem + "selected.");
                } else {
                    System.out.println("Item invalid.  Please re-enter.");
                }
                if(addItem.contains("Weapon")){
                    weapon = false;
                } else if(addItem.contains("Head")){
                    head = false;
                } else if(addItem.contains("Body")){
                    body = false;
                } else if(addItem.contains("Feet")){
                    feet = false;
                } else {
                    System.out.println("Error");
                }
            } else if (addItem.contains("Good") && good){
                if((addItem.contains("Weapon") && weapon)||(addItem.contains("Head") && head)||(addItem.contains("Body") && body)||(addItem.contains("Feet") && feet)){
                    good = false;
                    gold -= 300;
                    items.add(addItem);
                    System.out.println(addItem + "selected.");

                } else {
                    System.out.println("Item invalid.  Please re-enter.");
                }
                if(addItem.contains("Weapon")){
                    weapon = false;
                } else if(addItem.contains("Head")){
                    head = false;
                } else if(addItem.contains("Body")){
                    body = false;
                } else if(addItem.contains("Feet")){
                    feet = false;
                } else {
                    System.out.println("Error");
                }
            } else if (addItem.contains("Okay") && okay){
                if((addItem.contains("Weapon") && weapon)||(addItem.contains("Head") && head)||(addItem.contains("Body") && body)||(addItem.contains("Feet") && feet)){
                    okay = false;
                    gold -= 200;
                    items.add(addItem);
                    System.out.println(addItem + " selected.");
                } else {
                    System.out.println("Type invalid.");
                }
            } else {
                System.out.println("Level invalid.");
            }
            if(addItem.contains("Weapon")){
                weapon = false;
            } else if(addItem.contains("Head")){
                head = false;
            } else if(addItem.contains("Body")){
                body = false;
            } else if(addItem.contains("Feet")){
                feet = false;
            } else {
                System.out.println("Error");
            }
        }
        System.out.println("Item Choices: " + items);

        System.out.println("Character Stats:");
        if(character.equals("Barbarian")){
            playerB = new barbarian(s, a, st, i, sp);
            System.out.println("Strength: " + playerB.strength + "\n" + "Agility: " + playerB.agility + "\n" + "Stamina: " + playerB.stamina + "\n" + "Intelligence: " + playerB.intelligence + "\n" + "Spririt: " + playerB.spirit);
        } else if(character.equals("Sorcerer")){
            playerS = new sorcerer(s, a, st, i, sp);
            System.out.println("Strength: " + playerS.strength + "\n" + "Agility: " + playerS.agility + "\n" + "Stamina: " + playerS.stamina + "\n" + "Intelligence: " + playerS.intelligence + "\n" + "Spririt: " + playerS.spirit);
        } else {
            playerR = new rogue(s, a, st, i, sp);
            System.out.println("Strength: " + playerR.strength + "\n" + "Agility: " + playerR.agility + "\n" + "Stamina: " + playerR.stamina + "\n" + "Intelligence: " + playerR.intelligence + "\n" + "Spririt: " + playerR.spirit);
        }
        
        choice.close();
        points.close();
    }  
}  