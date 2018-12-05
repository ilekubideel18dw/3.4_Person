import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
		
	ArrayList<Person> people = new ArrayList<Person>();
	ArrayList<String> telephones = new ArrayList<String>();
	ArrayList<String> adresses = new ArrayList<String>();
		
	Scanner sc = new Scanner(System.in);
		
	int index = 0;
		
	private int theIndex(String name) {
			
		for (int x = 0; x < people.size(); x++) {
				
			if (people.get(x).getName().matches(name)) {
					
				index = x;
				
			}
			
		}

		return index;
		
	}
		
	public void addData(Person human, String telephone, String adress) {
			
		people.add(human);
		telephones.add(telephone);
		adresses.add(adress);
			
	}
		
	public String viewData(String name) {
			
		return people.get(theIndex(name)).toString() + " Phone number: " + telephones.get(theIndex(name)) + " Adress: " + adresses.get(theIndex(name));
		
	}
		
	public void deleteData(String name) {
			
		people.remove(theIndex(name));
		telephones.remove(theIndex(name));
		adresses.remove(theIndex(name));
			
	}
		
	public void modifyData(String name, String option, String modification) {
			
		switch (option) {
				
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
						
			case "telephone":	
				break;
						
			case "adress":
				break;

				
			}
			
		}
		
	}
	
}