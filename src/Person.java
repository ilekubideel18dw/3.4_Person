public class Person {
	
	private String name;
	private int age;
	private int weight;
	private String dni;
	
	public Person (String name, String dni){
		
		this.name = name;
		this.dni = dni;
		
	}
	
	public Person (String name, int age, int weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	public Person (String name, int age, int weight, String dni) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dni = dni;
		
	}
	
	public String getName() {
		
		return name;
		
    }

	public void setName(String name) {
		
		this.name = name;
		
	}

	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		
		if (age > 0 && age < 100) {
		
			this.age = age;
			
		}
		
	}

	public int getWeight() {
		
		return weight;
		
	}

	public void setWeight(int weight) {
		
		if (weight > 0 && weight < 200) {
		
			this.weight = weight;
		
		}	
			
	}

	public String getDNI() {
		
		return dni;
		
	}

	public void setDNI(String dni) {
		
		this.dni = dni;
		
	}
	
	/**
	 * 
	 * 
	 */
	
	public String idealWeight() {
		
		if (weight > 50 && weight < 90) {
			
			return "Ideal weight!";
			
		}
		
		else {
			
			return "Not ideal weight!";
			
		}
		
	}
	
	/**
	 * 
	 * 
	 */
	
	public String toString() {
		
		return "Name: " + name + ", Age: " + age + ", Weight: " + weight + ", DNI: " + dni;
		
	}
	
	/**
	 * 
	 * 
	 */
	
	public String isAdult() {
		
		if (age > 17) {
			
			return "Adult!";
			
		}
		
		else {
			
			return "Not adult!";
			
		}
		
	}
	
}