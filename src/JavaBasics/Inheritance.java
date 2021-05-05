package JavaBasics;

 class Rajeev {
	public void display() {
	      System.out.println("Inside display");
	   }
	}
	class Rectangle extends Rajeev {
    public void Surya()
    {
    	System.out.println("surya is good");
    }
}
public class Inheritance{
	public static void main(String []args)
	{
		Rectangle sur1=new Rectangle();
		sur1.display();
		sur1.Surya();
	}
}
