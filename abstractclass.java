import java.util.Scanner;
abstract class Shape {
int a = 10, b = 2;
Shape(int a, int b){
this.a=a;
this.b=b;
}
abstract void Printarea();
}

class Rectangle extends Shape {
Rectangle(int a, int b) {
super(a, b);
}
void Printarea() {
System.out.println("area of rectangle is " + (a * b));
}
}

class Triangle extends Shape {
Triangle(int a, int b) {
super(a, b);
}
void Printarea(){
System.out.println("area of triangle is " + (0.5 * a * b));
}
}

class Circle extends Shape {
Circle(int a, int b) {
super(a,b);
}
void Printarea() {
System.out.println("area of circle is " + (3.14 * a * a));
}
}

class abstractclass {
public static void main(String[] args){
int width, height;
Scanner sc = new Scanner(System.in);

System.out.println("height: ");
height = sc.nextInt();
System.out.println("width: ");
width = sc.nextInt();
Shape shape = new Circle(width, height);
shape.Printarea();

shape=new Rectangle(width, height);
shape.Printarea();

shape=new Triangle(width, height);
shape.Printarea();
}
}

