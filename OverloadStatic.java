/*Write a Program to implement method overloading by using static
method in java.*/

class OverloadStatic
{
public static void display()
{
System.out.println("Static method called.");
}
public static void display(int x)
{
System.out.println("An overloaded static method called.");
}
public static void main(String args[])
{
OverloadStatic.display();
OverloadStatic.display(160);
}
}