import java.util.*;

class Fibonaccirec {
public static void main(String args[]) {
int terms;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of terms in Fibonacci Series");
terms = sc.nextInt();
for(int i = 0; i < terms; i++){
System.out.print(fibonacci(i) + " ");
}
}
public static int fibonacci(int n){
if(n < 2)
	return n;
return fibonacci(n - 1) + fibonacci(n - 2);
}
}