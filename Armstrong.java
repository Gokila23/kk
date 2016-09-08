package Logic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int temp=n;
	int rev=0;
	int rem=0;
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		rev=rev+(rem*rem*rem);
		
	}
	if(rev==temp)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("not Armstrong");
	}
}
}
