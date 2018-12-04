import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
	
	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<Person>();
		ArrayList<String> telephones = new ArrayList<String>();
		ArrayList<String> adresses = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		
		public int theIndex(String name) {
			
			for (int x = 0; x < people.size(); x++) {
				
				if (people.get(i).getName().matches(name)) {
					
					index = x;
					
					break;
				
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
		
		public String deleteData(String name) {
			
			people.remove(theIndex(name));
			telephones.remove(theIndex(name));
			adresses.remove(theIndex(name));
			
		}
		
		public String modifyData() {
			
			int loop = 0;
			
			while (loop != 1) {
				
				int option = sc.nextInt()
				
				switch (option) {
				
					case 1:
						break;
						
					case 2:	
						break;
						
					case 3:	
						break;
						
					case 4:
						break;
						
					case 5:	
						break;
						
					case 6:
						break;
						
					case 7:
						break;
						
					default:
						break;
				
				}
				
			}
			
		}
		
	}
	
}