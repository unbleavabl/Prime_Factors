import java.util.Scanner;

class PrimeFactorsDemo
{
	public int check_prime(int num)
	{
		if(num == 2)
		{
			return 1;
		}
		for(int i = 2 ; i < num / 2 ; i++)
		{
			if(num % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public void generate(int num)
	{
		for (int i = 2 ; i < num / 2 ; i++)
		{
			if(check_prime(i) == 1 && num % i == 0)
			{
				System.out.print(i+" ");
			}
		}
	}
}

class PrimeFactors
{
	public static void main(String[] args)
	{
		PrimeFactorsDemo ob = new PrimeFactorsDemo();
		Scanner u_inp = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = u_inp.nextInt();
		ob.generate(n);
		System.out.println("");
	}
}
