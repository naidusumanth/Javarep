package JavaBasics;

class Binding {
	public void surya()
	{
		System.out.println("surya is good person");
	}
}
class Dynamic extends Binding{
	public void Surya()
	{
		System.out.println("he has good health");

	}
}
	public class DynamicBinding{
		public static void main(String []args)
		{
			Binding b1=new Dynamic();
			b1.surya();
		}

}

