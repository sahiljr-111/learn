import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        int n1, n2, sum, sub, mul, div;
        System.out.println("simple calc");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter first number:");
        n1 = a.nextInt();
        System.out.println("Enter Second number:");
        n2 = a.nextInt();
        a.close();

        sum = n1 + n2;
        System.out.println("Sum of " + n1 + " and " + n2 + "= " + sum);
        sub = n1 - n2;
        System.out.println("subtraction of " + n1 + " and " + n2 + "= " + sub);
        mul = n1 * n2;
        System.out.println("multiplication of " + n1 + " and " + n2 + "= " + mul);
        div = n1 / n2;
        System.out.println("division of " + n1 + " and " + n2 + "= " + div);

    }
}
