public class FinalRoomHardwood
{
   private FinalRoomDimension size;   // The size of the room
   private double hardwoodCost;    // Carpet cost per square foot
   private String str;
   
   /**
      Constructor
      @param dim The room's dimensions.
      @param cost The carpet's cost per square foot.
   */

   public FinalRoomHardwood(FinalRoomDimension dim, double cost)
   {
      // Make size reference a copy of the object referenced
      // by the dim argument.
      size = new FinalRoomDimension(dim.getLength(), dim.getWidth());
      
      // Assign the cost.
      hardwoodCost = cost;
   }
   
   /**
      getTotalCost method
      @return The total cost of the carpet.
   */
   
   public double getTotalCost()
   {
      // Return the total cost.
      return hardwoodCost * size.getArea();
   }

   /**
      toString method
      @return A string reporting the room's dimensions and
              the total cost of the carpet.
   */
   
   public String toString()
   {  
      // Create a String with the object state.
      str = String.format("\nRoom dimensions:\n" +
                                 "%s\nHardwood cost: $%,.2f", 
                                 size, getTotalCost());
      
      // Return the String
      return str;
   }
   
}
