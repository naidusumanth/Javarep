package JavaBasics;

public class Aggregation {
	int Show(int i){  
		  return i*i;  
		 }  
		}  
		  
		class Raju{  
		 Aggregation A;
		 double D=3.14;  
		    
		 double fin(int j){  
		   A=new Aggregation();  
		   int s=A.Show(j);
		   return D*s;  
		 }  
		 public static void main(String []args){  
		   Raju c=new Raju();  
		   double result=c.fin(10);  
		   System.out.println(result);  
		 }  
		}  

