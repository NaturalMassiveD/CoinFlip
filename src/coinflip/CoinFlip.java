package coinflip;
//********************************************************************
//  CoinFlip.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an if-else statement.
//********************************************************************
import java.util.Scanner;
public class CoinFlip
{
   //-----------------------------------------------------------------
   //  Creates a Coin object, flips it, and prints the results.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      //int attempt;
      Scanner sc = new Scanner(System.in);
      int keyword;
       keyword = 123;
      System.out.println("Enter the key:");
      int attempt = sc.nextInt();
      //Coin key = new Coin();
      
       
       Coin myCoin = new Coin();
       myCoin.unlock(attempt);

      myCoin.flip();

      System.out.println(myCoin);

      if (myCoin.isHeads())
         System.out.println("You win.");
      else
         System.out.println("Better luck next time.");
   }
}
