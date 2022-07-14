import java.util.*;

class BattlePlayer
{
   static Random r = new Random();
   private int HP = 100;
   int strength = 0;
   
   public int Battle()
   {
      strength = r.nextInt(10) + 1;
      return strength;
   }
   
   public int receiveDamage(int d)
   {
      HP = HP - d;
      return d;
   }
   
   public int getHP()
   {
      return HP;
   }
   
} // End class