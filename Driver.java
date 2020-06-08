package driver;
import java.util.Scanner;//capture user input

import RescueAnimal.RescueAnimal;

import java.util.ArrayList;//add arrays
import java.util.Date;//date and time constructors
import java.text.SimpleDateFormat;//date format
import java.text.ParseException;//unexpected parsing error
import Dog.*;
import Monkey.*;

public class Driver {

    public static void main(String[] args) {
    	Scanner scnr =new Scanner(System.in);//collect user input
        ArrayList<RescueAnimal>AnimalData=new ArrayList<RescueAnimal>();//AnimalData  holds input data
    	
    	// Instance variables
    	//Options for selecting Methods
    	String Options="Select an option\n"
    				  +"R - Request a Rescue Animal\n"
    				  +"U - Update Information\n"
    				  +"A - Animal Phase\n"
    				  +"I - Intake Animal\n"
    				  +"T - Transfer Animal\n"
    				  +"V - View In-Service Animal\n"
    				  +"P - Proccess/Receive Reports\n"
    				  +"Q - Quit";
    
        //Get user Selection
    	char userSelection;
    	userSelection='X';
    	//print Options
    	System.out.println(Options);
    	//Convert userSelection to standard input
    	userSelection=scnr.nextLine().toUpperCase().charAt(0);
    	//Only Accept Set Options
  
    	if (userSelection !='R' &&
    			userSelection !='U' && userSelection !='A' && userSelection !='I' &&
    			userSelection !='T' && userSelection !='V' && userSelection !='P' && userSelection!='Q') {
    		System.out.println("Invalid Selection");
    	}
    		while (userSelection =='Q') {
        		break;
        		}

    	// R Method to process request for a rescue animal
    		if(userSelection =='R') {
        		System.out.println("Request Form");
        	} 


        //U  Method(s) to update information on existing animals
    		if(userSelection =='U') {
        		System.out.println("Update Information");
        	} 


        // A Method to display matrix of animals based on location and status/training phase
    		if(userSelection =='A') {
        		System.out.println("Keanu Reeves is bµ5y rDPsoZNUxtpzdlBO6syj9TlabSPLFTuj0tpoi9lsS5U");
    		}

        //I Method to add animals
    		if(userSelection =='I') {
        		String AnimalOptions="Select an animal\n"//Accepted animals
        							+"1 - Dog Intake\n"
        							+"2- Monkey Intake";
        		System.out.println(AnimalOptions);
        	int intakeInteger=Integer.parseInt(scnr.nextLine());//Change string to integer
    		//Only accept set inputs
    		while (intakeInteger !=1 && intakeInteger !=2) {//invalid selection
    			System.out.println("Invalid Input");
    			System.out.println(AnimalOptions);
    			intakeInteger=Integer.parseInt(scnr.nextLine());//fixes infinite printing loop
    		
    		}
    		if(intakeInteger==1) {
    			System.out.println("Dog Intake.");
    			Dog IntakeAnimal =new Dog();
    			IntakeAnimal.settype("Dog");
    			AnimalData.add(IntakeAnimal);//add to array
    			intakeAnimal(IntakeAnimal);//New Dog
    		}
    		else {
    			intakeInteger=2;
    			System.out.println("Moneky Intake");
    			Monkey IntakeAnimal= new Monkey();
    			IntakeAnimal.settype("Monkey");
    			AnimalData.add(IntakeAnimal);//add to array	
    			intakeAnimal(IntakeAnimal);//New Monkey
    		}    	
        } 

        //T Method to out process animals for the farm or in-service placement
    if(userSelection =='T') {
		System.out.println("Process Animals");
    }


        //V  Method to display in-service animals

    if(userSelection =='V') {
		System.out.println("Animals in service: ");
    }

        //P Process reports from in-service agencies reporting death/retirement
   
    if(userSelection =='P') {
		System.out.println("Process Report");
    }
    
    else {
		while (userSelection =='Q') 
			scnr.close();
			}
    }
    	//New Dog / New Monkey  
    public static void intakeAnimal (RescueAnimal animal) { //call to RescueAnimal.java
    	Scanner readInput= new Scanner (System.in);//new inputs
    	String intakeOptions="Please select an option.\n"//Dog / Monkey Options
    						+"T - Add Type\n"
    						+"G - Add Gender\n"
    						+"A - Add Age\n"
    						+"W - Add Weight\n"
    						+"D - Acquisition Date\n"    						
    						+"S - Acquisition Source\n"
    						+"E - Exit\n";
    	char selectOption;//get user input
    	selectOption='X';
		System.out.println(intakeOptions);
    	selectOption=readInput.nextLine().toUpperCase().charAt(0);
    	
    	
    	
    	String[] Dogs= {"American pit bull terrier","Beagle","Belgian malinois","Border collie","Bloodhound","Coonhound","English springer spaniel",
    						 "German shepherd","German shorthaired pointer","Golden retriever","Labrador retriever","Nova Scotia duck tolling retriever",
    						 "Rough collie","Smooth Collie"};//list of eligible dogs
    	String[] Monkeys= {"Capuchin","Guenon","Macaque","Marmoset","Squirrel moneky","Tamarin"};//List of eligible Monkeys
    	animal.settrainingStatus("intake");//from RescueAnimal 
    	
    	
    	
    	//Run Loop with Valid Inputs
    		if (selectOption !='T' && 
    				selectOption !='G' && selectOption !='A' &&
    				selectOption !='W' && selectOption !='D' && selectOption !='S' &&
    				selectOption !='E') {
    			System.out.println("Invalid Selection");
    			}
    		while (selectOption=='E') {//  terminates session
    			break;
    	}
    		if(selectOption=='T') {
    			String animalType=animal.gettype();
    			String breedInput="";
    			boolean ValidBreed=false;
    			if(animalType=="Dog") {//checks eligible dogs list
    				Dog((Dog)animal,Dogs,readInput,breedInput,ValidBreed);
    				}
    			else {//checks eligible monkeys list
    				Monkey((Monkey)animal,Monkeys,readInput,breedInput,ValidBreed);
    			}
    		}
    		if(selectOption=='G') {
    			String genderOptions="Please eneter animal gender\n"
    							+"Male\n"
    							+"Female";
    			System.out.println(genderOptions);
    			String Gender=readInput.nextLine().toLowerCase();//convert to accept genderOptions input
    			while(!Gender.equals("male")&& !Gender.equals("female")) {
    				System.out.println("Invalid Selection");
    				System.out.println(genderOptions);
    			}
    			animal.setgender(Gender);
    			System.out.println("Gender has been set to "+animal.getgender());
    		}
    
    	
    
    	
    		if(selectOption == 'A') {
    			System.out.println("Enter animal's age.");
    			int Age = readInput.nextInt();
    			readInput.nextLine();  
    			animal.setage(Age);
    			System.out.println("Age has been set to " + animal.getage());
    		}
    
    		if(selectOption == 'W') {
    			System.out.println("Enter animal's weight.");
    			float Weight = readInput.nextFloat();//decimal for exact weight 
    			readInput.nextLine();  
                               
    			animal.setweight(Weight);
    			System.out.println("Weight has been set to " + animal.getweight());
    		}
    
    		if(selectOption == 'D') {
    			System.out.print("Enter acquisition date (yyyy/MM/dd)");
        
        // Capture the user's date input
        
    			Date animalacquisitionDate = null;//Undefined 
    			try {
    				animalacquisitionDate  = new SimpleDateFormat("yyyyMMdd").parse(readInput.nextLine().replaceAll("/", ""));
    			} catch (ParseException Adate) {
    				Adate.printStackTrace();
    			}
        
    			animal.setacquisitionDate(animalacquisitionDate);//Defined
    			System.out.println("Date has been set to " + animal.getacquisitionDate());
    		}
    		
    		if(selectOption == 'S') {
    			System.out.println("Enter acquisition source.");
    			String animalAcquisitionSource = readInput.nextLine();
    			animal.setacquisitionSource(animalAcquisitionSource);
    			System.out.println("Acquisition source has been set to " + animal.getacquisitionSource());
    		}
    		
    } 	     
// Method to validate is String input is a valid entry in a String array
public static boolean isValidString(String[] stringArray, String inputString) {
    boolean isValid = false;//Initiate isValid
    for(int i = 0; i < stringArray.length; ++i) {//loop through array
        if(inputString.toLowerCase().equals(stringArray[i].toLowerCase())) {//if in array
            isValid = true;
        }
    }
    return isValid;
}

// Method to output valid entries from String array
public static void validEntryChecker(String[] stringArray) {
    System.out.println("Valid entries are:");
    for(int i = 0; i < stringArray.length; ++i) {//loop through array
        System.out.println(stringArray[i]);
    }
    return;//clear stack
}

// Method to set Dog breed
public static void Dog(Dog dog, String[] stringArray, Scanner readInput, String breedInput, boolean ValidBreed) {
    System.out.println("Please enter a breed.");
    validEntryChecker(stringArray);//call to output method
    breedInput = readInput.nextLine();
    ValidBreed = isValidString(stringArray, breedInput);//call to validate method 
    while(!ValidBreed) {
        System.out.println("Invalid entry.");
        System.out.println("Please enter a breed.");
        validEntryChecker(stringArray);//retry if invalid
        breedInput = readInput.nextLine();
        ValidBreed = isValidString(stringArray, breedInput);
    }
    dog.setBreed(breedInput);
    System.out.println("Breed has been set to " + dog.getBreed());//print if valid
}

// Method to set Monkey Species
public static void Monkey(Monkey monkey, String[] stringArray, Scanner readInput, String breedInput, boolean isValidBreed) {
    System.out.println("Please enter a species.");
    validEntryChecker(stringArray);//call to output method
    breedInput = readInput.nextLine();
    isValidBreed = isValidString(stringArray, breedInput);//call to validate method
    while(!isValidBreed) {
        System.out.println("Invalid entry.");
        System.out.println("Please enter a species.");
        validEntryChecker(stringArray);//retry if invalid
        breedInput = readInput.nextLine();
        isValidBreed = isValidString(stringArray, breedInput);
    }
    monkey.setspecies(breedInput);
    System.out.println("Species has been set to " + monkey.getspecies());//print if valid
}
}

	



	

    



