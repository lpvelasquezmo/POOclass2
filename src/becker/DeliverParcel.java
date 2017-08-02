package becker;

import becker.robots.*;

public class DeliverParcel
{
       public static void moverAdel (Robot karel){
       for (int i = 0; i < 3 ; i ++){
           karel.move();
         }
}
       
        public static void moverIzq (Robot karel){
       for (int i = 0; i < 3 ; i ++){
           karel.turnLeft();
         }
}

   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Thing c3 = new Thing(prague, 5, 5);
       
       Wall p1 = 
               new Wall (prague, 2, 1, Direction.WEST ) ;
       Wall p2 =  
               new Wall (prague, 1, 1, Direction.WEST ) ;
       Wall p3 =  
               new Wall (prague, 1, 1, Direction.NORTH ) ;
       Wall p4 =  
               new Wall (prague, 1, 2, Direction.NORTH ) ;
       Wall p5 =  
               new Wall (prague, 2, 1, Direction.SOUTH ) ;
       Wall p6 =  
               new Wall (prague, 2, 2, Direction.SOUTH ) ;
        Wall p7 =  
               new Wall (prague, 1, 2, Direction.EAST ) ;
       Wall p8 =  
               new Wall (prague, 2, 2, Direction.EAST ) ;
      
       
       
       

       
       
       
      Robot karel = new Robot(prague, 0, 2, Direction.WEST,5);
    
      // Direct the robot to the final situation
       karel.turnLeft();
       karel.turnLeft();
      karel.move();
     moverIzq (karel);	// start turning right as three turn lefts
      moverAdel (karel);
     moverIzq (karel);
       moverAdel (karel);
     moverIzq (karel);
       moverAdel (karel);
       moverIzq (karel);
       karel.move();
       karel.move();
        karel.turnLeft();
       karel.turnLeft();
       
    //  karel.pickThing();
     
    
      System.out.println(karel.countThingsInBackpack());
   }
}
