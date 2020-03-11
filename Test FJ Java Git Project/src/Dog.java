
public class Dog implements IAnimal {

	@Override
	public String Say()
	{
		return "Woof";
	}

	@Override
	public int GetSpeed()
	{
		return 10;
	}

}
