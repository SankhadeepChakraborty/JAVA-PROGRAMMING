import java.util.*;
 class Accounts {
    float bal;
    int accno;
    String name;
    String add;
    Accounts(float bal,int accno,String name,String add){
        System.out.print("Enter your balance:");
          Scanner sc=new Scanner(System.in); 
          this.bal=sc.nextInt();
          System.out.print("Account number : ");
        this.accno= sc.nextInt();
        System.out.print("Holder name : ");
        this.name=sc.nextLine();
        System.out.print("Enter your Address");
        this.add=sc.nextLine();

    }
    
   Accounts() {
    }

    void withdrawl()
    {
        int a;
        System.out.print("Enter your emergency money: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
       float b=bal-a;
     

    }
   void deposit()
   {
     System.out.print("Enter your added money: ");
     Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    float c= a+bal;
   }
   void display()
   {
    System.out.println("Account number : "+accno);
   }
}



