package asd.one;

public class Car {
  String name;
  int tank;
  int oilconsumption;
  
  
  @Override
public String toString() {
	return "Car [name=" + name + ", tank=" + tank + ", oilconsumption=" + oilconsumption + "]";
}


public Car(String name,int tank,int oilconsumption) 
  {
	  this.name=name;
	  this.tank=tank;
	  this.oilconsumption=oilconsumption;
   }


}
