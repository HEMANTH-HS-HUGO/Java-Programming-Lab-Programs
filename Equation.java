/*Write a java program that prints all real solutions to the quadratic
equation ax2 +bx+c=0. Read in a, b, c and use the quadratic formula.
*/
import java.util.Scanner;
class Equation
{
public static void main (String args[])
{
System.out.println("Enter the cofficients a,b,c of quadratic equation");
Scanner sc = new Scanner(System.in);
double a=sc.nextInt();
double b=sc.nextInt();
double c=sc.nextInt();
double z=b*b-4*a*c;
if (z<0)
{
System.out.println("There are no real roots ");
}
else if(z==0)
{
double r1= (-b)/(2*a);
System.out.println("The roots are real and equal "+r1);
}
else
{
double r2= ((-b) + Math.sqrt(z))/(2*a);
double r3= ((-b) - Math.sqrt(z))/(2*a);
System.out.println("The roots are real and distinct solutions "+r2+" and "+r3);
}
}
}