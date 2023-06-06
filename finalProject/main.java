import java.util.Scanner;
import java.util.ArrayList;

class main{  
    public static void main(String args[]){  
        String[][] environment = {{"-", "-", "-", "-"},{"0","0","0","M"},{"0","0","0","0"},{"0","0","M","0"},{"M","0","0","M"},{"-", "-", "-", "-"}};
        Scanner choice = new Scanner(System.in);
        String character = "";
        int talentPoints = 25;
        int s = 0;
        int a = 0;
        int st = 0;
        int i = 0;
        int sp = 0;
        player play;
        barbarian playerB;
        sorcerer playerS;
        rogue playerR;
        int strengthAdd = 0;
        int agilityAdd = 0;
        int staminaAdd = 0;
        int intelligenceAdd = 0;
        int spiritAdd = 0;
        String tentative = "";

        while(character.equals("")){
            System.out.println("Type one of the following characters to select: Barbarian, Sorcerer, or Rogue");
            System.out.println("For more details on each character, type: Stats");
            tentative = choice.nextLine();
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
                tentative = choice.nextLine();
            }
            if(tentative.equals("Barbarian") || tentative.equals("Sorcerer") || tentative.equals("Rogue")){
                character = tentative;
                System.out.println(character + " selected.");
            } else {
                    System.out.println("Error. Retry.");
                    continue;
            }
            
        }

