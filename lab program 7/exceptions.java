import java.util.*;
class wrongAgeException extends Exception {
    wrongAgeException(String message) {
        super(message);
    }
}
class wrongSonAgeException extends Exception {
    wrongSonAgeException(String message) {
        super(message);
}
}
 class Father {
    int fAge;
    Father(int fAge) {
       
        try {
        if(fAge<0) {
            throw new wrongAgeException("father's age cannot be less than 0");
        }
        this.fAge=fAge;
    }
    catch (wrongAgeException e) {
        System.out.println("Error:"+e);
    }
    
    }
}
 class Son extends Father {
    int sAge;
    Son(int fAge,int sAge) {
        super( fAge );
    
    try {
        if (sAge>=fAge) {
            throw new wrongSonAgeException("Son's age cannot be more than Father's age");
        }
         this.sAge=sAge;
    }
    catch (wrongSonAgeException e) {
        System.out.println("Error:"+e);
    }
    }
    
    }


public class exceptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the father and son age");
        int fatherAge=sc.nextInt();
        int sonAge=sc.nextInt();
        Son s1=new Son(fatherAge,sonAge);
    }
}
