package java_text_adventure;


import java.util.ArrayList;

public class Player {
  //Class Attributes///////////////
  private static int bagSize = 10;
  /////////////////////////////////
  
  // instance variables////////////
  private String name;
  private int health;
  private boolean isAlive;
  
  private int weaponValue;
  private int armorValue;
  
  private ArrayList<Object> itemBag;
  /////////////////////////////////
  
  //Constructors////////////////////////////////////////////////////////
  // constructor (a special method)
  public Player() {
    name = "Joe";
    health = 100;
    weaponValue = 10;
    armorValue = 5;
    isAlive = true;
    itemBag = new ArrayList<>();
  }

  // constructor (a special method) overloaded
  public Player(String name) {
    //this.name = name;
    setName(name);
    health = 100;
    weaponValue = 10;
    armorValue = 5;
    isAlive = true;
    itemBag = new ArrayList<>();
  }

  // constructor (a special method) overloaded
  public Player(String name, int health, Weapon weapon, Armor armor) {
    //this.name = name;
    setName(name);
    this.health = health;
    this.weaponValue = weaponValue;
    this.armorValue = armorValue;
    this.isAlive = isAlive;
    itemBag = new ArrayList<>();
  }
  /////////////////////////////////////////////////////////////////////////
  
  //Player methods////////////////////////////////////////
  public void fight(Enemy enemy) {
      enemy.takesDamage(this.weaponValue);
    return;
  }

  public boolean run() {
    return Math.random() > 0.6;
  }

  public void useItem() {
    showItems();
    String choice = Main.input();
    
  }
  ////////////////////////////////////////////////////////////////////////////
  public void takesDamage(int damage) {
    Main.typeln( this.name + " recieves " + damage + " point(s) of damage!");

    this.health -= damage;

    if (this.health <= 0) {
      Main.typeln( this.name + " is defeated!");
      this.isAlive = false;
    }
  }  
  //////////////////////////////////////////////////////////////////////////////
  public void showItems() {
    println("What would you like to use?...");
    for(int i = 0; i < itemBag.size(); i++) {
      println((i+1) + ") " + itemBag.get(i));
    }
  }
  
  public void addItemToBag(Item item) {
    if(itemBag.size() >= bagSize) {
      println("Your bag is full.");
    }
    else {
    itemBag.add(item);
    }
  }
  /////////////////////////////////////////////////////////
  
  
  // overriden toString() method inherited from Object class
  public String toString() {
    return this.name;
  }
  //////////////////////////////////////////////////////////
  //Accessor Methods (Getters)/////////////////////////
  public int getHealth() {
    return this.health;
  }
  
  public int getWeaponValue() {
    return this.weaponValue;
  }
  
  public int getArmorValue() {
    return this.armorValue;
  }
  
  public boolean getIsAlive() {
    return this.isAlive;
  }
  //////////////////////////////////////////////////////
  
  //Mutator Methods (Setters)///////////////////////////
  public void setName(String name) {
    String result = "";
    for(char c : name.toCharArray()) {
      if(!Character.isDigit(c) && c != ' ') { //' ' == 32
        result += c;
      }
    }
    this.name = result;
  }
  
  public void setHealth(int health) {
    this.health = health;
  }
  
  public void setWeaponValue(int weaponValue) {
    this.weaponValue = weaponValue;
  }
  
  public void setArmorValue(int armorValue) {
    this.armorValue = armorValue;
  }
  
  public void setIsAlive(boolean isAlive) {
    this.isAlive = isAlive;
  }
  ////////////////////////////////////////////////////////
  

  
  //just for testing///////////////////////////////////////
  public static void main(String[] args) {
    
    Player p1 = new Player();
    Item rubish = new Item();
    Item potion = new Item("health potion");
    
    p1.useItem();
    for(int i = 0; i<=10; i++) {
      p1.addItemToBag(potion);
    }
    p1.useItem();
    
  }
  /////////////////////////////////////////////////////////
  
  //generic print methods for making life easier///////////
  public static <E> void println(E input) {
    System.out.println(input);
  }
  
  public static <E> void print(E input) {
    System.out.print(input);
  }
  /////////////////////////////////////////////////////////

}
