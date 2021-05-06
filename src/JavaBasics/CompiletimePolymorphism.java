package JavaBasics;

class Compiletime {
public void Data(int a, int b)
{
	int s=a+b;
	System.out.println("Data is used in the model:"+s);
}
public void Data(int c,String s1)
{
	System.out.println("data of sub is:"+c+" "+s1);
}
}
public class CompiletimePolymorphism {
public static void main(String []args)
{
	Compiletime c1=new Compiletime();
	c1.Data(12, 44);
	c1.Data(8,"STring");
	
}
}

