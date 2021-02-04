import java.util.*;

public class Main {
	//	Write a program that asks the user for 5 numbers and stores them in an array list.
	//	Then, finds the sum, product, largest and smallest of those numbers.
	public static void main(String[] args) {
		ArrayList<Integer> userNumbers = new ArrayList<Integer>(5);
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int product = 1;
		int max = 0;
		int min = 0;
		
		System.out.println("Enter 5 integers:");
		for(int i = 0; i < 5; i++) {
			int number = Integer.parseInt(sc.nextLine());
			userNumbers.add(i, number);
			sum += number;
			product *= number;
			max = Collections.max(userNumbers);
			min = Collections.min(userNumbers);
			}
		System.out.println("sum: " + sum + " product: " + product + " max: " + max + " min: " + min);
		
		// Create a hash map of vehicles. Ask the customer what car (model) they are looking for. 
		//Use the Hash Map to determine if you have that vehicle, and what make it is.
	      
		HashMap<String, String> vehicles = new HashMap<String, String>();
		vehicles.put("Nissan", "Altima");
		vehicles.put("Ford", "Escape");
		vehicles.put("Honda", "Accord");
		vehicles.put("Toyota", "Corolla");
		vehicles.put("Subaru", "Outback");
		vehicles.put("Volkswagen", "Jetta");
		
		System.out.println("What kind of car are you lookng for today?");
		String model = sc.nextLine();
		if(vehicles.containsKey(model)) {
			System.out.printf("Yay! Looks like we have a " + model + " and it is a " + vehicles.get(model));
		} 
		else {
			System.out.println("Sorry, we do not have " + model + " at this time.");
			
		}
			
	}
	
}
