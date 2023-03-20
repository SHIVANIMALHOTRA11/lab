package String;
import java.util.Scanner;
public class StringEquality {
public static void main(String[] args) {
	String str1,str2;
	Scanner ab= new Scanner(System.in);
	System.out.println("enter the  first String");
	str1= ab.nextLine();
	System.out.println("enter the  second string");
	str2 =ab.nextLine();
	
	// comparing two imput (java string compare)
	// if (str1.equals(str2)} equal{} -compare original content of string
	 if(str1.compareTo(str2)>0) // compare lexicographically
		 
		 System.out.println("equal string");
	 else
		 System.out.println("unequal");}}