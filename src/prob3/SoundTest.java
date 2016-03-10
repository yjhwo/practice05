package prob3;

public class SoundTest {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparrow());
		printSound(new Duck());
	}

	public static void printSound(Object obj) {
		String sound = null;
		
		if(obj instanceof Cat){
			sound = ((Cat)obj).sound();
		}else if(obj instanceof Dog){
			sound = ((Dog)obj).sound();
		}else if(obj instanceof Sparrow){
			sound = ((Sparrow)obj).sound();
		}else if(obj instanceof Duck){
			sound = ((Duck)obj).sound();
		}
		System.out.println(sound);
	}

}
