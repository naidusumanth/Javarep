package JavaBasics;

 class Essociation {
	 private String name;
	  Essociation(String name)
	  {
	    this.name = name;
	  }
	  public String getSchoolName()
	  {
	    return this.name;
	  }
	}
	class Student
	{
	  private String name;
	  Student(String name)
	  {
	    this.name = name;
	  }
	  public String getStudentName()
	  {
	    return this.name;
	  }
	}
	public class Association
	{
	  public static void main (String[] args)
	  {
	    Essociation s1 = new Essociation("surya english medium school");
	    Student j1 = new Student("surya");
	    System.out.println(j1.getStudentName() +
	        " is the Student in " + s1.getSchoolName());
}
	}
