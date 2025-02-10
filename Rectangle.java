import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        //calculate are of a rectangle

        double width ;
        double height ;
        double area ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.print("Area of the rectangle is: " + area + "cm²");


        scanner.close();



    }
}
