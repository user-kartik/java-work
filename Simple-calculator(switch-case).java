//This version of simple calculator is written using switch case in the Java programming, here switch case is used in the operator 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class SimpleCalculator2
{
public static void main(String args[])
{
try
{
BufferedReader br = new BufferedReader(newInputStreamReader(System.in));
System.out.println("Enter first operand");
int a = Integer.parseInt(br.readLine());
System.out.println("Enter second operand");
int b = Integer.parseInt(br.readLine());
System.out.println("Enter the operator");
String op = br.readLine();
double res;
switch(op)
{
case "+": res = a + b;
break;
case "-": res = a - b;
break;
case "*": res = a * b;
break;
case "/": res = a / b;
break;
default: throw new java.lang.Error("operator not recognized");
}
System.out.println("The result of "+a+" "+op+" "+b+" is: "+res);
} //end of try block
catch(IOException e)
{
e.printStackTrace();
}
} //end of main method
} // end of SimpleCalculator class
