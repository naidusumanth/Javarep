package JavaBasics;

class H {
	   public void show()
	   {
		System.out.println("H");
	   }
	}

	class w extends H
	{
	   public void show()
	   {
		System.out.println("w");
	   }
	}

	class T extends H
	{
	   public void show()
	   {
		System.out.println("T");
	   }
		
	}

	public class Hybrid{
	   public static void main(String args[]){

		T rr = new T();
		rr.show();
	   }
	}
	

