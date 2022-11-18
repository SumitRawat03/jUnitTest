package jUnitTest;

import java.util.*;

public class jUnitFunctions {
	
void AddNumbers(int a,int b) {
	int res=a+b;
	System.out.println(res);
}
void AddStrings(String x,String y)
{
	String r=x+y;
	System.out.println(r);
}
public static void main(String r[])
{
	try (Scanner sc = new Scanner(System.in)) {
		jUnitFunctions j= new jUnitFunctions();
		int a=sc.nextInt();
		int b=sc.nextInt();
		j.AddNumbers(a,b);
		String x=sc.next();
		String y=sc.next();
		j.AddStrings(x,y);
	}
}
}