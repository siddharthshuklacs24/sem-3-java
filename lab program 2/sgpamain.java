import java.util.*;
 class student {
    String usn;
    String name;
    double creds[];
    double marks[];
    Scanner sc=new Scanner(System.in);
    //method to accept details
    void accept()
    {
        
        System.out.println("enter usn of student:");
        this.usn=sc.nextLine();
        System.out.println("enter name of student:");
        this.name=sc.nextLine();
    }
    //method to display details
    void display() 
    {
        System.out.println("student's name:"+name);
        System.out.println("student's usn:"+usn);
    }
    void sgpa()
    {
        System.out.println("enter the number of subjects:");
        int num=sc.nextInt();
        creds=new double[num];
        marks=new double[num];
          double grade[]=new double[num];
            double numerator=0;
            double denom=0;
        for(int  i=0;i<num;i++)
        {
            
            System.out.println("enter marks for subject "+(i+1));
            marks[i]=sc.nextDouble();
            System.out.println("enter credits for subject "+(i+1));
            creds[i]=sc.nextDouble();
          
            //now,we need to calculate grade array based of range of marks
            if(marks[i]>=90 && marks[i]<=100)
            {
                grade[i]= 10;
            }
            else if(marks[i]>=80 && marks[i]<90)
            {
                grade[i]=  9;
            }
            else if(marks[i]>=70 && marks[i]<80)
            {
                grade[i]=  8;
            }
            else if(marks[i]>=60 && marks[i]<70)
            {
                grade[i]= 7;
            }

            else if(marks[i]>=50 && marks[i]<60)
            {
                grade[i]=  6;
            }
            else if(marks[i]>=40 && marks[i]<50)
            {
                grade[i]=  5;
            }
            else if(marks[i]>=0 && marks[i]<40)
            {
                grade[i]=  0;
            }
            numerator+=creds[i]*grade[i];
            denom+=creds[i];
            
        }
        double sgpa=(double)(numerator/denom);
        System.out.println("the sgpa of the student is:"+sgpa);
        
    }


}
public class sgpamain {
    public static void main(String[] args) {
        student s1=new student();
        s1.accept();
        s1.display();
        s1.sgpa();
    }

}
