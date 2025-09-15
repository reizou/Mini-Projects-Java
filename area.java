import java.util.Scanner;

public class area {
    public static void main(String[] args){

        //AREA OF A RECTANGLE

      double length;
      double width;
      double area;

      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        area = length * width;
        System.out.println("The area is: " + area + "cm^2");


      scanner.close();
    }
    
}
