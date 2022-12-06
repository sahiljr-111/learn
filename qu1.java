import java.util.Scanner;

 class avarageint { 
    public static void main(String[] args) {
        int num1, num2, avg;
        System.out.println("-- Avarage of two number -- ");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        num1 = a.nextInt();
        System.out.println("Enter Second Number :");
        num2 = b.nextInt();
        a.close();
        b.close();
        
        avg = (num1 + num2 )/2;
        System.out.println("Avarage of " + num1 +" and " +num2+" = "+avg);
    }
}