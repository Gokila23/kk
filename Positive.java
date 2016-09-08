package Logic;

import java.util.Scanner;

public class Positive {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	if(i==0)
	{
		System.out.println("Zero");
	}
	else if(i>0)
	{
		System.out.println("Positive");
	}
	else
	{
		System.out.println("negative");
	}
}
}
