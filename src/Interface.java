import java.util.Scanner;

public class Interface {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Agenda myContacts = new Agenda();
		
		int loop = 0;
		
		while (loop != 1) {
			
			// Menu.
			System.out.println("Welcome to your agenda!");
			System.out.println("You can view, add, delete & modify contacts.");
			System.out.println("Select an option:");
			System.out.println("1.- View a contact.");
			System.out.println("2.- Add a new contact.");
			System.out.println("3.- Delete a contact.");
			System.out.println("4.- Modify a contact.");
			System.out.println("0.- Exit.");
			
			int option = sc.nextInt();
			
			switch (option) { 
			
			case 0: // Exit.
				
				loop = 1;
				
				break;
			
			case 1: // View data.
				
				String view = sc.next();
				myContacts.viewData(view);
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue1 = sc.nextInt();
        		if (continue1 < 1) {
        			loop = 1;
        		}
				break;
				
			case 2: // Add new data.
				
				System.out.println("Name:");
				String name = sc.next();
				
				System.out.println("Age:");
				int age = sc.nextInt();
				
				System.out.println("Weight:");
				int weight = sc.nextInt();
				
				System.out.println("DNI:");
				String dni = sc.next();
				
				System.out.println("Phone:");
				int phone = sc.nextInt();
				
				System.out.println("Address:");
				String address = sc.next();
				
				Person person = new Person(name, age, weight, dni);
				Contact contact = new Contact(person, phone, address);
				
				myContacts.addData(contact);
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue2 = sc.nextInt();
        		if (continue2 < 1) {
        			loop = 1;
        		}
				break;
				
			case 3: // Delete data.
				
				String delete = sc.next();
				myContacts.deleteData(delete);
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue3 = sc.nextInt();
        		if (continue3 < 1) {
        			loop = 1;
        		}
				break;
				
			case 4: // Modify data.
				
				System.out.println("Enter the name of the contact you want to modify");
				
				

				System.out.println("What do you want to change?");
				System.out.println("Enter an option:");
				System.out.println("1.- Name");
				System.out.println("2.- Age");
				System.out.println("3.- Weight");
				System.out.println("4.- DNI");
				System.out.println("5.- Phone");
				System.out.println("6.- Address");
				
				/*
				int modifyOption = sc.nextInt();
				
				switch (modifyOption) {
				
					case 1:
						
						System.out.println("Enter a new name:");
						modifyData.getPerson().setName(sc.next());
						System.out.println("New name: " + modifyData.getPerson().getName() + ".");
						break;
						
					case 2:
						
						System.out.println("Enter a new age:");
						modifyData.getPerson().setAge(sc.nextInt());
						System.out.println("New age: " + modifyData.getPerson().getAge() + ".");
						break;
						
					case 3:
						
						System.out.println("Enter a new weight:");
						modifyData.getPerson().setWeight(sc.nextInt());
						System.out.println("New weight: " + modifyData.getPerson().getWeight() + ".");
						break;
						
					case 4:
						
						System.out.println("Enter a new DNI:");
						modifyData.getPerson().setDNI(sc.next());
						System.out.println("New DNI: " + modifyData.getPerson().getDNI() + ".");
						break;
						
					case 5:
						
						System.out.println("Enter a new phone:");
						modifyData.setPhone(sc.nextInt());
						System.out.println("New phone: " + modifyData.getPhone() + ".");
						break;
						
					case 6:
						
						System.out.println("Enter a new address:");
						modifyData.setAddress(sc.next());
						System.out.println("New address: " + modifyData.getAddress() + ".");
						break;
				
				}
				*/
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue4 = sc.nextInt();
        		if (continue4 < 1) {
        			loop = 1;
        		}
				break;
			
			default:
				
				System.out.println("You don't enter a valid option, please try again.");
				break;
				
			}
			
		}
		
		System.out.println("Thank you! Bye!");
		
	}
	
}