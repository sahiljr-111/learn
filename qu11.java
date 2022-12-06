import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        float num1, num2, total;
        String op;
        Scanner n = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        num1 = n.nextFloat();
        System.out.println("Enter Second Number : ");
        num2 = n.nextFloat();
        System.out.println("Enter (+)(-)(*)(/) : ");
        op = c.nextLine();
        n.close();
        c.close();


        switch (op) {
            case "+":
                total = num1 + num2;
                System.out.println(num1 + " + " + num2 +" = "+total);
                break;
            case "-":
                total = num1 - num2;
                System.out.println(num1 + " - " + num2 +" = "+total);
                break;
            case "*":
                total = num1 * num2;
                System.out.println(num1 + " x " + num2 +" = "+total);
                break;
            case "/":
                total = num1 / num2;
                System.out.println(num1 + " / " + num2 +" = "+total);
                break;

            default:
                System.out.println("Enter valid operator");
                break;
        }

    }
}