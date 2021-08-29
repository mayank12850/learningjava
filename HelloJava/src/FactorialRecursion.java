
public class FactorialRecursion {
	
	// Program to calculate factorial
	// value of x should be [0,20]
	public long fact(int x)
	{
		if(x==0)
		{
			return 1;
		}
		return x*fact(x-1);
	}
	public  static void main(String[] args) {
		FactorialRecursion fr=new FactorialRecursion();
		
		for(int i=0;i<=20;i++)
		{
			System.out.println("factorial of "+i+ " is " + fr.fact(i));;
	
		}
	}

}
