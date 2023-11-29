package starterCode_java_text_adventure;

public class Enemy {

  // instance variables
  private String name;
  private int health;
  private int damage;
  private boolean isAlive;

  // Constructors/////////////////////////////////////////////
  // constructor (a special method)
  public Enemy() {
    name = "slime";
    health = 10;
    damage = 2;
    isAlive = true;
  }

  // constructor (a special method)
  public Enemy(String name, int health, int damage) {
    this.name = name;
    this.health = health;
    this.damage = damage;
    this.isAlive = true;
  }
  ///////////////////////////////////////////////////////////

  // Overridden Methods///////////////////////////////////////
  // overridden toString() method inherited from Object class
  public String toString() {
    return this.name;
  }
  ///////////////////////////////////////////////////////////

  // Accessor Methods (Getters)///////////////////////////////
  public int getHealth() {
    return this.health;
  }

  public int getDamage() {
    return this.damage;
  }

  public boolean getIsAlive() {
    return isAlive;
  }
  ///////////////////////////////////////////////////////////

  // Mutator Methods (Setters)////////////////////////////////
  public void setHealth(int health) {
    this.health = health;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void setIsAlive(boolean isAlive) {
    this.isAlive = isAlive;
  }
  ///////////////////////////////////////////////////////////

  // Enemy
  // Methods///////////////////////////////////////////////////////////////////////////////////////
  public void appears() {
    Main.typeln("Oh No! A " + this.name + " suddenly appears!");
  }

  public void attack(Player player) {
    Main.typeln("The " + this.name + " attacks" + " and does " + this.damage + " point(s) of damage.");
    player.takesDamage(this.damage);
  }

  public void takesDamage(int damage) {
    Main.typeln("The " + this.name + " recieves " + damage + " point(s) of damage!");

    this.health -= damage;

    if (this.health <= 0) {
      Main.typeln("The " + this.name + " is defeated!");
      this.isAlive = false;
    }
  }
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////

  // just for testing///////////////////////////////////////
//  public static void main(String[] args) {
//    Player p1 = new Player();
//    Enemy slime = new Enemy();
//    Enemy kingSlime = new Enemy("King Slime", 50, 10);
//
//    slime.appears();
//    slime.attack(p1);
//    slime.takesDamage(2);
//    slime.takesDamage(2);
//    slime.takesDamage(2);
//    slime.takesDamage(2);
//    slime.takesDamage(2);
//
//    kingSlime.appears();
//    kingSlime.attack(p1);
//    kingSlime.takesDamage(10);
//    kingSlime.takesDamage(10);
//    kingSlime.takesDamage(10);
//    kingSlime.takesDamage(10);
//    kingSlime.takesDamage(10);
//  }

  /////////////////////////////////////////////////////////

  // generic print methods for making life easier///////////
  public static <E> void println(E input) {
    System.out.println(input);
  }

  public static <E> void print(E input) {
    System.out.print(input);
  }
  /////////////////////////////////////////////////////////

}
