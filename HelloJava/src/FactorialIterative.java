
public class FactorialIterative {
	
	// Program to calculate factorial
	// value of x should be [0,20]
	public long fact(int x)
	{
		long result=1l;
		for(int i=1;i<=x;i++)
			result=result*i;
		return result;
	}
	public  static void main(String[] args) {
		FactorialIterative fr=new FactorialIterative();
		
		for(int i=0;i<=20;i++)
		{
			System.out.println("factorial of "+i+ " is " + fr.fact(i));;
	
		}
	}

}
