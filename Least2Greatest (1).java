import java.util.Arrays;
import java.util.Scanner;


// Text-printing program.

public class Least2Greatest  
{
   // main method begins execution of Java application
   public static void main( String[] args )
   {
	   Scanner input = new Scanner(System.in);

    
       System.out.println("How many numbers do you want to compare?");
       int num = input.nextInt();

       int array[] = new int[num];

       System.out.println("Enter " + num + " numbers.");

       for (int i = 0 ; i < array.length; i++ ) {
          array[i] = input.nextInt();
       }

       Arrays.sort(array);

       System.out.println("These are the numbers you have entered in least to greatest.");
       printArray(array);

       input.close();

   }

   
   public static void printArray(int arr[]){

       int n = arr.length;

       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
       
       
       }
   }
}


/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/