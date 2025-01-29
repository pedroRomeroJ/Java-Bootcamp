import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        //calculate are of a rectagle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.print("Arean of the rectangle is: " + area + "cm²");


        scanner.close();



    }
}
