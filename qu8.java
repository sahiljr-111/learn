import java.util.Scanner;

class time {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float hr, min;
        System.out.println("hour to minute");
        System.out.println("Enter hour");
        hr = a.nextFloat();
        a.close();

        min = hr * 60;
        System.out.println(hr + " = " + min);
    }
}