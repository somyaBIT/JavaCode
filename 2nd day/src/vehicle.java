import java.io.*;
public interface vehicle {

	 void changeGear(int a);
	    void speedUp(int a);
	    void applyBrakes(int a);
}
class Bicycle implements  vehicle {
    
    int speed;
    int gear;
      
    // to change gear
    @Override
    public void changeGear(int newGear){
          
        gear = newGear;
    }
      
    // to increase speed
    @Override
    public void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
          
        speed = speed - decrement;
    }
      
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}
  
class Bike implements  vehicle {
      
    int speed;
    int gear;
      
    // to change gear
    @Override
    public void changeGear(int newGear){
          
        gear = newGear;
    }
      
    // to increase speed
    @Override
    public void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
          
        speed = speed - decrement;
    }
      
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
      
}
