/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;

/**
 *
 * @author El PcGamer
 */
import becker.robots.*;

  
public class Eje3
{  public static void girarDerecha(Robot karel){
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
   }
   
   public static void main(String[] args)
   {  
     City prague= new City();  
     Robot karel= new Robot(prague, 1, 0, Direction.EAST,0);
    
   
     // Set up the initial situation
     
      
      
      for(int i=1;i<6;i++){
          for(int l=1;l<7;l++  ){
             Thing c1= new Thing(prague,l ,i );
              
          }
           
      }
     for(int i=0; i<5;i++){
         karel.move();
         karel.pickThing();
     }
     girarDerecha(karel);
     for(int i=0; i<5;i++){
         karel.move();
         karel.pickThing();
     } 
     girarDerecha(karel);
      for(int i=0; i<4;i++){
          karel.move();
          karel.pickThing();
      }
      girarDerecha(karel);
      for(int i=0; i<4;i++){
          karel.move();
          karel.pickThing();
      }
      girarDerecha(karel);
      for(int i=0; i<3;i++){
          karel.move();
          karel.pickThing();
      }
      girarDerecha(karel);
      for(int i=0; i<3;i++){
          karel.move();
          karel.pickThing();
      }
      girarDerecha(karel);
      for(int i=0; i<2;i++){
          karel.move();
          karel.pickThing();
      }
      girarDerecha(karel);
      for(int i=0; i<2;i++){
          karel.move();
          karel.pickThing();
      }
      girarDerecha(karel);
      for(int i=0; i<1;i++){
          karel.move();
          karel.pickThing();
      }
      girarDerecha(karel);
      for(int i=0; i<1;i++){
          karel.move();
          karel.pickThing();
      }
      
      
        // karel.putThing();
     
      System.out.println(karel.countThingsInBackpack());
       
   }
}
