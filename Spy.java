import java.util.Scanner;
class Pallindrome
{
	public static void main(String[] args)
	{
			int num,rem,n=0;
			System.out.println("Enter Number:");
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			while(num!=0)
			{	
				rem = num%10;
				num = num/10;
				n=n*10+rem;
			}
			System.out.println(" "+num);
			System.out.println(" "+n);
			if(num==n)
			{
				System.out.println("Number is Pallindrome");
			}
			else
			{
				System.out.println("Number is not Pallindrome");
			}
			
	}
}