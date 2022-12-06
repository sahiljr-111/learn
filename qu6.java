import java.util.Scanner;

class length {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float cm, m;
        System.out.println("Centemeter to meter");
        System.out.println("Enter Centemeter");
        cm = a.nextFloat();
        a.close();


        m = cm / 100;
        System.out.println(cm + " = " + m);
    }
}