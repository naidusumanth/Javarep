package JavaBasics;

 class Everesh {
	 public void Rajeev()
	 {
		 System.out.println("rajeev is good");
	 }
 }
 class South extends Everesh{
		public void SSh()
		{
			 System.out.println("South is direct");
		}
		}
 class North extends Everesh{
	 public void fun()
	 {
		 System.out.println("fun is good");

	 }
 }
 public class Hierarical{
	 public static void main(String []args)
	 {
		 North n1=new North();
		 n1.Rajeev();
		 n1.fun();
	 }
 }
   
