import java.util.*;
class Squareroot
{
public static void main(String arg[])
{
int n;
double square=0;
Scanner sc=new Scanner(System.in);
System.out.println("entre nnumbers n:");
n=sc.nextInt();
for(int i=0;i<=n;i++)
{
square=Math.pow(i,2);
if(square==n)
{
System.out.println("true:"+i+" , -"+i);
}
}
}
}