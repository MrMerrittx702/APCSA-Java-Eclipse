package java_text_adventure;

public class Enemy {

  // instance variables
  private String name;
  private int health;
  private int damage;
  private boolean isAlive;

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

  // overriden toString() method inherited from Object class
  public String toString() {
    return this.name;
  }

  public void appears() {
    System.out.println("Oh No! A " + this.name + " suddenly appears!");
  }

  public void attack(Player player) {
    System.out.println("The " + this.name + " attacks" + " and does " + this.damage + " point(s) of damage.");
    player.takesDamage(this.damage);
  }

  public void takesDamage(int damage) {
    System.out.println("The " + this.name + " recieves " + damage + " point(s) of damage!");

    this.health -= damage;

    if (this.health <= 0) {
      System.out.println("The " + this.name + " is defeated!");
      this.isAlive = false;
    }
  }
  
  public int getHealth() {
    return this.health;
  }

  public boolean getIsAlive() {
    return isAlive;
  }

//  public static void main(String[] args) {
//    Enemy slime = new Enemy();
//    Enemy kingSlime = new Enemy("King Slime", 50, 10);
//    
//    slime.appears();
//    slime.attack();
//    slime.takesDamage(2);
//    slime.takesDamage(2);
//    slime.takesDamage(2);
//    slime.takesDamage(2);
//    slime.takesDamage(2);
//    
//    
//    kingSlime.appears();
//    kingSlime.attack();
//    kingSlime.takesDamage(10);
//    kingSlime.takesDamage(10);
//    kingSlime.takesDamage(10);
//    kingSlime.takesDamage(10);
//    kingSlime.takesDamage(10); 
//  }

}
