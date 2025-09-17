import java.util.Scanner;

public class FeetToInches {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of feet: ");
        double feet = sc.nextDouble();

        double inches = feet * 12;

        System.out.println(feet + " ft is equal to " + inches + " inches.");


        sc.close();
    }

}