        Scanner points = new Scanner(System.in);
        while(talentPoints > 0){
            System.out.println("Please ration 25 talent points for " + character + " among the 5 categories (strength, agility, stamina, intelligence, spirit).  Must be an integer.");
            System.out.println("Determine the amount of talent points for strength:");
            s = points.nextInt();
            if(s>0){
                talentPoints -= s;
            } else {
                System.out.println("Error.  Retry.");
                continue;
            }
            if(talentPoints < 0){
                System.out.println("Ran out of talent points.  Please reassign.");
                talentPoints = 25;
                continue;
            }
            System.out.println("Determine the amount of talent points for agility:");
            a = points.nextInt();
            if(a>0){
                talentPoints -= s;
            } else {
                System.out.println("Error.  Retry.");
                continue;
            }
            if(talentPoints < 0){
                System.out.println("Ran out of talent points.  Please reassign.");
                talentPoints = 25;
                continue;
            }            System.out.println("Determine the amount of talent points for stamina:");
            st = points.nextInt();
            if(st>0){
                talentPoints -= s;
            } else {
                System.out.println("Error.  Retry.");
                continue;
            }
            if(talentPoints < 0){
                System.out.println("Ran out of talent points.  Please reassign.");
                talentPoints = 25;
                continue;
            }            System.out.println("Determine the amount of talent points for intelligence:");
            i = points.nextInt();
            if(i>0){
                talentPoints -= s;
            } else {
                System.out.println("Error.  Retry.");
                continue;
            }
            if(talentPoints < 0){
                System.out.println("Ran out of talent points.  Please reassign.");
                talentPoints = 25;
                continue;
            }            System.out.println("Determine the amount of talent points for spirit:");
            sp = points.nextInt();
            if(sp>0){
                talentPoints -= s;
            } else {
                System.out.println("Error.  Retry.");
                continue;
            }
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
                    gold -= 480;
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
                    gold -= 520;
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
                if(addItem.contains("Weapon") && weapon){
                    gold -= 320;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        good = false;
                        weapon = false;
                        strengthAdd += 5;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else if(addItem.contains("Head") && head){
                    gold -= 290;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        good = false;
                        head = false;
                        staminaAdd += 3;
                        intelligenceAdd += 2;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else if(addItem.contains("Body") && body){
                    gold -= 330;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        good = false;
                        body = false;
                        staminaAdd += 5;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else if(addItem.contains("Feet") && feet){
                    gold -= 270;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        good = false;
                        feet = false;
                        agilityAdd += 4;
                        spiritAdd += 1;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else {
                    System.out.println("Error.  Retry.");
                }
            } else if (addItem.contains("Okay") && okay){
                if(addItem.contains("Weapon") && weapon){
                    gold -= 250;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        okay = false;
                        weapon = false;
                        strengthAdd += 2;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else if(addItem.contains("Head") && head){
                    gold -= 220;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        okay = false;
                        head = false;
                        staminaAdd += 1;
                        intelligenceAdd += 1;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else if(addItem.contains("Body") && body){
                    gold -= 220;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        okay = false;
                        body = false;
                        staminaAdd += 2;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else if(addItem.contains("Feet") && feet){
                    gold -= 210;
                    if(gold >= 0){
                        items.add(addItem);
                        System.out.println("Gold Remaining: " + gold);
                        System.out.println(addItem + " selected.");
                        okay = false;
                        feet = false;
                        agilityAdd += 1;
                        spiritAdd += 1;
                    } else{
                        System.out.println("Error.  Retry.");
                    }
                } else {
                    System.out.println("Error.  Retry.");
                }
            } else if(addItem.equals("None")){
                break;
            }else {
                System.out.println("Error. Retry.");
            }
        }
        System.out.println("Item Choices: " + items);

        System.out.println("Character Stats:");
        if(character.equals("Barbarian")){
            playerB = new barbarian(s + strengthAdd, a + agilityAdd, st + staminaAdd, i + intelligenceAdd, sp + spiritAdd);
            play = new player(playerB);
            System.out.println("Strength: " + play.strength + "\n" + "Agility: " + play.agility + "\n" + "Stamina: " + play.stamina + "\n" + "Intelligence: " + play.intelligence + "\n" + "Spririt: " + play.spirit + "\n" + "Health: " + play.health + "\n" + "Mana: " + play.mana);
        } else if(character.equals("Sorcerer")){
            playerS = new sorcerer(s + strengthAdd, a + agilityAdd, st + staminaAdd, i + intelligenceAdd, sp + spiritAdd);
            play = new player(playerS);
            System.out.println("Strength: " + play.strength + "\n" + "Agility: " + play.agility + "\n" + "Stamina: " + play.stamina + "\n" + "Intelligence: " + play.intelligence + "\n" + "Spririt: " + play.spirit + "\n" + "Health: " + play.health + "\n" + "Mana: " + play.mana);
        } else {
            playerR = new rogue(s + strengthAdd, a + agilityAdd, st + staminaAdd, i + intelligenceAdd, sp + spiritAdd);
            play = new player(playerR);
            System.out.println("Strength: " + play.strength + "\n" + "Agility: " + play.agility + "\n" + "Stamina: " + play.stamina + "\n" + "Intelligence: " + play.intelligence + "\n" + "Spririt: " + play.spirit + "\n" + "Health: " + play.health + "\n" + "Mana: " + play.mana);
        }

            String move;
            int xPos = 0;
            int yPos = 1;
            int monX = 0;
            int monY = 0;
            int monstersKilled = 0;
            monsters monster = new monsters();

            System.out.println("The game will now begin.  4 zombies will spawn at the beginning.  Once you beat all 4 monsters, you win.  Go directly next to a monster to engage in a fight.  P represents the player.  Monsters are represented by M and vary in 5 different difficulties.");
            while(play.health > 0){
                if(monstersKilled == 4){
                    System.out.println("You won the game!! Congragulations!");
                    break;
                }
                while(play.inFight == false){
                    environment[yPos][xPos] = "P";
                    if(yPos > 0){
                        if(environment[yPos-1][xPos].equals("M")){
                            play.inFight = true;
                            System.out.println("Monster found!");
                            monY = yPos-1;
                            monX = xPos;
                            continue;
                        }
                    }
                    if(yPos < 4){
                        if(environment[yPos+1][xPos].equals("M")){
                            play.inFight = true;
                            System.out.println("Monster found!");
                            monY = yPos+1;
                            monX = xPos;
                            continue;
                        }
                    }
                    if(xPos > 0){
                        if(environment[yPos][xPos-1].equals("M")){
                            play.inFight = true;
                            System.out.println("Monster found!");
                            monY = yPos;
                            monX = xPos-1;
                            continue;
                        }
                    }
                    if(xPos < 3){
                        if(environment[yPos][xPos+1].equals("M")){
                            play.inFight = true;
                            System.out.println("Monster found!");
                            monY = yPos;
                            monX = xPos+1;
                            continue;
                        }
                    }

                    for(int r = 0; r < environment.length; r++){
                        for(int c = 0; c < environment[0].length; c++){
                            System.out.print(environment[r][c]);
                    }
                    System.out.println();
                    }
                    System.out.println("Type N for (N)orth, W for (W)est, E for (E)ast, and S for (S)outh.");
                    move = choice.nextLine();
                    if(move.equals("N")){
                        if(yPos>1){
                            environment[yPos][xPos] = "0";
                            yPos--;
                            play.increaseMana();
                        } else {
                            System.out.println("Out of Bounds.");
                        }
                    } else if (move.equals("W")){
                        if(xPos>0){
                            environment[yPos][xPos] = "0";
                            xPos--;
                            play.increaseMana();
                        } else {
                            System.out.println("Out of Bounds.");
                        }
                    } else if (move.equals("E")){
                        if(xPos<3){
                            environment[yPos][xPos] = "0";
                            xPos++;
                            play.increaseMana();
                        } else {
                            System.out.println("Out of Bounds.");
                        }
                    } else if (move.equals("S")){
                        if(yPos<4){
                            environment[yPos][xPos] = "0";
                            yPos++;
                            play.increaseMana();
                        } else {
                            System.out.println("Out of Bounds.");
                        }
                    } else {
                        System.out.println("Error.  Retry.");
                        continue;
                    }
                }
                int monsterNumber = (int)(Math.random()*20);
                    if(monsterNumber < 10){
                        monster = new monsters(50, 3, 5);
                    } else if (monsterNumber < 15){
                        monster = new monsters(60, 5, 5);
                    } else if (monsterNumber < 18){
                        monster = new monsters(70, 7, 5);
                    } else if (monsterNumber < 19){
                        monster = new monsters(80, 10, 5);
                    } else if (monsterNumber < 20){
                        monster = new monsters(90, 13, 5);
                    } else{
                        System.out.println("error");
                    }
                    double monsterHealth = monster.getHealth();

                while(play.inFight){
                    int monsterDamage = ((int)(Math.random()*monster.getDiff() + monster.getMinDamage()));
                    double playerDamage = 0;
                    String movement;
                    environment[yPos][xPos] = "P";
                    for(int r = 0; r < environment.length; r++){
                        for(int c = 0; c < environment[0].length; c++){
                            System.out.print(environment[r][c]);
                    }
                    System.out.println();
                    }
                    System.out.println("Player Health: " + play.health);
                    System.out.println("Monster Health: " + monsterHealth);
                    System.out.println("Monster deals: " + monsterDamage);
                    play.health -= monsterDamage;
                    System.out.println("Choose a move: (A)ttack, (D)odge, (C)ast a spell, or attempt to (R)un");
                    movement = choice.nextLine();
                    if(movement.equals("A")){
                        playerDamage = play.attack();
                        System.out.println("Player deals: " + playerDamage);
                        monsterHealth -= playerDamage;
                    } else if (movement.equals("D")){
                        if(play.dodge()){
                            System.out.println("Monster's attack negated.");
                            play.health += monsterDamage;
                        } else {
                            System.out.println("Player failed to dodge.");
                        }
                    } else if (movement.equals("C")){
                        if(play.mana > 20){
                            playerDamage = play.castASpell();
                            System.out.println("Player deals: " + playerDamage);
                            monsterHealth -= playerDamage;
                        } else {
                            System.out.println("Not enough mana.");
                        }
                    } else if ( movement.equals("R")){
                        if(play.run()){
                            System.out.println("Player succesfully ran.");
                            play.inFight = false;
                            environment[yPos][xPos] = "0";
                            xPos = 0;
                            yPos = 1;
                            environment[yPos][xPos] = "P";
                        } else {
                            System.out.println("Player failed to run.");
                            play.inFight = true;
                        }
                    }
                    if(play.health < 0){
                        System.out.println("You have died.");
                        play.inFight = false;
                        continue;
                    }

                    if(monsterHealth <= 0){
                        System.out.println("Monster killed.");
                        monstersKilled++;
                        play.inFight = false;
                        environment[monY][monX] = "0";
                    }
                }
            }
            choice.close();
            points.close();
        }
    }