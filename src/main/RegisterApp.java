package main;
import lib.Name;
import lib.Register;
/**
 * The RegisterApp program tests the functionality of the Register Class by adding and removing
 * names from the register, iterating through the register to return all family names bigger or
 * equal to the length of 5, in upper case followed by the first letter of their first name 
 * in the format 'LASTNAME, F'.
 * 
 * @author Jakub Chamera - P2409490
 */


public class RegisterApp {


	public static String execute(Register reg, Name n) {
		reg.removeName(1);
		reg.addName(n);
		String result = "";	
		
		for (int i = 0; i < reg.registerSize(); i++) {
			 
			 if (reg.getName(i).getFamilyName().length() >= 5) {
					
				 result = result + reg.getName(i).getFamilyName().toUpperCase() + ", " 
				 + reg.getName(i).getFirstName().charAt(0) + "\n" ;
			}
 
		}
		 return result;
	}
}
