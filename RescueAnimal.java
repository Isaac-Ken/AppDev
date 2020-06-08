package RescueAnimal;


import java.text.SimpleDateFormat;
import java.util.Date;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private Date acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    }

    //  Accessors
    public String getname() {
    	return name;
    }
    public String gettype() {
    	return type;
    }
    public String getgender() {
    	return gender;
    }
    public int getage() {
    	return age;
    }
    public float getweight() {
    	return weight;
    }
    public Date getacquisitionDate() {
    	return acquisitionDate;
    }
    public SimpleDateFormat getstatusDate () {
    	return statusDate;
    }
    public String getacquisitionSource() {
    	return acquisitionSource;
    }
    public Boolean getreserved() {
    	return reserved;
    }
    public String trainingLocation() {
    	return trainingLocation;
    }
    public SimpleDateFormat gettrainingStart() {
    	return trainingStart;
    }
    public SimpleDateFormat trainingEnd() {
    	return trainingEnd;
    }
    public String gettrainingStatus() {
    	return trainingStatus;
    }
    public String getinServiceCountry() {
    	return inServiceCountry;
    }
    public String getinServiceCity() {
    	return inServiceCity;
    }
    public String getinServiceAgency() {
    	return inServiceAgency;
    }
    public String getinServicePOC() {
    	return inServicePOC;
    }
    public String getinServiceEmail() {
    	return inServiceEmail;
    }
    public String getinServicePhone() {
    	return inServicePhone;
    }
    public String getinServicePostalAddress() {
    	return inServicePostalAddress;
    }
    //Mutators 
    public void setname(String animalname) {
    	name=animalname;
    	return;
    }
    public void settype (String animaltype) {
    	type=animaltype;
    	return;
    }
    public void setgender (String animalgender) {//you will not appropriate my lizards gender 
    	gender=animalgender;
    	return;
    }
    public void setage(int animalage) {
    	age=animalage;
    	return;
    }
    public void setweight(float animalweight) {
    	weight=animalweight;
    	return;
    }
    public void setacquisitionDate (Date animalacquisitionDate) {
    	acquisitionDate=animalacquisitionDate;
    	return;
    }
    public void setstatusDate (SimpleDateFormat animalstatusDate) {
    	statusDate=animalstatusDate;
    	return;
    }
    public void setacquisitionSource(String animalacquisitionSource) {
    	acquisitionSource=animalacquisitionSource;
    	return;
    }
    public void setreserved (Boolean animalreserved) {
    	reserved=animalreserved;
    	return;
    }
    public void settrainingLocation(String animaltrainingLocation) {
    	trainingLocation=animaltrainingLocation;
    	return;
    }
    public void settrainingStart (SimpleDateFormat animaltrainingStart) {
    	trainingStart=animaltrainingStart;
    	return;
    }
    public void settrainingEnd (SimpleDateFormat animaltrainingEnd) {
    	trainingEnd=animaltrainingEnd;
    	return;
    }
    public void settrainingStatus(String animaltrainingStatus) {
    	trainingStatus=animaltrainingStatus;
    	return;
    }
    public void setinServiceCountry (String animalinServiceCountry) {
    	inServiceCountry=animalinServiceCountry;
    	return;
    }
    public void setinServiceCity (String animalinServiceCity) {
    	inServiceCity=animalinServiceCity;
    	return;
    }
    public void setinServiceAgency (String animalinServiceAgency) {
    	inServiceAgency=animalinServiceAgency;
    	return;
    }
    public void setinServicePOC(String animalinServicePOC) {
    	inServicePOC=animalinServicePOC;
    	return;
    }
    public void setinServiceEmail(String animalinServiceEmail) {
    	inServiceEmail=animalinServiceEmail;
    	return;
    }
    public void setinServicePhone (String animalinServicePhone) {
    	inServicePhone=animalinServicePhone;
    	return;
    }
    public void setinServicePostalAddress(String animalinServicePostalAddress) {
    	inServicePostalAddress=animalinServicePostalAddress;
    	return;
    }

	
		
	}



