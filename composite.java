/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
      int a, b;
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter a number to check Prime or Composite ");
  b = scan.nextInt();
  
  scan.close();
  
  if (b == 0 || b == 1)
   System.out.println(b +" is neither Prime nor Composite" );

  for (a = 2; a <= b - 1; a++) {
   if (b % a == 0) {
    System.out.println(b +"  is Composite number" );
    break;
   }
  }
  if (b == a)
   System.out.println(b +"  is Prime number " );

	}
}
