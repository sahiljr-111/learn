import java.util.Scanner;

class currency {
    public static void main(String[] args) {
        float rupees,paisa;
        System.out.println("Convert paisa to rupees");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter paisa");
        paisa = a.nextFloat();
        a.close();

        rupees = paisa / 100;
        System.out.println(paisa+" = "+rupees);

    }
}
