package see;

import java.util.Scanner;

import cie.personal;

public class External extends personal {
    
   
    public External(String usn,String name,int sem) {
        super(usn,name,sem);
          
    }
    public void setmarks(int marks1[]) {
        System.out.println("enter marks of student in see:");
        
        for(int i=0;i<5;i++)
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("subject"+(i+1)+":");
                marks1[i]=sc.nextInt();
                sc.nextLine();
            }
    }
}
