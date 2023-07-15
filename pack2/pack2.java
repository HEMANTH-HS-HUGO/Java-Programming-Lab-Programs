package pack2;
/*interface pack3Interface {
String name = "pack";
public void interfacepack();
}
abstract class packabstract {
String name = "packAbstract";
abstract public void print();
}*/

public class pack2 {
public int first;
public int second;
public pack2(int a, int b)
{
this.first = a;
this.second = b;
}
public int add() {
System.out.println(" I'm add method in pack2");	
return this.first + this.second;

}
}