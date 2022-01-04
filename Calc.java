package week1.day2;


public class Calc {
	public double sub(double num1, double num2) 
	{
		return (num1 - num2);
	}
	
	public int div(int n1, int n2)
	{
		return (n1 / n2);
	}

public static void main (String[] args)
{
	Calc Cal = new Calc();
	double sub = Cal.sub(100,20);
	int div = Cal.div(50,5);
	System.out.println(sub);
	System.out.println(div);
	
	
}
}