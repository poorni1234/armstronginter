import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	  public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int sum,digit,arm;
	    for(int j=n;j<m;j++)
	   {
	   	 arm=j;
	  	 sum=0;
	     while(arm>0)
	   {
	   	 digit=arm%10;
	   	 sum=sum+digit*digit*digit;
	   	 arm=arm/10;
	   }
	     if(sum==j)
	     System.out.print(j+" ");
	   }
	}
}
