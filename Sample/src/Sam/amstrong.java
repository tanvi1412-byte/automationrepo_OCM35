package Sam;

import java.util.Scanner;

public class amstrong {

	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int temp=num;
		int pow=0;
		while(num>0)
		{
			pow++;
			num=num/10;
		}
		num=temp;
		int sum=0;
		while(num>0)
		{
			int xm=num%10;
			int res=(int) Math.pow(xm,pow);
			sum=sum+res;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println("not armstrong no");
		}
	}
}
