import  java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // scanner.nextDouble for double variables
        // scanner.nextBoolean for boolean variable
        // if you start with a int or double input, use "scanner.nextLine()"
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        scanner.close();;

    }
}
