package JavaBasics;

class Method {
	 void Fun()
	{
		System.out.println("fun is must be good");
	}
	 void Fun(int i,String S1)
	 {
		 System.out.println("using integer:"+i);
		 System.out.println("using string:"+S1);
	 }
	 void Fun(float t)
	 {
		 System.out.println("using float: "+t);
	 }
	}
	 public class MethodOverloading {
	public static void main(String []args)
	{
	Method m1=new Method();
	m1.Fun();
	m1.Fun(10,"Surya");
	m1.Fun(222);


	}
	}

