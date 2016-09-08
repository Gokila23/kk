package Logic;

import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    int str=s.nextInt();
    int flag=0;
    for(int i=2;i<str/2;i++)
    {
    	if(str%i==0)
    	{
    		System.out.println("not prime");
    		flag=1;
    		break;
    	}
    }
    if(flag==0)
    	{
    		System.out.println("prime");
    	}
    }
}

