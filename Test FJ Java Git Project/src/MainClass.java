import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args)
	{
		ArrayList<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(new Dog());
		animals.add(new Cow());
	}
	
}
