import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
		
	ArrayList<Person> people = new ArrayList<Person>();
	ArrayList<String> phones = new ArrayList<String>();
	ArrayList<String> adresses = new ArrayList<String>();
		
	Scanner sc = new Scanner(System.in);
	
	/**
	 * @ An index to link a person with a phone and an adress 
	 * @ with the position.
	 */
	
	int index = 0;
		
	private int theIndex(String name) {
			
		for (int x = 0; x < people.size(); x++) {
				
			if (people.get(x).getName().matches(name)) {
					
				index = x;
				
			}
			
		}

		return index;
		
	}
	
	/**
	 * @ A method to view the information of one contact.
	 */
		
	public String viewData(String name) {
			
		return people.get(theIndex(name)).toString() + " Phone number: " + phones.get(theIndex(name)) + " Adress: " + adresses.get(theIndex(name));
		
	}
	
	/**
	 * @ A method to add new contact.
	 */
		
	public void addData(Person human, String phone, String adress) {
			
		people.add(human);
		phones.add(phone);
		adresses.add(adress);
			
	}
	
	/**
	 * @ A method to delete a contact.
	 */
		
	public void deleteData(String name) {
			
		people.remove(theIndex(name));
		phones.remove(theIndex(name));
		adresses.remove(theIndex(name));
			
	}
	
	/**
	 * @ A method to modify the information about a contact.
	 */
		
	public void modifyData(String name, String modification) {
			
		switch (sc.next()) {
				
			case "name":
				people.get(theIndex(name)).setName(modification);
				break;
						
			case "age":	
				people.get(theIndex(name)).setAge(Integer.parseInt(modification));
				break;
						
			case "weight":	
				people.get(theIndex(name)).setWeight(Integer.parseInt(modification));
				break;
						
			case "dni":
				people.get(theIndex(name)).setDNI(modification);
				break;
						
			case "phone":
				phones.remove(theIndex(name));
				phones.add(modification);
				break;
						
			case "adress":
				adresses.remove(theIndex(name));
				adresses.add(modification);
				break;
				
		}
		
	}
	
}