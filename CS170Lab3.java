package lab3;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CS170Lab3 
{

	public static void main(String[] args) throws Exception
	{
		ArrayList<Passenger> passengers = new ArrayList<Passenger>();
		Scanner sc = new Scanner(new File("/Users/kanglee/Downloads/titanicNoHeader.csv"));

        while (sc.hasNext())  //returns a boolean value
        {
            String readLine = sc.nextLine();
            String[] elements = readLine.split(",");
            Passenger passenger = new Passenger();
			passenger.setSurvived(Integer.parseInt(elements[0]) == 1);
			passenger.setTicketClass(elements[1]);
			passenger.setName(elements[2]);
			passenger.setSex(elements[3]);
			passenger.setAge(Integer.parseInt(elements[4]));
			passenger.setSiblingsSpouse(Integer.parseInt(elements[5]));
			passenger.setParentsChildren(Integer.parseInt(elements[6]));
			passenger.setFare(elements[7]);
			passengers.add(passenger);

        }
        sc.close();  //closes the scanner  
        
        // Calculate survival rate for males
        int totalMales = 0;
        int maleSurvivors = 0;
        
        for (Passenger passenger : passengers) {
            if (passenger.getSex().equalsIgnoreCase("male")) {
                totalMales++;
                if (passenger.hasSurvived()) {
                    maleSurvivors++;
                }
            }
        }
        
        double maleSurvivalRate = (double) maleSurvivors / totalMales * 100;
        System.out.println("Male Survival Rate: " + maleSurvivalRate + "%");
        
        // Calculate survival rate for females
        int totalFemales = 0;
        int femaleSurvivors = 0;
        
        for (Passenger passenger : passengers) {
            if (passenger.getSex().equalsIgnoreCase("female")) {
                totalFemales++;
                if (passenger.hasSurvived()) {
                    femaleSurvivors++;
                }
            }
        }
        
        double femaleSurvivalRate = (double) femaleSurvivors / totalFemales * 100;
        System.out.println("Female Survival Rate: " + femaleSurvivalRate + "%");
        
        // Calculate survival rate for 1st class passengers
        int totalFirstClass = 0;
        int firstClassSurvivors = 0;
        
        for (Passenger passenger : passengers) {
        	if (passenger.getTicketClass().equalsIgnoreCase("1")) {
        		totalFirstClass++;
        		if (passenger.hasSurvived()) {
        			firstClassSurvivors++;
        		}
        	}
        }
        
        double firstClassSurvivalRate = (double) firstClassSurvivors / totalFirstClass * 100;
        System.out.println("1st Class Passenger Survival Rate: " + firstClassSurvivalRate + "%");
        
        // Calculate survival rate for 2nd class passengers
        int totalSecondClass = 0;
        int secondClassSurvivors = 0;
        
        for (Passenger passenger : passengers) {
        	if (passenger.getTicketClass().equalsIgnoreCase("2")) {
        		totalSecondClass++;
        		if (passenger.hasSurvived()) {
        			secondClassSurvivors++;
        		}
        	}
        }
        
        double secondClassSurvivalRate = (double) secondClassSurvivors / totalSecondClass * 100;
        System.out.println("2nd Class Passenger Survival Rate: " + secondClassSurvivalRate + "%");
        
        // Calculate survival rate for 3rd class passengers
        int totalThirdClass = 0;
        int thirdClassSurvivors = 0;
        
        for (Passenger passenger : passengers) {
        	if (passenger.getTicketClass().equalsIgnoreCase("3")) {
        		totalThirdClass++;
        		if (passenger.hasSurvived()) {
        			thirdClassSurvivors++;
        		}
        	}
        }
        
        double thirdClassSurvivalRate = (double) thirdClassSurvivors / totalThirdClass * 100;
        System.out.println("3rd Class Passenger Survival Rate: " + thirdClassSurvivalRate + "%");
        
        // Calculate the survival rate for male 1st class passengers
        int totalMaleFirstClass = 0;
        int maleFirstClassSurvivors = 0;
        
        for (Passenger passenger : passengers) {
        	if (passenger.getSex().equalsIgnoreCase("male") && passenger.getTicketClass().equalsIgnoreCase("1")) {
                totalMaleFirstClass++;
                if (passenger.hasSurvived()) {
                    maleFirstClassSurvivors++;
                }
            }
        }
        
        double maleFirstClassSurvivalRate = (double) maleFirstClassSurvivors / totalMaleFirstClass * 100;
        System.out.println("Male 1st Class Passenger Survival Rate: " + maleFirstClassSurvivalRate + "%");
        
        // Calculate the survival rate for female 1st class passengers
        int totalFemaleFirstClass = 0;
        int femaleFirstClassSurvivors = 0;
        
        for (Passenger passenger : passengers) {
        	if (passenger.getSex().equalsIgnoreCase("female") && passenger.getTicketClass().equalsIgnoreCase("1")) {
        		totalFemaleFirstClass++;
        		if (passenger.hasSurvived()) {
        			femaleFirstClassSurvivors++;
        		}
        	}
        }
        
        double femaleFirstClassSurvivalRate = (double) femaleFirstClassSurvivors / totalFemaleFirstClass * 100;
        System.out.println("Female 1st Class Passenger Survival Rate: " + femaleFirstClassSurvivalRate + "%");
        
        // Calculate the survival rate for male 2nd class passengers
        int totalMaleSecondClass = 0;
        int maleSecondClassSurvivors = 0;
        
        for (Passenger passenger : passengers) {
        	if (passenger.getSex().equalsIgnoreCase("male") && passenger.getTicketClass().equalsIgnoreCase("2"))  {
        		totalMaleSecondClass++;
        		if (passenger.hasSurvived()) {
        			maleSecondClassSurvivors++;
        		}
        	}
        }
        
        double maleSecondClassSurvivalRate = (double) maleSecondClassSurvivors / totalMaleSecondClass * 100;
        System.out.println("Male 2nd Class Passenger Survival Rate: " + maleSecondClassSurvivalRate + "%");
        
        // Calculate the survival rate for female 2nd class passengers
        int totalFemaleSecondClass = 0;
        int femaleSecondClassSurvivors = 0;
        
        for (Passenger passenger : passengers) {
        	if (passenger.getSex().equalsIgnoreCase("female") && passenger.getTicketClass().equalsIgnoreCase("2"))  {
        		totalFemaleSecondClass++;
        		if (passenger.hasSurvived()) {
        			femaleSecondClassSurvivors++;
        		}
        	}
        }
        
        double femaleSecondClassSurvivalRate = (double) femaleSecondClassSurvivors / totalFemaleSecondClass * 100;
        System.out.println("Female 2nd Class Passenger Survival Rate: " + femaleSecondClassSurvivalRate + "%");
        
        // Calculate the survival rate for male 3rd class passengers
        int totalMaleThirdClass = 0;
        int maleThirdClassSurvivors = 0;
        
        for (Passenger passenger : passengers) {
        	if (passenger.getSex().equalsIgnoreCase("male") && passenger.getTicketClass().equalsIgnoreCase("3"))  {
        		totalMaleThirdClass++;
        		if (passenger.hasSurvived()) {
        			maleThirdClassSurvivors++;
        		}
        	}
        }
        
        double maleThirdClassSurvivalRate = (double) maleThirdClassSurvivors / totalMaleThirdClass * 100;
        System.out.println("Male 3rd Class Passenger Survival Rate: " + maleThirdClassSurvivalRate + "%");
        
        // Calculate the survival rate for female 3rd class passengers
        int totalFemaleThirdClass = 0;
        int femaleThirdClassSurvivors = 0;
        
        for (Passenger passenger : passengers) {
        	if (passenger.getSex().equalsIgnoreCase("female") && passenger.getTicketClass().equalsIgnoreCase("3"))  {
        		totalFemaleThirdClass++;
        		if (passenger.hasSurvived()) {
        			femaleThirdClassSurvivors++;
        		}
        	}
        }
        
        double femaleThirdClassSurvivalRate = (double) femaleThirdClassSurvivors / totalFemaleThirdClass * 100;
        System.out.println("Female 3rd Class Passenger Survival Rate: " + femaleThirdClassSurvivalRate + "%\n");
        
        
        // HashMap to store the count of passengers for each age
        HashMap<Integer, Integer> ageCounts = new HashMap<>();
        
        // Calculate counts for each age
        for (Passenger passenger : passengers) {
        	int age = passenger.getAge();
        	// Check if there is a passenger of that age in the HashMap
        	if (ageCounts.containsKey(age)) {
        		int count = ageCounts.get(age);
        		ageCounts.put(age, count + 1);
        	}
        	else {
        		ageCounts.put(age, 1);
        	}
        }
        
        // Print out the ages and number of passengers for each age
        for (int age : ageCounts.keySet()) {
        	int count = ageCounts.get(age);
        	System.out.println("Age " + age + ": " + count + " passengers");
        }
        
        // HashSet to store ages that are present on the ship
        HashSet<Integer> agesOnShip = new HashSet<>();
        
        // Collect ages
        for (Passenger passenger : passengers) {
        	int age = passenger.getAge();
        	agesOnShip.add(age);
        }
        
        // Print out the ages present on the ship
        System.out.println("\nAges present on the ship: ");
        for (int age : agesOnShip) {
        	System.out.println(age);
        }
	}
}
			