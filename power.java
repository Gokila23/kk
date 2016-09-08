package Logic;

import java.util.Scanner;

public class power {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double n=s.nextInt();
	double i=s.nextDouble();
	
	double ss=Math.pow(n, i);
	System.out.println(ss);
	
}
}
