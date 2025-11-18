package cie;

import java.util.Scanner;
public class internals {
    
    
    public void setmarks(int marks[]) {
        System.out.println("enter marks of student in cie:");
        
        for(int i=0;i<5;i++)
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("subject"+(i+1)+":");
                marks[i]=sc.nextInt();
                sc.nextLine();
            }
    }
}
