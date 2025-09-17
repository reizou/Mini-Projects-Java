import java.util.Scanner;

public class areaANDperimeter {
    public static void main(String[] args){

        //AREA AND PERIMETER OF A RECTANGLE

      double length;
      double width;
      double area;
      double perimeter;

      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("The area is: " + area + "cm²");
        System.out.println("The perimeter is: " + perimeter + " cm");


      scanner.close();
    }
    
}
