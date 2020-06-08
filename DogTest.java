package PetBag;

public class DogTest {
	public static void main (String[] args) {
		System.out.println("######Dog Class Test######");
		Dog assignDog =new Dog("SaintBernard","Cujo",14);//the set parameters
		
		System.out.println("**Constructer Test**");
		System.out.println(assignDog.getpetType());
		System.out.println(assignDog.getpetName());
		System.out.println(assignDog.getpetAge());
		System.out.println(assignDog.getdogSpace());//Parameters not set so default values shown 
		System.out.println(assignDog.getcatSpace());
		System.out.println(assignDog.getdaysStay());
		System.out.println(assignDog.getamountDue());
		System.out.println(assignDog.getdogSpaceNbr());
		System.out.println(assignDog.getdogWeight());
		System.out.println(assignDog.getgrooming());
		
		//Test Mutators
		assignDog.setpetType("Shiba Inu");
		assignDog.setpetName("DOGE");
		assignDog.setpetAge(7);
		assignDog.setdogSpace(13);
		assignDog.setcatSpace(9);
		assignDog.setdaysStay(4);
		assignDog.setamountDue(503.44);
		assignDog.setdogSpaceNbr(11);
		assignDog.setdogWeight(18);
		assignDog.setgrooming(true);
		//check new values
		System.out.println("**Accessors & Mutators Test**");
		System.out.println(assignDog.getpetType());
		System.out.println(assignDog.getpetName());
		System.out.println(assignDog.getpetAge());
		System.out.println(assignDog.getdogSpace());//Parameters not set so default values shown 
		System.out.println(assignDog.getcatSpace());
		System.out.println(assignDog.getdaysStay());
		System.out.println(assignDog.getamountDue());
		System.out.println(assignDog.getdogSpaceNbr());
		System.out.println(assignDog.getdogWeight());
		System.out.println(assignDog.getgrooming());
	}
}	