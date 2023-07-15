import pack1.*; 
import pack2.*;

public class Pack{
	
public static void main(String args[])
{

pack1 ob = new pack1();
ob.setName("packsetter");
System.out.println(ob.getName());

pack2 ob2 = new pack2(5,7);
ob2.add();
}
}