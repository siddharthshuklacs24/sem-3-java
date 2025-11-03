import java.util.*;
class Account {

    //initialising instance variables
    String cname;
    int accNo;
    String accType;
    double balance;
    Scanner sc=new Scanner(System.in);

    //constructor
    Account(String cname,int accNo,String accType,double balance)
    {
        this.cname=cname;
        this.accNo=accNo;
        this.accType=accType;
        this.balance=balance;
    }

    //deposit method
    void deposit()
    {
        double amount;
        System.out.println("enter the amount to be deposited:");
        amount=sc.nextDouble();
        balance+=amount;
        System.out.println("deposited succesfully");
    }

    //display balance method
    void disBal() 
    {
        System.out.println("the balance right now is:"+balance);
    }

    //method for withdrawal(general as we have to modify later for current account)
    void withdrawal()
    {
        double amount;
        System.out.println("enter the amount to be withdrawn:");
        amount=sc.nextDouble();
        if(amount>balance)
        {
            System.out.println("insufficient funds");
        }
        else 
        {
            balance-=amount;
            System.out.println("withdrawal successful");
        }
    }
}
class cur_Acct extends Account {
    //giving a minimum balance limit and a service charge
    double minBal=10000;
    double serviceCharge=500;

    //constructor involving super
    cur_Acct(String name,int accNo,double balance)
    {
        super(name,accNo,"Current",balance);
    }

    //method for checking whether current balance is above minimum balance or not
    void checkMinBal()
    {
        if(balance<minBal)
        {
            balance-=serviceCharge;
            System.out.println("balance below minimum balance limit therefore service charge imposed.");
        }
    }

    //withdraw method but modified/overridden with extra check of minimum balance penalty
    void withdrawal()
    {
        double amount;
        System.out.println("enter the amount to be withdrawn:");
        amount=sc.nextDouble();
        if(amount>balance)
        {
            System.out.println("insufficient funds");
        }
        else 
        {
            balance-=amount;
            System.out.println("withdrawal successful");
            checkMinBal();
        }
    }
}
class sav_Acct extends Account {
    //defining the rate of interest
    double rate=0.05; //5% per annum

    //constructor involving super
    sav_Acct(String name,int accNo,double balance)
    {
        super(name,accNo,"Savings",balance);
    }

    //calculation and deposit of interest
    void intCalcDep()
    {
        double interest=balance*Math.pow(1+rate/12,12)-balance;
        balance+=interest;
        System.out.println("yearly compound interest of amount "+interest+" has been added to the balance");
    }
}
public class Bank {
    public static void main(String[] args) {

        //asking input details from the user
        Scanner sc=new Scanner(System.in);
    
        String name;
        int accNo;
        int accType;
        double balance;
        System.out.println("enter customer name:");
        name=sc.nextLine();
        System.out.println("enter account number:");
        accNo=sc.nextInt();
        sc.nextLine();
        System.out.println("enter initial balance:");
        balance=sc.nextDouble();
        System.out.println("enter 1 for current account,2 for savings account");
        accType=sc.nextInt();
        sc.nextLine();

        //prepartion of menu driven program
        int choice1;
        int choice2;
        //1st case-user enters current account
        if(accType==1)
        {
            //keep on asking the user until he stops/exits
            cur_Acct ob1=new cur_Acct(name, accNo, balance);
            while(true)
            {
                System.out.println("press 1 for deposit,2 for withdrawal,3 for balance display,4 for exit");
                choice1=sc.nextInt();

                switch(choice1)
                {
                    case 1:ob1.deposit();
                    break;
                    case 2:ob1.withdrawal();
                    break;
                    case 3:ob1.disBal();
                    break;
                    case 4:System.exit(0);
                    break;
                    default:System.err.println("invalid input!");
                }
            }
        }
        else if(accType==2)
        {
            //keep on asking the user until he stops/exits
            sav_Acct ob1=new sav_Acct(name, accNo, balance);
            while(true)
            {
                System.out.println("press 1 for deposit,2 for withdrawal,3 for interest check,4 for balance display,5 for exit");
                choice1=sc.nextInt();

                switch(choice1)
                {
                    case 1:ob1.deposit();
                    break;
                    case 2:ob1.withdrawal();
                    break;
                    case 3:ob1.intCalcDep();
                    break;
                    case 4:ob1.disBal();
                    break;
                    case 5:System.exit(0);
                    break;
                    default:System.err.println("invalid input!");
                }
            }
        }
    }

}
