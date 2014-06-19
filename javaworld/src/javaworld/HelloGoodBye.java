/* http://www.javaworld.com/article/2075239/java-platform/java-101--object-oriented-language-basics--part-2--fields-and-methods.html?page=3
 * 
 * HelloGoodBye's main() method creates a new HelloGoodBye object and 
 * calls its hello() method. Because hello() returns a reference to 
 * that same object (via hello()'s return this; statement), a goodbye() 
 * method call is chained to the end of the hello() method call. 
 * (You will sometimes see method chaining used in Java source code, so it's good to know what's happening.)
 * 
 */

package javaworld;
class HelloGoodBye
{
   public static void main (String [] args)
   {
      new HelloGoodBye ().hello ().goodbye ();
   }
   HelloGoodBye hello ()
   {
      System.out.println ("Hello");
      return this;
   }
   void goodbye ()
   {
      System.out.println ("Goodbye");
   }
}