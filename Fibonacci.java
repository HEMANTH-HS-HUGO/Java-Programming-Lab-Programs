/* The Fibonacci sequence is defined by the following rule. The first two
values in the sequence are 1 and 1. Every subsequent value is the sum of the
two values preceding it. Write a java program that uses both recursive and
non-recursive functions.*/

import java.util.Scanner;
class Fibonacci{
public static void main(String args[])
{
System.out.println("Enter a number");

Scanner sc = new Scanner(System.in);
double a=sc.nextInt();
int f=0,g=1;
for(int i=0;i<a;i++)
{
System.out.print(f+" ");
f=f+g;
g=f-g;
}
}
}