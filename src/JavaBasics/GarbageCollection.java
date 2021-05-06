package JavaBasics;

class Garbage{  
	 public void finalize()
	 {
		 System.out.println(" garbage collected");
		 }
}
public class GarbageCollection {
	 public static void main(String args[]){  
	  Garbage s1=new Garbage();  
	  s1=null;   
	  System.gc();  
	 }  
	}  