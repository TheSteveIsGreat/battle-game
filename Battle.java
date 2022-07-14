import java.util.*;

class Battle
{
   public static void main (String[] args)
   {
      // Variables
      Scanner keyboard = new Scanner (System.in);

      BattlePlayer you = new BattlePlayer();
      BattlePlayer computer = new BattlePlayer();
      String choice;
      
      // Run the game 
      do{
      
         System.out.println("Your HP: " + you.getHP());
         System.out.println("Computer HP: " + computer.getHP());
         System.out.println("Press h to hit, q to quit: ");
         choice = keyboard.next();
         
         if (choice.equalsIgnoreCase("q"))
         {
            break;
         }
         
         System.out.println();
         
         System.out.println("Your strength: " + you.Battle() + ", Their strength: " + computer.Battle());
         if (you.strength > computer.strength)
         {
            System.out.println("They have " + (you.strength - computer.strength) + " damage.");
            computer.receiveDamage(you.strength - computer.strength);
         }
         else if (computer.strength > you.strength)
         {
            System.out.println("You have " + (computer.strength - you.strength) + " damage.");
            you.receiveDamage(computer.strength - you.strength);
         }
         else
         {
            you.strength = 0;
            computer.strength = 0;
            System.out.println("It's a tie!");
         }
                 
       } while (you.getHP() > 0 && computer.getHP() > 0);
             
      // Detirmine the winner
      if (you.getHP() <= 0)
      {
         System.out.println("Computer wins");
      }
      else if (computer.getHP() <= 0)
      {
         System.out.println("You win!");
      } 
      
   } // End main 
    
} // End class