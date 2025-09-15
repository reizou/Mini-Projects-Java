import java.util.Scanner;
public class Login {
    public static void main(String [] args) {

        //EMAIL LOGIN

        Scanner scanner = new Scanner(System.in);
        
        
        String email;
        String studentAnswer;
        String password;
        
        

        
        

        while (true){
            System.out.print("Are you a student?: ");
            studentAnswer = scanner.nextLine();


            if (studentAnswer.equalsIgnoreCase("yes")){
                System.out.println("== YOU MAY PROCEED! ==");
                System.out.println("");
                System.out.println("== LOGIN ==");
                break;

            }else{
                System.out.println("== YOU MAY NOT PROCEED ==");
                System.out.println("");
            }

            
        }

        System.out.print("Email: ");
        email = scanner.nextLine();
        
        

        System.out.print("Password: ");
        password = scanner.nextLine();
        
        
        

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("BATAAN PENINSULA STATE UNIVERSITY");
        System.out.println("");
        System.out.println("WELCOME BACK! " + " --- " + " | STUDENT NO. ");
        System.out.println("");
        System.out.println("==" + " BACHELOR OF SCIENCE IN COMPUTER SCIENCE " + "==");
        System.out.println("");
        System.out.println("NAME: ");
        System.out.println("GENDER: " );
        System.out.println("BIRTHDAY: ");
        System.out.println("PERMANENT ADDRESS: ");
        System.out.println("MOBILE NUMBER: +63");
        System.out.println("");
        








        
        scanner.close();
    }
}
