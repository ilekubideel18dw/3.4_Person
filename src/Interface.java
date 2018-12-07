import java.util.Scanner;

public class Interface {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
			
			int option = sc.nextInt();
			
			switch (option) {
			
			case 1:
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue1 = sc.nextInt();
        		if (continue1 < 1) {
        			loop = 1;
        		}
				break;
				
			case 2:
				
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
				
				Person human = new Person(name, age, weight, dni);
				
				Contact contacto = new Contact(human, phone, address);
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue2 = sc.nextInt();
        		if (continue2 < 1) {
        			loop = 1;
        		}
				break;
				
			case 3:
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue3 = sc.nextInt();
        		if (continue3 < 1) {
        			loop = 1;
        		}
				break;
				
			case 4:
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue4 = sc.nextInt();
        		if (continue4 < 1) {
        			loop = 1;
        		}
				break;
			
			}
			
		}
		
	}
	
}