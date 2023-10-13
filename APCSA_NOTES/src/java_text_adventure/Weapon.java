package java_text_adventure;

public class Weapon {
  
  //instance variables
  private int damage;
  private int durability;
  
  //constructor (a special method)
  public Weapon() {
    damage = 1;
    durability = 1;
    
  }
  
  //constructor (a special method)
  public Weapon(int damage, int durability) {
    this.damage = damage;
    this.durability = durability;
    
  }
  
  //method
  public int attack() {
    if(this.durability <= 0) {
      System.out.println("Weapon is broken");
      return 0;
    }else {
      this.durability--;
      return this.damage;
    }
    
  }
  
  //method (Accessor/Getter)
  public int getDamage() {
    return this.damage;
  }
  
  //method (Accessor/Getter)
  public int getDurability() {
    return this.durability;
  }
  
  /*
  public static void main(String[] args) {
    Weapon woodenSword = new Weapon();
    Weapon stoneSword = new Weapon(6,6);
    Weapon bronzeSword = new Weapon(7,7);
    Weapon ironSword = new Weapon(8,8);
    Weapon steelSword = new Weapon(8,8);
    Weapon diamondSword = new Weapon(20,20);
    Weapon ultimaSword = new Weapon(1000,1000);
  }
  */
}
