package JavaBasics;

abstract class File{  
	abstract void Paper();  
	}  
	class Document extends File{  
	void Paper(){
		System.out.println("contains Data");
		}  
	}  
	class Contains extends Document{  
	void Paper(){
		System.out.println("large data");
		}  
	}  
	public class AbstractClass {
	public static void main(String args[]){
		File f1=new Contains();
		f1.Paper();

	}
	}



