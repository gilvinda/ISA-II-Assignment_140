package gilvinda;

public class main_140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog_140 dog1 = new dog_140("Moti", "German Sherperd");
		dog_140 dog2 = new dog_140("Sheru", "Pitbull");
		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");
		System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
		dog1.setBreed("Local Breed"); dog2.setName("Liz");
		System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
		System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
	}

}
