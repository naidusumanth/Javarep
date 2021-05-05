package JavaBasics;

 class Mallar {
	 public void Suresh()
	 {
		 System.out.println("Mallar is good");
		 
	 }

}
 class Warnt extends Mallar{
	 public void David()
	 {
		 System.out.println("Warnt is false");
	 }
 }
 class Rahul extends Warnt
 {
	 public void Sureh()
	 {
		 System.out.println("Sureh is cool");
	 }
 }
 public class Multilevel {
	 public static void main(String []args)
	 {
		 Rahul r1=new Rahul();
		 r1.Suresh();
		 r1.David();
		 r1.Sureh();
	 }
 }
