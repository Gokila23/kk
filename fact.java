package Logic;

import java.util.Scanner;

public class fact {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int temp=1;
	for(int i=1;i<=n;i++)
	{
		temp=temp*i;
	}
	System.out.println(temp);
	
}
}
