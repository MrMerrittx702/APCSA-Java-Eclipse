package java_text_adventure;

public class Player {
  
  //instance variables
  private String name;
  private int health;
  private int weaponValue;
  private int armorValue;
  private boolean isAlive;
  
  
  //constructor (a special method)
  public Player() {
    name = "Joe";
    health = 50;
    weaponValue = 1;
    armorValue = 1;
    isAlive = true;
  }
  
  //constructor (a special method) overloaded
  public Player(String name) {
    this.name = name;
    health = 50;
    weaponValue = 1;
    armorValue = 1;
    isAlive = true;
  }
  
  //constructor (a special method) overloaded
  public Player(String name, int health, Weapon weapon, Armor armor) {
    this.name = name;
    this.health = health;
    this.weaponValue = weapon.getDamage();
    this.armorValue = armor.getDefense();
    isAlive = true;
  }
  
  //overriden toString() method inherited from Object class
  public String toString(){
    return this.name;
  }
  
  //method (Accessor/Getter)
  public int getHealth() {
    return this.health;
  }
  
  //method (Mutator/Setter)
  public void setHealth(int health) {
    this.health = health;
  }
  
//method (Accessor/Getter)
  public boolean getIsAlive() {
    return isAlive;
  }
  
  //method
  public void fight(Enemy enemy) {
    return;
  }
  
  //method
  public void run() {
    return;
  }
  
  //method
  public void useItem() {
    return;
  }
  
  //main method (runs when the file is executed)
  public static void main(String[] args) {
    Player p1 = new Player();
    System.out.println(p1);
  }
  
}
