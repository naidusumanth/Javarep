package JavaBasics;

abstract class Surya{
	abstract void Train();
}
public class AbstractMethod extends Surya {
	void Train()
	{
		System.out.println("Traing is going safely");
	}

public static void main(String []args)
{
	Surya s1=new AbstractMethod();
	s1.Train();
}
}


