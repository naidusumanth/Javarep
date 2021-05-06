package JavaBasics;

class Run {
public void Surya()
{
	System.out.println("Surya is nice person");
}

}
class Walk extends Run{
	public void Rajesh()
	{
		System.out.println("rajesh is walking");
	}
}
public class RuntimePolymorphism {
public static void main(String []args)
{
	Run r1=new Walk();
	r1.Surya();
}
}
