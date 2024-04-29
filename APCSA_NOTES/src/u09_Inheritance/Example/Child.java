package u09_Inheritance.Example;

import u02_Using_Objects.Methods;

/*
 * Classes that extend a superclass, called subclasses, can draw upon existing attributes and behaviors
 * of a superclass without repeating these in the code.
 * 
 * Extending a subclass from a superclass creates an "is-a" relationship from the subclass to the superclass
 * 
 * The keyword extends is used to establish an inheritance relationship between a subclass and superclass.
 * A class can extend only one superclass
 * 
 * 
 */
public class Child extends Parent {
	
	//Constructors are not inherited
	public Child() {
	/* The superclass constructor can be called from the first line of a subclass constructor 
	 * by using the keyword super and passing necessary parameters.
	 */
		super();
	/* The actual parameters (arguments) passed in the call to the superclass constructor 
	 * provide values that the constructor can use to initialize the object's instance variables
	 * 
	 */
		return;
		
	/* When a subclass's constructor does not explicitly call a superclass's constructor using super().
	 * The java compiler inserts a call to the superclass's no-argument constructor as the first statement 
	 * in the Child() constructor
	 */
	}
	
	//============================================================================================================================================================================//
	// Overridden Methods
	//> Every class automatically inherits from the 'Object' class
    //> overridden methods are methods inherited from another class that are given a different implementation
    //> commonly overridden methods include equals() and toString() from the 'Object' class
    //> overridden methods must have the same signature(returnType methodName (list of Formal Parameters))

	
	//overridden from Parent.toOverride()
//	public void toOverride() {
//		System.out.println("Called from " + this.getClass());
//	}
//	
	
	
	
	
    //overridden from Object.equals()
    public boolean equals(Object obj){
        if (this == obj) {
        return true;
        }
        
        obj = (Methods) obj;
        if(this.toString().equals(obj.toString())) {
          return true;
        }
        return false;
        
    }

    //overridden from Object.toString()
    public String toString(){
        return this.name;
    }

	
    public static void main(String[] args) {
    	Child sub = new Child();
    	sub.toOverride();
    }
	
	
	

}
