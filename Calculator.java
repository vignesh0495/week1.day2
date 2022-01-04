package week1.day2;


public class Calculator {
	public int add(int num1, int num2)
	{
		return (num1 + num2);
	}

public static void main (String[] args)
{
	Calculator Calc = new Calculator();
	int add = Calc.add(10,20);
	System.out.println(add);
	
	
}
}
