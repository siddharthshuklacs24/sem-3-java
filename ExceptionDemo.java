import java.util.Scanner;

class BudgetCrossedException extends Exception {
    BudgetCrossedException(String msg) {
        super(msg);
    }
}

class Grocery {
    int qty_dal;
    int qty_pulses;
    int qty_cereal;

    Grocery(int qty_dal, int qty_pulses, int qty_cereal) {
        this.qty_dal = qty_dal;
        this.qty_pulses = qty_pulses;
        this.qty_cereal = qty_cereal;
    }

    void calc_cost() throws BudgetCrossedException {
        int dalPrice = 170;
        int pulsesPrice = 100;
        int cerealPrice = 80;
        int cost = qty_dal * dalPrice + qty_pulses * pulsesPrice + qty_cereal * cerealPrice;
        if (cost > 1000) {
            throw new BudgetCrossedException("Budget of 1000/- crossed");
        }
        System.out.println("the total cosot of grocery is:" + cost);
    }

    static void display_cat() {
        System.out.println("the categories are as follows:");
        System.out.println("1.dal");
        System.out.println("2.pulses");
        System.out.println("3.cereal");
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Grocery.display_cat();
            System.out.println("enter dal quantity:");
            int dq = sc.nextInt();
            sc.nextLine();

            System.out.println("enter pulses quantity:");
            int pq = sc.nextInt();
            sc.nextLine();

            System.out.println("enter cereal quantity:");
            int cq = sc.nextInt();
            sc.nextLine();

            Grocery g = new Grocery(dq, pq, cq);
            
            g.calc_cost();

        } catch (BudgetCrossedException e) {
            System.out.println(e.getMessage());
        }
    }
}