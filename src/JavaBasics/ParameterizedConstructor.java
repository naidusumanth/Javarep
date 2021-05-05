package JavaBasics;

public class ParameterizedConstructor {
	 int Rollnum;  
	    String name;    
	    ParameterizedConstructor(int i,String s){  
	    Rollnum = i;  
	    name = s;  
	    } 
	    void display() {
	    	System.out.println(Rollnum+ " " +name);
	    }
	   
	    public static void main(String args[]){  
	    	ParameterizedConstructor s1 = new ParameterizedConstructor(5,"Kareem");  
	    	ParameterizedConstructor s2 = new ParameterizedConstructor(14,"venkat");  

	    s1.display();  
	    s2.display();  

}
}
