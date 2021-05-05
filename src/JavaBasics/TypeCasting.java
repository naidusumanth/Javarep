package JavaBasics;

public class TypeCasting {
	public static void main (String []args)
	{
		//widening
		int i=50;
		System.out.println("integer is:"+i);
		double data=i;
		System.out.println("double is"+data);
		char ch='a';
		int s=ch;
		System.out.println("integer of number is :"+s);
		//narrowing
		double t=4.5;
		int se=(int) t;
		System.out.println(t);
		System.out.println(se);
	}
	

}
