import java.util.Scanner;
class QuadraticDemo
{
public static void main(String args[])
{
int a,b,c;
double D,r1,r2;
Scanner s = new Scanner(System.in);
System.out.println("Enter a:");
a = s.nextInt();
System.out.println("Enter b:");
b = s.nextInt();
System.out.println("Enter c:");
c = s.nextInt();
D = b * b - 4 * a * c;
if(D > 0)
{
System.out.println("Roots are real and unequal");
r1 = (-b + Math.sqrt(D))/(2 * a);
r2 = (-b - Math.sqrt(D))/(2 * a);
System.out.println("Root1: "+r1+ " Root2: "+r2);
}
else if(D == 0)
{
System.out.println("Roots are real and equal");
r1 = (-b + Math.sqrt(D))/(2 * a);
System.out.println("Root: "+r1);
}
else
{
System.out.println("Roots are imaginary");
}
}
}
