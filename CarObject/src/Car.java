
public class Car {
// instant variables
private String color;
private int horsepower;
private String enginesize;
private static int count;
public Car(){
	this.color ="Red";
	this.horsepower = 500;
	this.enginesize = "v4";
	this.count++;
}
public Car(String color, int horsepower, String enginesize){
	this.color=color;
	this.horsepower=horsepower;
	this.enginesize=enginesize;
	this.count++;
}

public static int getCount() {
	return count;
}
public String getColor(){
	String color =this.color;
	return color;
}
public void setColor (String color) {
this.color=color;
	
}
public int getHorsePower(){
	int horsepower=this.horsepower;
	return horsepower;
}
public void setHorsePower(int horsepower){
this.horsepower=horsepower;
}

public String getEngineSize(){
	String enginesize=this.enginesize;
	return enginesize;
}
public void setEngineSize(String enginesize){
	this.enginesize=enginesize;
}
public String toString(){
return "The color of the car is " + this.color + " The horse power is: " + this.horsepower + " The engine size is: " + this.enginesize; 
}

public boolean equals(Car otherObject) {
	return (this.color == otherObject.color)&&(this.horsepower == otherObject.horsepower)&&(this.enginesize.equals(enginesize));
}
}
