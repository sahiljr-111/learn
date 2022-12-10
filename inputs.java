import java.util.Scanner;
class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number : ");
        int a = sc.nextInt();
        System.out.println("Enter realnumber : ");
        float b = sc.nextFloat();
        System.out.println("Enter double");
        double c = sc.nextDouble();
        System.out.println("Enter String");
        Scanner str = new Scanner(System.in);
        String stri = str.nextLine();
        sc.close();
        str.close();
        System.out.println("Number = "+a);
        System.out.println("real Number = "+b);
        System.out.println("Double = "+c);
        System.out.println("String = "+stri);
    }    
}
