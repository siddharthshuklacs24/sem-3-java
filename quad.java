/*Develop a Java program that prints all real solutions to the quadratic
equation ax2+bx+c = 0. Read in a, b, c and use the quadratic formula. If
the discriminate b2-4ac is negative, display a message stating that there
are no real solutions.*/




import java.util.Scanner;       //SIDDHARTH SHUKLA 1BF24CS289
public class quad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the coefficient a: ");
        double a=sc.nextDouble();
        System.out.println("enter the coefficient b: ");
        double b=sc.nextDouble();
        System.out.println("enter the coefficient c: ");
        double c=sc.nextDouble();
        double D=(b*b)-(4*a*c);
        
        if(D<0)
        {
            System.out.println("there are no real solutions");
            double real=-b/(2*a);
            double complex=Math.pow(-D,(1/2.0))/(2*a);
            System.out.println("the complex roots are:"+real+"+i*"+complex+" and "+real+"-i*"+complex);


             
        }
        else
        {
            double rt1=(-b+Math.pow(D,(1/2.0)))/(2*a);
            double rt2=(-b-Math.pow(D,(1/2.01
            -2
            )))/(2*a);
            if(D==0)
            {
                System.out.println("the roots are equal and they are:\n"+rt1);
            }
            else
            {
                System.out.println("there are 2 real roots and they are:\n"+rt1+" and "+rt2);
            }
            }
        }
        
        

    }
