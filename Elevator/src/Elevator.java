
import java.util.Scanner;
public class Elevator
 {
       int CurrentPoistion,DestinationPoistion,liftPoistion;
       int i;

	public int getCurrentPoistion() {
		return CurrentPoistion;
	}

	public void setCurrentPoistion(int currentPoistion) {
		CurrentPoistion = currentPoistion;
	}

	public int getDestinationPoistion() {
		return DestinationPoistion;
	}

	public void setDestinationPoistion(int destinationPoistion) {
		DestinationPoistion = destinationPoistion;
	}

	public int getLiftPoistion() {
		return liftPoistion;
	}

	public void setLiftPoistion(int liftPoistion) {
		this.liftPoistion = liftPoistion;
	}
       public void goUpward(int currentPoistion,int liftPoistion,int destinationPoistion)
       {
    	   while(currentPoistion<liftPoistion)
    	   {
    		   liftPoistion--; 		   
     	   }
    	   while(currentPoistion>liftPoistion)
    	   {
    		   liftPoistion++;
    	   }
    	   for( i=currentPoistion;i<=destinationPoistion;i++)
    	   {
    		   System.out.println("going up..."+i);
    		   
    	   }
    	   i--;
    	   System.out.println("Reached Destination at "+ i+"th floor");
    	   }
       public void goDownWard(int currentPoistion,int liftPoistion,int destinationPoistion)
       {
    	   while(currentPoistion<liftPoistion)
    	   {
    		   liftPoistion--; 		   
     	   }
    	   while(currentPoistion>liftPoistion)
    	   {
    		   liftPoistion++;
    	   }
    	   for(int i=currentPoistion;i>=destinationPoistion;i--)
    	   {
    		   System.out.println("going down..."+i);
    		   
    	   }
    	   i++;
    	   System.out.println("Reached Destination at "+ i+"th floor");
    	   }
       
	
	
}
