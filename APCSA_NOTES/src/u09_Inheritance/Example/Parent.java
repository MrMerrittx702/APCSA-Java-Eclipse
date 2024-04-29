package u09_Inheritance.Example;

/*
 * A class hierarchy can be developed by putting common attributes and behaviors of related classes into a single class
 * called a super class
 */
public class Parent {
	
	//Instance Variables
	public String name;
	public int num;
	public boolean isChild;
	
	private boolean isPrivate;
	
	
	public Parent() {
		name = "John Smith";
		num = 10;
		isChild = false;
		isPrivate = true;
		
		
		return;
	}
	
	public void publicMethod() {
		return;
	}
	
	private void privateMethod() {
		return;
	}
	
	public void toOverride() {
		System.out.println("Called from" + this.getClass());
	}
	
	

}
