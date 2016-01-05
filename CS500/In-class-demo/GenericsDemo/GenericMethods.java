
public class GenericMethods {

	 public static<T> void printArray(T[] inputArray ) //generic method
	   { 
	      for (int i = 0; i < inputArray.length; i ++)
	         System.out.printf( "%s ", inputArray[i] );

	      System.out.println();      
	   } 
	 
	 
	 
	 public static void main( String args[] ) 
	  {
	      // create arrays of Integer, Double and Character
	      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

	      System.out.println( "Array integerArray contains:" );
	      printArray( integerArray ); // pass an Integer array
	      System.out.println( "\nArray doubleArray contains:" );
	      printArray( doubleArray ); // pass a Double array
	      System.out.println( "\nArray characterArray contains:" );
	      printArray( characterArray ); // pass a Character array
	   } // end main

}
