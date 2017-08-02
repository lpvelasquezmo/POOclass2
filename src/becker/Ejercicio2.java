/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;

import becker.robots.*;

/**
 *
 * @author ESTUDIANTE
 */
public class Ejercicio2 {
    


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
      Thing c3 = new Thing(prague, 2, 2);
      Robot karel = new Robot(prague, 1, 2, Direction.SOUTH,5);
       
       Wall p1 = 
               new Wall (prague, 2, 1, Direction.WEST ) ;
       Wall p2 =
               new Wall (prague, 1, 1, Direction.WEST ) ;
       Wall p3 =  
               new Wall (prague, 1, 1, Direction.NORTH ) ;
        Wall p6 =  
               new Wall (prague, 1, 2, Direction.NORTH ) ;
       Wall p4 =  
               new Wall (prague, 1, 2, Direction.SOUTH ) ;
       Wall p5 =  
               new Wall (prague, 2, 1, Direction.SOUTH ) ;

        Wall p7 =  
               new Wall (prague, 1, 2, Direction.EAST ) ;
       
       
        moverIzq (karel);
        karel.move();
        karel.turnLeft();
         karel.move();
       karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
         moverIzq (karel);
         karel.move();
         moverIzq (karel);
          karel.move();
           moverIzq (karel);
       
          
 System.out.println(karel.countThingsInBackpack());
   }
}