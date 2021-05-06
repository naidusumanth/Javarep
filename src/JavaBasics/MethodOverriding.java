package JavaBasics;

class Over {
public void Fun()
{
	System.out.println("Fun is having life");
	
}
}
class Good extends Over{
	public void Fun()
	{
		System.out.println("good is better life");

	}
}
public class MethodOverriding{
	public static void main(String []args)
	{
		Good g1=new Good();
		g1.Fun();
		g1.Fun();
	}
}
