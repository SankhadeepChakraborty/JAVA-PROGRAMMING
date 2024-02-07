import java.util.*;

public class Saveing1 extends Accounts {
    public static void main(String[] args) {
    public float rate;


    Saveing1(float bal, int accno, String name, String add, float rate) {
        super(bal, accno, name, add);
        System.out.print("Enter your rate:");
        Scanner sc = new Scanner(System.in);
        this.rate = sc.nextFloat();

    }

 

   
  

        System.out.print("Holder name :");
        System.out.print("Address : ");
        System.out.println("Account Number : " + accno);

        System.out.print("Rate : " + rate);
        System.out.print("Enter Your Choice : 1.withdrawl 2.deposit");
        int e;
        Scanner sc = new Scanner(System.in);
        e = sc.nextInt();
        switch (e) {
            case 1:
                System.out.println("Withdrawl process in running");
                Accounts t = new Accounts();
                t.withdrawl();
        }

    }
}
