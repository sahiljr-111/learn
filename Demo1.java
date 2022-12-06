import java.util.Scanner;
public class Demo1 {
    static public void main(String args[]){
        System.out.println("Hello world");
        int num1, num2, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = sc.nextInt();
        sc.close();
        total = num1 + num2;
        System.out.println("Total = " + total);
        
    }
}
