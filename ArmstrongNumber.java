package week1.day2;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int i = 153;
		int z = i;
		int sum = 0;
		
		while(z>0) {
			int rem = z%10;
			sum = sum + (rem*rem*rem);
			z=z/10;
		}
		if(sum==i) {
			System.out.println(i+" is an armstrong number");
		}
		else {
			System.out.println(i+" is not an armstrong number");
		}
	}

}
