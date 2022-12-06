import java.util.Scanner;

class time {
    static void conversation(float hr) {
        float min;
        min = hr * 60;
        System.out.println(hr + " hour = " + min+" minute");
    }

    public static void main(String[] args) {
        float hr;
        System.out.println("Enter the value of hours: ");
        Scanner sc = new Scanner(System.in);
        hr = sc.nextFloat();
        sc.close();

        conversation(hr);
    }
}