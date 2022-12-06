import java.util.Scanner;

class currency {
    public static void main(String[] args) {
        float rupees,paisa;
        System.out.println("Convert rupees to paisa");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter rupees");
        rupees = a.nextFloat();
        a.close();

        paisa = rupees * 100;
        System.out.println(rupees+" = "+paisa);

    }
}
