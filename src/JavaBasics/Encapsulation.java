package JavaBasics;

class Data {
	private String name;
	   private String rollno;
	   private int age;

	   public int getAge() {
	      return age;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getrollno() {
	      return rollno;
	   }

	   public void setAge( int newAge) {
	      age = newAge;
	   }

	   public void setName(String newName) {
	      name = newName;
	   }

	   public void setrollno( String newrollno) {
	      rollno = newrollno;
	   }
	}

public class Encapsulation {

	   public static void main(String args[]) {
	      Data encap = new Data();
	      encap.setName("sumanth");
	      encap.setAge(20);
	      encap.setrollno("12");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge()+"Rollno : "+encap.getrollno());
	   }
	}

