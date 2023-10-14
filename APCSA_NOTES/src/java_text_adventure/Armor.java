package java_text_adventure;

public class Armor {
  // instance variables
  private int defense;
  private int durability;

  // constructor (a special method)
  public Armor() {

    defense = 1;
    durability = 1;
  }

  // constructor (a special method)
  public Armor(int defense, int durability) {
    this.defense = defense;
    this.durability = durability;
  }

  public int takeDamage() {
    if (this.durability <= 0) {
      System.out.println("Armor is broken");
      return 0;
    } else {
      this.durability--;
      return this.defense;
    }
  }

  // method (Accessor/Getter)
  public int getDefense() {
    return this.defense;
  }

  // method (Accessor/Getter)
  public int getDurability() {
    return this.durability;
  }

  /*
   * public static void main(String[] args) { Armor leatherArmor = new Armor();
   * Armor stoneArmor = new Armor(); Armor bronzeArmor = new Armor(); Armor
   * ironArmor = new Armor(); Armor steelArmor = new Armor(); Armor diamondArmor =
   * new Armor(); Armor ultimaArmor = new Armor();
   * 
   * }
   */

}
