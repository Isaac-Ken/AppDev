package Monkey;
import RescueAnimal.RescueAnimal;

public class Monkey extends RescueAnimal {
	//Variables
	public String species;
	public float tailLength;//float for measurable variables 
	public float height;
	public float bodyLength;
	public float torsoSize;
	public float skullSize;
	public float neckSize;
	//Constructor
	public Monkey(){
		
	}
	public String getspecies() {
		return species;
	}
	//Getters
	public float gettailLength(){
		return tailLength;
		}
	public float getheight(){
		return height;
		}
	public float getbodyLength(){
		return bodyLength;
		}
	public float gettorsoSize(){
		return torsoSize;
		}
	public float getskullSize(){
		return skullSize;
		}
	public float getneckSize(){
		return neckSize;
		}
	//Mutators
	public void setspecies(String classspecies) {
		species=classspecies;
		return;
	
	}
	public void settailLength(float classtailLength){
		tailLength=classtailLength;
		return;
	}
	public void setheight(float classheight){
		height=classheight;
		return;
	}
	public void setbodyLength(float classbodyLength){
		bodyLength=classbodyLength;
		return;
	}
	public void settorsoSize(float classtorsoSize){
		torsoSize=classtorsoSize;
		return;
	}
	public void setskullSize(float classskullSize){
		skullSize=classskullSize;
		return;
	}
	public void setneckSize(float classneckSize){//not_to_be_confused_with_sneccSize_or_snackSize
		neckSize=classneckSize;                 //                            ,-   *slither*
		return;								    //             *slither*   ,-'    
	}                                           //                         `=e-< "I miss python"
	
}
