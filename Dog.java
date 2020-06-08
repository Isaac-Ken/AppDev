package PetBag;

public class Dog {
	//initialize variables
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpace;
	private int catSpace;
	private int daysStay;
	private double amountDue;
	public int dogSpaceNbr;
	public int dogWeight;
	public boolean grooming;//boolean"true/false" for grooming
	
//Constructor with set parameters 
	public Dog(String petType, String petName,int dogSpace) {
//set default values
//keyword "this" is used to pass in the constructor call 
		this.petType=petType;
		this.petName=petName;
		petAge=-1;
		this.dogSpace=dogSpace;//Initialized for passed in value
		catSpace=-1;//Not initialized for dog class
		daysStay=-1;
		amountDue=-1.0;
		dogSpaceNbr=-1;
		dogWeight=-1;
		grooming=false;
	}
//Mutators "set" method
	public void setpetType(String petType) {
		this.petType=petType;
		return;
	}
	public void setpetName(String petName) {
		this.petName=petName;
		return;
	}
	public void setpetAge(int petAge) {
		this.petAge=petAge;
			return;
	}
	public void setdogSpace(int dogSpace) {
		this.dogSpace=dogSpace;
		return;
	}
	public void setcatSpace(int catSpace) {
		this.catSpace=catSpace;
		return;
	}
	public void setdaysStay(int daysStay) {
		this.daysStay=daysStay;
		return;
	}
	public void setamountDue(double amountDue) {
		this.amountDue=amountDue;
		return;
	}
	
	public void setdogSpaceNbr(int dogSpaceNbr) {
		this.dogSpaceNbr=dogSpaceNbr;
		return;
	}	
	public void setdogWeight(int dogWeight) {
		this.dogWeight=dogWeight;
		return;
	}	
	public void setgrooming(boolean groooming) {
		this.grooming=groooming;
		return;
	}
//Accessors "get" method 
	public String getpetType() {
		return petType;
	}
	public String getpetName() {
		return petName;
	}
	public int getpetAge() {
		return petAge;
	}
	public int getdogSpace() {
		return dogSpace;
	}
	public int getcatSpace() {
		return catSpace;
	}
	public int getdaysStay() {
		return daysStay;
	}
	public double getamountDue() {
		return amountDue;
	}
	public int getdogSpaceNbr() {
		return dogSpaceNbr;
	}
	public int getdogWeight() {
		return dogWeight;
	}
	public boolean getgrooming() {
		return grooming;
	}
}  
