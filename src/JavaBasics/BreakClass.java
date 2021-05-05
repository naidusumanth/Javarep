package JavaBasics;

public class BreakClass {
	public static void main(String []args)
	{
		int data=10;
		System.out.println("data number is"+data);
		for(int i=0;i<=data;i++)
		{
			if(i>10)
			{
				break;
			}
			System.out.print(i);
		}
			}
}
