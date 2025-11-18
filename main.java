//coded by 1bf24cs289
import cie.*;
import see.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         internals internal=new internals();
         External ext=new External("1bf24cs289","sidd",3);
         int cie_marks[]=new int[5];
         int see_marks[]=new int [5];
         
         System.out.println("enter number of students:");
         int num;
         num=sc.nextInt();
        
         int nfinalmarks[]=new int[num];
         //FOR INPUTTING INFO OF N STUDENTS
         for(int i=0;i<num;i++)
         {  
            System.out.println("student"+(i+1)+":");
            internal.setmarks(cie_marks);
            ext.setmarks(see_marks);
         }
         //for displaying info of n students
         for(int i=0;i<num;i++)
         {
            nfinalmarks[i]=cie_marks[i]+see_marks[i];
         }
         System.out.println("---------------------");
         System.out.println("final marks are:");
         System.out.println();
       for(int i=0;i<num;i++)
         {  
            
            System.out.println("student"+(i+1)+":");
            System.out.println();
            for(int j=0;j<5;j++)
            {
                System.out.println("subject"+(j+1)+":"+(cie_marks[j]+see_marks[j]));
            }
             System.out.println();
         }
    }
}
   

