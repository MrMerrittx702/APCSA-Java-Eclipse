package java_text_adventure;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void gameLoop(Player player) {
    Enemy slime = new Enemy();
    Enemy slimeDuo = new Enemy("Slime Duo", 20, 4);
    Enemy slimeTrio = new Enemy("Slime Trio", 30, 6);
    Enemy superSlime = new Enemy("Super Slime", 40, 8);
    Enemy kingSlime = new Enemy("King Slime", 50, 10);

    ArrayList<Enemy> enemyList = new ArrayList<>();
    enemyList.add(slime);
    enemyList.add(slimeDuo);
    enemyList.add(slimeTrio);
    enemyList.add(superSlime);
    enemyList.add(kingSlime);

    
   
    while (player.getIsAlive()) {
      Enemy enemy = selectRandomEnemy(enemyList);
      enemy.appears();
      
      while(enemy.getIsAlive() && player.getIsAlive()) {
        System.out.println("|Curren Stats|" + player +" hp:" + player.getHealth() +"|" + enemy + " hp: " + enemy.getHealth() + "|");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What would your like to do?\n 1) run  2) fight");
        int choice = scanner.nextInt();

        if (choice == 1) {
          if(player.run()) {
            System.out.println("You got away this time...");
            break;
          }
          else {
            System.out.println("Your path is blocked by the " + enemy);
          }
        } else if (choice == 2) {
          player.fight(enemy);
          if(!enemy.getIsAlive()) {
            break;
          }
        } else {
          System.out.println("You can't do that right now!");
          nl();
        
        }
        
        enemy.attack(player);
        
        if(!player.getIsAlive()) {
          gameOver();
          break;
        }
      }

    }
  }
  
  public static void gameOver() {
    System.out.println("GAME OVER");
    return;
  }

  public static Enemy selectRandomEnemy(ArrayList<Enemy> enemyList) {
    int randomIndex = (int) (Math.random() * enemyList.size());
    return (enemyList.get(randomIndex));
  }

  public static void nl() {
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println("Mr. Merritt Presents...\n    A Java Text Adventure!");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name brave adventurer!: ");

    String playerName = scanner.nextLine();

    Player player1 = new Player(playerName);

    nl();
    System.out.println("Welcome " + player1
        + ", to the land of Programia!\nHere our lives are simple, every day we are attacked by numerous monsters until we die.\nWhen Progamia runs again we awaken to a new land, and a new cycle of deadly monster foes!");
    System.out.println("And Your Adventure Begins!!!");
    nl();

    gameLoop(player1);

  }
}
