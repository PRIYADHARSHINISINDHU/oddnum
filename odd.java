import java.util.*;
import java.io.*;
class odd
{
public static void main(String[] args)
{
int n,i,a,b;
Scanner s=new Scanner(System.in);
System.out.println("Enter the start range:");
b=s.nextInt();
System.out.print("Enter the end range:");
n=s.nextInt();
System.out.println("The odd numbers are:");
for(i=b;i<=n;i++)
{
a=i%2;
if(a!=0)
{
System.out.println(i);
}
}
}
}
