package digitalocean.com.java.programming.interview.questions;
/*
 * When you pass an object, the value passed is a copy of the reference,
 *  not the object itself. This means you can change the object’s fields,
 *  but not the reference itself.
 */

class Animal{
	int eyeSize = 15;
}
public class CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		System.out.println("original value befor passing reference : "+animal.eyeSize);

		PassByReference(animal);
		System.out.println("original value changed after passing reference : "+animal.eyeSize);
	}

	private static void PassByReference(Animal animalCopy) {
		// TODO Auto-generated method stub
		animalCopy.eyeSize=56;
		System.out.println("copied vialue : "+animalCopy.eyeSize);

	}

}
