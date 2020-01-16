package lib;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


/** 
 *  A Register represents an ArrayList that stores Names. The Register can have Names added, removed,
 *  sorted, retrieved and the Register can be completely cleared. It also contains the searchByFamilyName
 *  method and the countFirstNameOccurences method which allows to search through the Register more 
 *  specifically. Size of the register initially starts at 10 and can be resized.   
 *  The Register class implements the Iterable interface which allows for an object to be
 *  the target of a for-each loop statement, thus enabling iteration through the list.
 * 
 * @author Jakub Chamera - P2409490
 */

public class Register implements Iterable<Name>{
	/**
	 *	Fields
	 */
	private ArrayList<Name> list;
	
	/**
	 * Default constructor. Creates a new and empty list of type ArrayList and 
	 * sets the initial capacity of the list to 10
	 */
	public Register() {
		list = new ArrayList<>();
	}
	

	//Methods
	/**
	 * The addName method adds a parameter of type Name into this list
	 * @param name The name being added
	 */
	public void addName(Name name) {
		this.list.add(name);
	}
	
	/**
	 * The removeName method takes an input index of type int and removes the name from 
	 * that given index from the list
	 * @param index The index of the name in the list to be removed
	 * @return Returns the list with the name removed at that specified index
	 */
	public Name removeName(int index) {
		return this.list.remove(index);
	}
	
	/**
	 * The getName method takes an input index of type int, accesses and returns 
	 * the name at that index
	 * @param index The index of the name to be accessed
	 * @return Returns the name from the list at the given index
	 */
	public Name getName(int index) {
		return this.list.get(index);
	}
	
	/**
	 * The registerSize method returns the number of elements
	 * that are in the register (list)
	 * 
	 * @return Returns the number of elements
	 */
	public int registerSize() {
		return this.list.size();
	}
	
	/**
	 * The clearRegister method removes all elements from 
	 * the register list
	 */
	public void clearRegister() {
		list.clear();
	}
	
	/**
	 * The isRegisterEmpty method checks if the given list contains no elements,
	 * returns a boolean of true if there are no elements in the list and false
	 * if there are elements in the list
	 * @return Returns a boolean of true or false
	 */
	public boolean isRegisterEmpty() {
		return list.isEmpty();
	}
	
	/**
	 * The sortRegister method sorts the specified list into ascending order, all elements
	 * in the list must implement the Comparable interface thus being comparable
	 */
	public void sortRegister() {
		Collections.sort(list);
		}
	
	/**
	 * The searchRegisterByFamilyName method searches the list by a given family name (String).
	 * Returns a boolean of true if a name in the list has a familyName that equals the given 
	 * family name and returns false if no instance of that familyName occurs in the list.
	 * @param familyName The given parameter of familyName that's being searched for
	 * @return Returns a boolean of true or false depending on the search results
	 */
	public boolean searchRegisterByFamilyName(String familyName) {
		boolean exists = false;
		
		for (Name name : list) {
			if (name.getFamilyName().equals(familyName)) {
				exists = true;
			}
		}
		return exists;
	}
	
	/**
	 * The countFirstNameOcurrences method accepts a type char and uses a for-each loop to iterate
	 * through every element in the list. Returns every name that ends with the input char called
	 * lastChar. The variable 'total' of type int increments by +1 every time a name that meets the 
	 * criteria is found and the total is returned at the end. The total can range from 0 to a 
	 * maximum.
	 * @param lastChar The char parameter that's being used as a search criteria
	 * @return Returns the total int which is a counter for the number of occurrences
	 */
	public int countFirstNameOccurrences(char lastChar ) {
		int total = 0;
		String lastCharString = String.valueOf(lastChar);
		
		for (Name name : list) {
			if (name.getFirstName().endsWith(lastCharString)) {
				total += 1;
			}
		}
		return total;
	}
	
	/**
	 * This iterator returns a list iterator over the elements in the given 
	 * list in a proper sequence.
	 * Specified in the Iterable interface
	 * Allows the removal of elements during iteration
	 */
	public Iterator<Name> iterator(){
		return this.list.listIterator();
	}
	
	/**
	 * The toString method makes it possible to return the register in a string format 
	 * by converting it. This also makes it easily compatible with system.out.println methods.
	 */
		public String toString() {
			return "Register:[list=" + list + "]";
		}
}
