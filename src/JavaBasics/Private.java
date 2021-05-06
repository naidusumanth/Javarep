package JavaBasics;

class Modifier{  
	int i=40;  
	void msg(){
		System.out.println("Hello java");}  
	}  
	  
	public class Private{  
	 public static void main(String args[]){  
	   Modifier m1=new Modifier();  
	   System.out.println(m1.i); 
	   m1.msg();
}
	}