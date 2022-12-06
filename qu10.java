import java.util.Scanner;

class time{
    static void conversation(double sec){
        double hr;
        hr = sec * 3600;
        System.out.println(sec +" second = "+ hr + " hour ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sec;
        System.out.println("Enter Second");
        sec = sc.nextFloat();
        sc.close();

        conversation(sec);
    }
}