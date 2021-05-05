package JavaBasics;

	class Suresh{  
		String Shirt="whiteshirt";  
		}  
		class Shop extends Suresh{  
		String shirt="yellowshirt";  
		void printShirt(){  
		System.out.println(shirt);
		System.out.println(super.Shirt); 
		}  
		}  
		public class SuperKeyword {  
		public static void main(String args[]){  
		Shop d=new Shop();  
		d.printShirt();  
		}}  

