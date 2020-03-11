import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args)
	{
		ArrayList<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(new Dog());
		animals.add(new Cow());
		animals.add(new Chicken());
		
		for (int i = 0; i < animals.size(); i++)
		{
			System.out.println("This animal says " + animals.get(i).Say());
		}
		
	}
	
}
