import java.util.*;
class Book {
    String name,author;
    double price;
    int num_pages;
    //constructor for setting values of the members
    Book(String name,String author,double price,int num_pages)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    //set methods
    void SetName(String name)
    {
        this.name=name;
    }
    void SetAuthor(String author)
    {
        this.author=author;
    }
    void SetPrice(double price)
    {
        this.price=price;
    }
    void SetNum_Pages(int num_pages)
    {
        this.num_pages=num_pages;
    }
    //get methods
    String GetName()
    {
        return name;
    }
    String GetAuthor()
    {
        return author;
    }
    double GetPrice()
    {
       return price;
    }
    int GetNum_Pages()
    {
        return num_pages;
    }
    //tostring method
    public String toString() {
        return "Name:"+name+"\nAuthor:"+author+"\nPrice:"+price+"\nNumber of pages:"+num_pages;
    }
    }
    public class tostring {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("enter number of books:");
            n=sc.nextInt();
            sc.nextLine();
            Book b[]=new Book[n];
            //for loop for setting details of n objects of type Book through constructor
            for(int i=0;i<n;i++)
            {
                System.out.println("enter details for book"+(i+1)+":");
                System.out.println("Name:");
                String Name=sc.nextLine();
                System.out.println("Author:");
                String Author=sc.nextLine();
                System.out.println("Price:");
                double Price=sc.nextDouble();
                System.out.println("Number of pages:");
                int NumPages=sc.nextInt();
                sc.nextLine();
                b[i]= new Book(Name,Author,Price,NumPages);
            }
            //displaying details
            System.out.println("------------Book details:------------");
            //for loop to display using tostring
            for(int i=0;i<n;i++)
            {
                System.out.println("Book "+(i+1)+":");
                System.out.println(b[i].toString());
                System.out.println("--------------------------");
            }
        }
    }

