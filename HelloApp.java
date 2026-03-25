public class HelloApp {
    public static void main(String[] args) {

        // If no arguments, print default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join names with comma and space
        String joinedNames = String.join(", ", args);

        System.out.println("Hello, " + joinedNames + "!");
    }
}