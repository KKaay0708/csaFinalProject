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
        int strengthAdd = 0;
        int agilityAdd = 0;
        int staminaAdd = 0;
        int intelligenceAdd = 0;
        int spiritAdd = 0;
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

        System.out.println("You are given 1000 gold.  Please purchase three items.  You may only purchase one per item type (weapon, head, body, feet).  Please enter the entire item.  For example, \"Weapon: Great Axe\".  Type \"None\" if you cannot afford another item.");
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

        while((weapon || head || body || feet) && (gold > 0) && (great || good || okay)){
            if(character.equals("Barbarian")){
                if(weapon){
                    if(great){
                        System.out.println("Weapon: Great Axe - (+ 10 Strength) $600");
                    }
                    if (good){
                        System.out.println("Weapon: Good Axe - (+ 5 Strength) $320");
                    }
                    if (okay){
                        System.out.println("Weapon: Okay Axe- (+ 2 Strength) $250");
                    }
                }
                if(head){
                    if(great){
                        System.out.println("Head: Great Helment - (+ 6 Stamina, + 4 Intelligence) $480");
                    }
                    if (good){
                        System.out.println("Head: Good Helment - (+ 3 Stamina, + 2 Intelligence) $290");
                    }
                    if (okay){
                        System.out.println("Head: Okay Helment - (+ 1 Stamina, + 1 Intelligence) $220");
                    }
                }
                if(body){
                    if(great){
                        System.out.println("Body: Great Chestplate - (+ 10 Stamina) $600");
                    }
                    if (good){
                        System.out.println("Body: Good Chestplate - (+ 5 Stamina) $330");
                    }
                    if (okay){
                        System.out.println("Body: Okay Chestplate - (+ 2 Stamina) $220");
                    }
                }
                if(feet){
                    if(great){
                        System.out.println("Feet: Great Greave - (+ 8 Agility, + 2 Spirit) $520");
                    }
                    if (good){
                        System.out.println("Feet: Good Greave - (+ 4 Agility, + 1 Spirit) $270");
                    }
                    if (okay){
                        System.out.println("Feet: Okay Greave - (+ 1 Agility, + 1 Spirit) $210");
                    }
                }
            }
            if(character.equals("Sorcerer")){
                if(weapon){
                    if(great){
                        System.out.println("Weapon: Great Wand - (+ 10 Strength) $600");
                    }
                    if (good){
                        System.out.println("Weapon: Good Wand - (+ 5 Strength) $320");
                    }
                    if (okay){
                        System.out.println("Weapon: Okay Wand - (+ 2 Strength) $250");
                    }
                }
                if(head){
                    if(great){
                        System.out.println("Head: Great Crown - (+ 6 Stamina, + 4 Intelligence) $480");
                    }
                    if (good){
                        System.out.println("Head: Good Crown - (+ 3 Stamina, + 2 Intelligence) $290");
                    }
                    if (okay){
                        System.out.println("Head: Okay Crown - (+ 1 Stamina, + 1 Intelligence) $220");
                    }
                }
                if(body){
                    if(great){
                        System.out.println("Body: Great Cloak - (+ 10 Stamina) $600");
                    }
                    if (good){
                        System.out.println("Body: Good Cloak - (+ 5 Stamina) $330");
                    }
                    if (okay){
                        System.out.println("Body: Okay Cloak - (+ 2 Stamina) $220");
                    }
                }
                if(feet){
                    if(great){
                        System.out.println("Feet: Great Shoes - (+ 8 Agility, + 2 Spirit) $520");
                    }
                    if (good){
                        System.out.println("Feet: Good Shoes - (+ 4 Agility, + 1 Spirit) $270");
                    }
                    if (okay){
                        System.out.println("Feet: Okay Shoes - (+ 1 Agility, + 1 Spirit) $210");
                    }
                }
            }
            if(character.equals("Rogue")){
                if(weapon){
                    if(great){
                        System.out.println("Weapon: Great Dagger - (+ 10 Strength) $600");
                    }
                    if (good){
                        System.out.println("Weapon: Good Dagger - (+ 5 Strength) $320");
                    }
                    if (okay){
                        System.out.println("Weapon: Okay Dagger - (+ 2 Strength) $250");
                    }
                }
                if(head){
                    if(great){
                        System.out.println("Head: Great Hood - (+ 6 Stamina, + 4 Intelligence) $480");
                    }
                    if (good){
                        System.out.println("Head: Good Hood - (+ 3 Stamina, + 2 Intelligence) $290");
                    }
                    if (okay){
                        System.out.println("Head: Okay Hood - (+ 1 Stamina, + 1 Intelligence) $220");
                    }
                }
                if(body){
                    if(great){
                        System.out.println("Body: Great Cape - (+ 10 Stamina) $600");
                    }
                    if (good){
                        System.out.println("Body: Good Cape - (+ 5 Stamina) $330");
                    }
                    if (okay){
                        System.out.println("Body: Okay Cape - (+ 2 Stamina) $220");
                    }
                }
                if(feet){
                    if(great){
                        System.out.println("Feet: Great Boots - (+ 8 Agility, + 2 Spirit) $520");
                    }
                    if (good){
                        System.out.println("Feet: Good Boots - (+ 4 Agility, + 1 Spirit) $270");
                    }
                    if (okay){
                        System.out.println("Feet: Okay Boots - (+ 1 Agility, + 1 Spirit) $210");
                    }
                }
            }

            addItem = choice.nextLine();
            if(addItem.contains("Great") && great){
                if(addItem.contains("Weapon") && weapon){
                    gold -= 600;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        great = false;
                        weapon = false;
                        strengthAdd += 10;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else if(addItem.contains("Head") && head){
                    gold -= 600;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        great = false;
                        head = false;
                        staminaAdd += 6;
                        intelligenceAdd += 4;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else if(addItem.contains("Body") && body){
                    gold -= 600;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        great = false;
                        body = false;
                        staminaAdd += 10;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else if(addItem.contains("Feet") && feet){
                    gold -= 600;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        great = false;
                        feet = false;
                        agilityAdd += 8;
                        spiritAdd += 2;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else {
                    System.out.println("Error.  Retry.");
                }
            } else if (addItem.contains("Good") && good){
                if((addItem.contains("Weapon") && weapon)||(addItem.contains("Head") && head)||(addItem.contains("Body") && body)||(addItem.contains("Feet") && feet)){
                    good = false;
                    gold -= 300;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else {
                    System.out.println("Error.  Retry.");
                }
                if(addItem.contains("Weapon")){
                    weapon = false;
                    strengthAdd += 5;
                } else if(addItem.contains("Head")){
                    head = false;
                    staminaAdd += 3;
                    intelligenceAdd += 2;
                } else if(addItem.contains("Body")){
                    body = false;
                    staminaAdd += 5;
                } else if(addItem.contains("Feet")){
                    feet = false;
                    agilityAdd += 4;
                    spiritAdd += 1;
                } else {
                    System.out.println("Error.  Retry.");
                }
            } else if (addItem.contains("Okay") && okay){
                if((addItem.contains("Weapon") && weapon)||(addItem.contains("Head") && head)||(addItem.contains("Body") && body)||(addItem.contains("Feet") && feet)){
                    okay = false;
                    gold -= 200;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else {
                    System.out.println("Type invalid.");
                }
                if(addItem.contains("Weapon")){
                    weapon = false;
                    strengthAdd += 2;
                } else if(addItem.contains("Head")){
                    head = false;
                    staminaAdd += 1;
                    intelligenceAdd += 1;
                } else if(addItem.contains("Body")){
                    body = false;
                    staminaAdd += 2;
                } else if(addItem.contains("Feet")){
                    feet = false;
                    agilityAdd += 1;
                    spiritAdd += 1;
                } else {
                    System.out.println("Error.  Retry.");
                }
            } else if(addItem.equals("None")){
                System.out.println("AHHH");
            }else {
                System.out.println("Error. Retry.");
            }
        }
        System.out.println("Item Choices: " + items);

        System.out.println("Character Stats:");
        if(character.equals("Barbarian")){
            playerB = new barbarian(s + strengthAdd, a + agilityAdd, st + staminaAdd, i + intelligenceAdd, sp + spiritAdd);
            System.out.println("Strength: " + playerB.strength + "\n" + "Agility: " + playerB.agility + "\n" + "Stamina: " + playerB.stamina + "\n" + "Intelligence: " + playerB.intelligence + "\n" + "Spririt: " + playerB.spirit);
        } else if(character.equals("Sorcerer")){
            playerS = new sorcerer(s + strengthAdd, a + agilityAdd, st + staminaAdd, i + intelligenceAdd, sp + spiritAdd);
            System.out.println("Strength: " + playerS.strength + "\n" + "Agility: " + playerS.agility + "\n" + "Stamina: " + playerS.stamina + "\n" + "Intelligence: " + playerS.intelligence + "\n" + "Spririt: " + playerS.spirit);
        } else {
            playerR = new rogue(s + strengthAdd, a + agilityAdd, st + staminaAdd, i + intelligenceAdd, sp + spiritAdd);
            System.out.println("Strength: " + playerR.strength + "\n" + "Agility: " + playerR.agility + "\n" + "Stamina: " + playerR.stamina + "\n" + "Intelligence: " + playerR.intelligence + "\n" + "Spririt: " + playerR.spirit);
        }
        
        choice.close();
        points.close();
    }  
}  