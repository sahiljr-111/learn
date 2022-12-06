import java.util.Scanner;

class length {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float cm, m;
        System.out.println("meter to Centemeter");
        System.out.println("Enter meter");
        m = a.nextFloat();
        a.close();

        cm = m * 100;
        System.out.println(m + " = " + cm);
    }
}