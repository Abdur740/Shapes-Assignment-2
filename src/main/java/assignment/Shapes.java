package ASSIGNMENT2;

import java.util.Scanner;
import java.util.logging.Logger;

abstract class DIMENSIONS
{
    abstract  void area();
    abstract  void perimeter();
    double result1;

    double result2;
    Scanner sc=new Scanner(System.in);
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
}

class Triangle extends DIMENSIONS
{
    int h;
    int b;

    int a;
    int c;

    int calc;
    Triangle()
    {

        LOGGER.info("Enter height:");
        h=sc.nextInt();
        LOGGER.info("Enter base:");
        b=sc.nextInt();
        LOGGER.info("Enter side1 length:");
        a=sc.nextInt();
        LOGGER.info("Enter side2 length:");
        c=sc.nextInt();
    }
    public void area()
    {
        calc=h*b;
        result2=((calc)/2.0);
        LOGGER.info("Area of triangle :{}"+result2);
    }
    public void perimeter() {

        result1=(a+b+c);
        LOGGER.info("Perimeter of triangle :{}"+(int)result1);
    }
}
class Rectangle extends DIMENSIONS
{
    int l;
    int w;
Rectangle()
    {
        LOGGER.info("Enter length:");
        l=sc.nextInt();
        LOGGER.info("Enter width:");
        w=sc.nextInt();
    }

    public void area() {
        result2=(l*w);
        LOGGER.info("Area of the rectangle :{}"+(int)result2);

    }


    public void perimeter() {
        result1=(2*(l*w));
        LOGGER.info("Perimeter of the rectangle :{}"+(int)result1);
    }
}
class Circle extends DIMENSIONS
{
    int r;
    Circle()
    {
        LOGGER.info("Enter radius of the circle:");
        r=sc.nextInt();
    }

    public void area()
    {
        result2=((3.1415)*(r*r));
        LOGGER.info("Area of the circle:{}"+result2);
    }
    public void perimeter() {
        result1=((2*3.1415)*r);
        LOGGER.info("circumference of the circle:{}"+result1);
    }
}
public class Shapes {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        int option;
        Scanner sc=new Scanner(System.in);
        do{
        LOGGER.info("Select any one of the shapes\n1. Triangle\n2. Rectangle\n3. Circle");   
        option = sc.nextInt();
        switch(option){
            case 1:
            LOGGER.info("Enter dimensions for Triangle");
            Triangle t1=new Triangle();
            t1.perimeter();
            t1.area();
            break;
            case 2:
            LOGGER.info("Enter dimensions for  Rectangle");
            Rectangle r1=new Rectangle();
            r1.perimeter();
            r1.area();
            break;
            case 3:
            LOGGER.info("Enter dimensions for  circle");
            Circle c1=new Circle();
            c1.perimeter();
            c1.area();
            break;
            case 4:
            LOGGER.info("Exit");
            break;
            default:
            LOGGER.info("Please enter a valid dimensions.");
            break;
        }
        }while(option!=4);
    }
}
