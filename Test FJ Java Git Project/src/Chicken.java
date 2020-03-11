
public class Chicken implements IAnimal, IFlying
{

	private int posY = 0;
	
	@Override
	public void Fly()
	{
		posY += 10;
	}

	@Override
	public int getPosY()
	{
		return posY;
	}

	@Override
	public String Say() 
	{
		return "Ko ko ko";
	}

	@Override
	public int GetSpeed()
	{
		return 2;
	}

}
