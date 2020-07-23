//Accessmodifier allows to access method/classs in apackage,in class or inside our project
/*Access Levels
  Modifier     Class  Package  Subclass  World
   Public          y     y         y        y
   Protected       y     y         y        n
   No modifier     y     y         n        n
   private         y     n         n        n
 */
public class Accessmodifiers {
	private String Name;
   private int id;
    //public String name;
    //public int id;
    //not to give access for variable outside class/package
    //declare member variable as private or protected
   //cannot directly access the variable if we declare as private
   
   //use getters and setters to access member variables
public String getName() {
	return Name;
}
//when two similar variable name use this keyword to differentiate local variable and member varaibale
public void setName(String name) {
	this.Name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
