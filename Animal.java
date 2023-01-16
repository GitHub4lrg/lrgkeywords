/**
 * class that models an animal, contains animal related data
 * 
 * general best practices:
 * generally we do not add static or final unless it is a logical fit
 * generally we keep fields private and write getters/setters - best practice
 */
public class Animal{

    //species should not be changed
    public String species;
    //we decided that developers should not have direct access to age, because changing it may break some funtionality
    private int age;
    //we decided its ok for developers to change the name and that this will not break any logic - public
    public String name;
    public Animal(String species){
        this.species = species;
    }
    public void setName(String name){
        this.name = name;
    }
}
/*
 * Access modifiers
 * Changes the visibility of variables, methods
 * Private - complete restriction
 * Default - not visible outside of package or subclasses
 * Protected - not visible outside of package, but visible in subclasses outside package
 * Public - we've seen on all of our classes and methods
 * 
 * having access modifiers allows us to communicate, both to developers, and the compiler, if other classes
 * should be given permission to modify the variable or run the method
 * 
 * Non-access modifiers
 * Static - related to OOP - variables and methods belong to the class rather than an object
 * Final - for variables, the variable can not be change
 */