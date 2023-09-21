import java.util.Scanner;
public class Convert {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a= sc.nextInt();
        System.out.print("Enter the value of b:");
        int b= sc.nextInt();
        System.out.println("Beforeswapping value of a:"+a);
        System.out.println("Before swapping value of b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping value of a:"+a);
        System.out.println("After swapping value of b:"+b);

    }
    
}
