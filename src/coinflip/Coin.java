
package coinflip;
//********************************************************************
//  Coin.java       Author: Lewis/Loftus
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

public class Coin implements Lockable
{
   private final int HEADS = 0;
   private final int TAILS = 1;

   private int face;
   
   private int keyword;
   private boolean locked;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin()
   {
       keyword = 0;
       locked = false;
       flip();
   }

   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip()
   {
       if(!locked){
        face = (int) (Math.random() * 2);
       }
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public String isHeads()
   {
      if(!locked){
        if(face == HEADS){
            return "True";
        }
        else{
            return "False";
        }
      }
      else{
        return "Locked";
      }
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      if(!locked){ 
        String faceName;

        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
      
      return faceName;
      }
      else{
          return "Locked";
      }
      
   }
   
   
   public boolean locked(){
    return locked;
}
   public void setKey(int key){
       keyword = key;
   }
   public void unlock(int key){
       if(key == keyword){
           locked = false;
       }
   }
   public void lock(int key){
       if(key == keyword){
           locked = true;
       }
   }
}