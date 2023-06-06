import java.util.Scanner;

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
        int sp = 0
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

        System.out.println("You are given 1000 gold.  Please purchase three items.  You may only purchase one great item, one good item, and one okay item.");
        Boolean weapon = true;
        Boolean head = true;
        Boolean body = true;
        Boolean feet = true;
        Boolean great = true;
        Boolean good = true;
        Boolean ok = true;
        int gold = 1000;
        String char;
        String[] items;
        String addItem;

        while((weapon || head || body || feet) && (gold > 0)&& (great || good || okay)){
            if(char.equals("Barbarian")){
                if(weapon){
                    if(great){
                        System.out.println("Great Axe - 500");
                    }
                    if (good){
                        System.out.println("Good Axe - 300");
                    }
                    if (ok){
                        System.out.println("Okay Axe- 200");
                    }
                }
                if(head){
                    if(great){
                        System.out.println("Great Helment - 500");
                    }
                    if (good){
                        System.out.println("Good Helment - 300");
                    }
                    if (ok){
                        System.out.println("Okay Helment - 200");
                    }
                }
                if(body){
                    if(great){
                        System.out.println("Great Chestplate - 500");
                    }
                    if (good){
                        System.out.println("Good Chestplate - 300");
                    }
                    if (ok){
                        System.out.println("Okay Chestplate - 200");
                    }
                }
                if(feet){
                    if(great){
                        System.out.println("Great Greave - 500");
                    }
                    if (good){
                        System.out.println("Good Greave - 300");
                    }
                    if (ok){
                        System.out.println("Okay Greave - 200");
                    }
                }
            }
            if(char.equals("Sorcerer")){
                if(weapon){
                    if(great){
                        System.out.println("Great Wand - 500");
                    }
                    if (good){
                        System.out.println("Good Wand - 300");
                    }
                    if (ok){
                        System.out.println("Okay Wand - 200");
                    }
                }
                if(head){
                    if(great){
                        System.out.println("Great Crown - 500");
                    }
                    if (good){
                        System.out.println("Good Crown - 300");
                    }
                    if (ok){
                        System.out.println("Okay Crown - 200");
                    }
                }
                if(body){
                    if(great){
                        System.out.println("Great Cloak - 500");
                    }
                    if (good){
                        System.out.println("Good Cloak - 300");
                    }
                    if (ok){
                        System.out.println("Okay Cloak - 200");
                    }
                }
                if(feet){
                    if(great){
                        System.out.println("Great Shoes - 500");
                    }
                    if (good){
                        System.out.println("Good Shoes - 300");
                    }
                    if (ok){
                        System.out.println("Okay Shoes - 200");
                    }
                }
            }
            if(char.equals("Rogue")){
                if(weapon){
                    if(great){
                        System.out.println("Great Dagger - 500");
                    }
                    if (good){
                        System.out.println("Good Dagger - 300");
                    }
                    if (ok){
                        System.out.println("Okay Dagger - 200");
                    }
                }
                if(head){
                    if(great){
                        System.out.println("Great Hood - 500");
                    }
                    if (good){
                        System.out.println("Good Hood - 300");
                    }
                    if (ok){
                        System.out.println("Okay Hood - 200");
                    }
                }
                if(body){
                    if(great){
                        System.out.println("Great Cape - 500");
                    }
                    if (good){
                        System.out.println("Good Cape - 300");
                    }
                    if (ok){
                        System.out.println("Okay Cape - 200");
                    }
                }
                if(feet){
                    if(great){
                        System.out.println("Great Boots - 500");
                    }
                    if (good){
                        System.out.println("Good Boots - 300");
                    }
                    if (ok){
                        System.out.println("Okay Boots - 200");
                    }
                }
            }
            addItem = choice.nextLine();
            if(addItem.contains("Great") && great){
                if((addItem.contains("weapon") && weapon)||(addItem.contains("head") && head)||(addItem.contains("body") && body)||(addItem.contains("feet") && feet)){
                    great = false;
                    gold -= 500;
                    items.add(addItem);
                } else {
                    System.out.println("Item invalid.  Please re-enter.");
                }
            } else if (addItem.contains("Good") && good){
                if((addItem.contains("weapon") && weapon)||(addItem.contains("head") && head)||(addItem.contains("body") && body)||(addItem.contains("feet") && feet)){
                    good = false;
                    gold -= 300;
                    items.add(addItem);
                } else {
                    System.out.println("Item invalid.  Please re-enter.");
                }
            } else if (addItem.contains("Okay") && okay){
                if((addItem.contains("weapon") && weapon)||(addItem.contains("head") && head)||(addItem.contains("body") && body)||(addItem.contains("feet") && feet)){
                    okay = false;
                    gold -= 200;
                    items.add(addItem);
                } else {
                    System.out.println("Item invalid.  Please re-enter.");
                }
            } else {
                System.out.println("Item invalid.  Please re-enter.");
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