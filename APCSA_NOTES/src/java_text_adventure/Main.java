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
    
    
    Enemy enemy = selectRandomEnemy(enemyList);
    boolean sameEnemy = false;
    
    boolean run = true;
    while(run) {
      
      if(sameEnemy) {
        enemy.appears();
      }
      else {
        enemy = selectRandomEnemy(enemyList);
        enemy.appears();
      }
      
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("What would your like to do?\n 1) run  2) fight  3) use item");
      int choice = scanner.nextInt();
      if(choice == 1) {
        
        sameEnemy = false;
        continue;
      }
      else if(choice == 2) {
        
        sameEnemy = false;
        continue;
      }
      else if(choice == 3) {
        
        sameEnemy = false;
        continue;
      }
      else {
        System.out.println("You can't do that right now!");nl();
        sameEnemy = true;
      }
      
    }
  }
  
  public static Enemy selectRandomEnemy(ArrayList<Enemy> enemyList) {
    int randomIndex = (int) (Math.random() * enemyList.size());
    return(enemyList.get(randomIndex));
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
    System.out.println("Welcome " + player1 + ", to the land of Programia!\nHere our lives are simple, every day we are attacked by numerous monsters until we die.\nWhen Progamia runs again we awaken to a new land, and a new cycle of deadly monster foes!");
    System.out.println("And Your Adventure Begins!!!");
    nl();
    
    gameLoop(player1);
    
    
    
  }
}
