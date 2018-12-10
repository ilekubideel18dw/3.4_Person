import java.util.ArrayList;

public class Agenda {
		
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	/**
	 * @ An index to link a person with a phone and an address 
	 * @ with the position.
	 */
	
	int index = 0;
		
	private int Index(String data) {
			
		for (int x = 0; x < contacts.size(); x++) {
				
			if (contacts.get(x).getPerson().getName().matches(data)) {
					
				index = x;
				
			}
			
		}

		return index;
		
	}
	
	public Contact takeContact(int index) {
		
		 
		return contacts.get(index);

	}
	
	public int find(String name) {
		
		return Index(name);
			
	}
	
	/**
	 * @ A method to view the information of one contact.
	 */
		
	public String viewData(String data) {
			
		return contacts.get(Index(data)).getPerson().toString() + contacts.get(Index(data)).toString2();
		
	}
	
	/**
	 * @ A method to add new contact.
	 */
		
	public void addData(Contact data) {
			
		contacts.add(data);
			
	}
	
	/**
	 * @ A method to delete a contact.
	 */
		
	public void deleteData(String data) {
			
		contacts.remove(Index(data));
			
	}
	
	/**
	 * @ A method to modify the information about a contact.
	 */
		
	public void modifyData(String data, String option, String modification) {
			
		switch (option) {
				
			case "name":
				contacts.get(Index(data)).getPerson().setName(modification);
				break;
						
			case "age":	
				contacts.get(Index(data)).getPerson().setAge(Integer.parseInt(modification));
				break;
						
			case "weight":	
				contacts.get(Index(data)).getPerson().setWeight(Integer.parseInt(modification));
				break;
						
			case "dni":
				contacts.get(Index(data)).getPerson().setDNI(modification);
				break;
						
			case "phone":
				contacts.get(Index(data)).setPhone(Integer.parseInt(modification));
				break;
						
			case "adress":
				contacts.get(Index(data)).setAddress(modification);
				break;
				
		}
		
	}
	
}