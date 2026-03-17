import java.util.Scanner;

public class HelloApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter names: ");
        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello " + input);
        }

        sc.close();
    }
}