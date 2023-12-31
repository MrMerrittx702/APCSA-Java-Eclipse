package starterCode_java_text_adventure;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  //Class Attributes////////////////
  private static int typeSpeed = 30;
  //////////////////////////////////
  
  //main method/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public static void main(String[] args) {
    typeln("Mr. Merritt Presents...\n    A Java Text Adventure!");

    Scanner scanner = new Scanner(System.in);

    typeln("Enter your name brave adventurer!: ");

    String playerName = cleanInput(scanner.nextLine());

    Player player1 = new Player(playerName);

    nl();
    typeln("Welcome " + player1
        + ", to the land of Programia!\nHere our lives are simple, every day we are attacked by numerous monsters until we die.\nWhen Progamia runs again we awaken to a new land, and a new cycle of deadly monster foes!");
    typeln("And Your Adventure Begins!!!\n");

    gameLoop(player1);

  }
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //GameMethods//////////////////////////////////////////////////////////////////////////////////////////////////////
  public static void gameLoop(Player player) {
    //ArrayList<Enemy> enemyList = createEnemyList();

    while (player.getIsAlive()) {
      ArrayList<Enemy> enemyList = createEnemyList();
      Enemy enemy = selectRandomEnemy(enemyList);
      enemy.appears();

      while (enemy.getIsAlive() && player.getIsAlive()) {
        System.out.println("===================================================");
        System.out.println("|Current Stats | " + player + " hp: " + player.getHealth() + " | " + enemy + " hp: "
            + enemy.getHealth() + " |");
        System.out.println("===================================================");
        Scanner scanner = new Scanner(System.in);
        typeln("What would you like to do?\n 1) run  2) fight");
        int choice = scanner.nextInt();

        if (choice == 1) {
          if (player.run()) {
            typeln("You got away this time...\n");
            break;
          } else {
            typeln("Your path is blocked by the " + enemy + "\n");
          }
        } else if (choice == 2) {
          player.fight(enemy);
          if (!enemy.getIsAlive()) {
            break;
          }
        } else {
          typeln("You can't do that right now!");
          nl();

        }

        enemy.attack(player);

        if (!player.getIsAlive()) {
          gameOver();
          break;
        }
      }

    }
  }

  public static ArrayList createEnemyList() {
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

    return enemyList;
  }

  public static Enemy selectRandomEnemy(ArrayList<Enemy> enemyList) {
    int randomIndex = (int) (Math.random() * enemyList.size());
    return (enemyList.get(randomIndex));
  }

  public static void gameOver() {
    typeln("GAME OVER");
    return;
  }
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
  
  // Helper Methods///////////////////////////////////////////////////////////////////////////////////////////
  
  public static String cleanInput(String str) {
    String cleanStr = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i, i + 1).equals(" ")) {
        continue;
      } else {
        cleanStr += str.substring(i, i + 1);
      }
    }
    return cleanStr;
  }
  
  public static String input() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
    
  }

  public static void pause(int t_ms) {
    try {
      Thread.sleep(t_ms);
    } catch (InterruptedException e) {
      return;
    }
  }

  public static void typeln(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (i < str.length() - 1 && str.substring(i, i + 2).equals("\n")) {
        nl();
        i++;
      } else {
        System.out.print(str.substring(i, i + 1));
      }
      pause(typeSpeed);
    }
    nl();
  }

  public static void type(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (i < str.length() - 1 && str.substring(i, i + 2).equals("\n")) {
        nl();
        i++;
      } else {
        System.out.print(str.substring(i, i + 1));
      }
      pause(typeSpeed);
    }
  }

  public static <E> void println(E input) {
    System.out.println(input);
  }

  public static <E> void print(E input) {
    System.out.print(input);
  }

  public static void nl() {
    System.out.println();
  }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
