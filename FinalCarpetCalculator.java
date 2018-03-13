import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates is a update to the CarpetCalculator Assignment.
   Upon running it will ask the user for length and width of the room then display a JFrame
   before supplying the user with the price of the option they chose.
*/

public class FinalCarpetCalculator
{
   public static void main(String[] args)
   {
      final double HARDWOOD_PRICE = 10.0; //Price per square foot
      final double CARPET_PRICE = 8.0; // Price per square foot
      double length=0;                   // To input room length
      double width=0;                    // To input room width
      FinalRoomDimension dimensions;        // To hold room dimensions
      FinalRoomCarpet choice1;
      FinalRoomHardwood choice2;
      String finalresult;
      String hardwood;
      String carpet;
      


      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Display intro.
      System.out.println("This program will display price to " +
                         "carpet a room and also to put hardwood in a room. \nYou must input the " +
                         "room's dimensions in feet.");
      
      // Get the length of the room.
      System.out.print("Enter the length first: ");
      try{
      length = keyboard.nextDouble();
      }
      catch(Exception e){
      System.out.println("ERROR: MAKE SURE LENGTH IS A NUMBER");
      System.exit(1);
      }
      // Get the width of the room.
      System.out.print("Now enter the width: ");
      try{
      width = keyboard.nextDouble();
      }
      catch(Exception e){
      System.out.println("ERROR: MAKE SURE WIDTH IS A NUMBER");
      System.exit(1);
      }
      // Create RoomDimension and RoomCarpet objects.
      dimensions = new FinalRoomDimension(length, width);
      
      choice1 = new FinalRoomCarpet(dimensions, CARPET_PRICE);
      choice2 = new FinalRoomHardwood(dimensions, HARDWOOD_PRICE);

      // Display the dimensions and cost.
      
      //MAKE A GETTER = ANSWER?
      
      carpet = choice1.toString();
      hardwood = choice2.toString();
      
      FinalWhichChoice finalChoice = new FinalWhichChoice(carpet, hardwood);
     // finalresult = new FinalWhichChoice(carpet, hardwood);
   }
   
   
}