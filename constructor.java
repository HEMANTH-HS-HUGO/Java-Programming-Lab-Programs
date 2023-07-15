class constructor
{
private String name;
int a;
int b;
constructor()
{
System.out.println("Default Constructor Called:");
}
constructor(int a, int b)
{
this.a=a;
this.b=b;
System.out.println("Parameterizes Constructor Called with values:"+a+" and" +b);
}
public static void main(String[] args) {
constructor obj = new constructor();
constructor obj1 = new constructor(10,14);
}
}