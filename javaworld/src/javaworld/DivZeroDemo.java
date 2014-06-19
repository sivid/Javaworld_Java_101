package javaworld;

class DivZeroDemo
{
   public static void main (String [] args)
   {
      double d = 1.0 / 0.0;
      System.out.println (d);
      d = -1.0 / 0.0;
      System.out.println (d);
      d = 0.0 / 0.0;
      System.out.println (d);
      //int i = 1 / 0;
   }
}