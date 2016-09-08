package Logic;

import java.util.Scanner;

public class year {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	if(i%4==0)
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println("not leap");
	}
}
}
