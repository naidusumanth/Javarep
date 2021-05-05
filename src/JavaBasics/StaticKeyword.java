package JavaBasics;

public class StaticKeyword {
	static int x = 80;
	 static void rajesh() {
	  System.out.println("Static keyword");
	 }
	 public static void main(String[] args) {
	  StaticKeyword.rajesh();
	  System.out.println(StaticKeyword.x);
	  StaticKeyword S1 = new StaticKeyword();
	  StaticKeyword S2 = new StaticKeyword();
	  System.out.println(S1.x);
	
}
}
