import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class SimpleCalculator
{
public static void main(String args[])
{
try
{
BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
System.out.println("Enter first operand");
int a = Integer.parseInt(br.readLine());
System.out.println("Enter second operand");
int b = Integer.parseInt(br.readLine());
System.out.println("Enter the operator");
String op = br.readLine();
double res;
if(op.equals("+"))
{
res = a + b;
}
else if(op.equals("-"))
{
res = a - b;
}
else if(op.equals("*"))
{
res = a * b;
}
else if(op.equals("/"))
{
res = a / b;
}
else
{
throw new java.lang.Error("Operator not recognized");
}
System.out.println("The result of "+a+" "+op+" "+b+" is:
"+res);
} //end of try block
catch(IOException e)
{
e.printStackTrace();
}
} //end of main method
} // end of SimpleCalculator class