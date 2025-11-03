 import java.util.*;
 abstract class Shape{
    int i,j;
    Shape(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    abstract void printArea();

}
class Rectangle extends Shape {
    Rectangle(int length,int breadth)
    {
        super(length,breadth);
    }
    void printArea()
    {
        System.out.println("the area of rectangle is:"+(i*j)); 
    }
}
class Triangle extends Shape {
    Triangle(int base,int height)
    {
        super(base,height);
    }
    void printArea() {
    System.out.println("the area of triangle is:"+((1/2.0)*i*j));  
    }
}
class Circle extends Shape {
    Circle(int radius)
    {
        super(radius,0);
    }
    void printArea() {
        System.out.println("the area of circle is:"+(3.14*i*i));
    }
   
}
public class abstractdemo {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      //inputting length and breadth of rectangle
      System.out.println("enter length and breadth of rectangle:");  
      int l=sc.nextInt();
      int b=sc.nextInt();
      Rectangle rect=new Rectangle(l,b);
      
      //inputting base and height of triangle
      System.out.println("enter base and height of triangle:");  
      int base=sc.nextInt();
      int height=sc.nextInt();
      Triangle tri=new Triangle(base,height);

      //inputting radius of circle
      System.out.println("enter radius of circle:");  
      int radius=sc.nextInt();
      Circle circ=new Circle(radius);

      //calling classes for calculating areas
      System.out.println("---------------Areas-------------");
      rect.printArea();
      tri.printArea();
      circ.printArea();
    }
}

