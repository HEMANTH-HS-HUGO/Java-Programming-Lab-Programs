class method_overriding
{
public void eat()
{
System.out.println("Human is eating");
}
}
class child extends method_overriding{
public void eat()
{
System.out.println("Boy is eating");
}
public static void main( String args[]) {
child obj = new child();
obj.eat();
method_overriding obj1 = new method_overriding();
obj1.eat();
}
}
