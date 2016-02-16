/*
 *  Simple example of the Java Scanner class which reads 
 *  the int, string and double value as an input
 */
import java.util.Scanner;  

class ScannerTest{  
 public static void main(String args[]){  
	 
   Scanner sc=new Scanner(System.in);  
     
   System.out.println("Enter your ticket no");   
   int rollno=sc.nextInt();  
   
   System.out.println("Enter your name");  
   String name=sc.next(); 
   
   System.out.println("Enter your fee");  
   double fee=sc.nextDouble();     
   
   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
   sc.close();  
 }  
}   