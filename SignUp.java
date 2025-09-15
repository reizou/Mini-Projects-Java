import java.util.Scanner;

public class SignUp {
    public static void main(String [] args){
        //EMAIL SIGN UP

        Scanner scanner = new Scanner (System.in);
        

        String studentAnswer;
        String name;
        String email;
        String username;
        String password;
        String program;
        String address;
        String number;
        String birthday;
        String gender;

        while(true){
            System.out.print("Are you a Student? ");
            studentAnswer = scanner.nextLine();


            if (studentAnswer.equalsIgnoreCase("yes")) {
                System.out.println("");
                System.out.println("== YOU MAY PROCEED ==");
                System.out.println("");

                try {
                Thread.sleep(1000);
                } catch (Exception e) {
                     e.printStackTrace();
            }

                System.out.println("== SIGN IN ==");
                break;

            }else{
                System.out.println("== YOU MAY NOT PROCEED ==");
                System.out.println("");
            }
            
        }

        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Birthday: ");
        birthday = scanner.nextLine();

        System.out.print("Gender: ");
        gender = scanner.nextLine();

        System.out.print("Email: ");
        email = scanner.nextLine();

        System.out.print("Username: ");
        username = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();

        System.out.print("Program: ");
        program = scanner.nextLine();

        System.out.print("Address: ");
        address = scanner.nextLine();

        System.out.print("Cellphone Number: +63");
        number = scanner.nextLine();

        

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("");
        System.out.println("== STUDENT PROFILE ==");
        System.out.println("Program: " + program);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Birthday: " + birthday);
        System.out.println("Adress: " + address);
        System.out.println("Cellphone Number: +63" + number);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("== GO BACK TO LOGIN ==");


        scanner.close();
    }
    
}
