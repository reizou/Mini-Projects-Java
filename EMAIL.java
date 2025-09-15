import java.util.Scanner;

public class EMAIL {
    public static void main(String [] args){
        //EMAIL 

        Scanner scanner = new Scanner (System.in);
        

        String studentAnswer;
        String name;
        String email1;
        String studentnumber;
        String password;
        String program;
        String address;
        String number;
        String birthday;
        String gender;
        String loginEmail;
        String loginPassword;
        
        
        
        

        //SIGN UP

        while(true){
        
            System.out.print("Are you a Student? ");
            studentAnswer = scanner.nextLine();


            if (studentAnswer.equalsIgnoreCase("yes")) {
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
        email1 = scanner.nextLine();

        System.out.print("Student Number: ");
        studentnumber = scanner.nextLine();

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
        System.out.println("PROGRAM: " + program);
        System.out.println("STUDENT NUMBER: " + studentnumber);
        System.out.println("EMAIL: " + email1);
        System.out.println("NAME: " + name);
        System.out.println("GENDER: " + gender);
        System.out.println("BIRTHDAY: " + birthday);
        System.out.println("ADDRESS: " + address);
        System.out.println("MOBILE NUMBER: +63" + number);
        System.out.println("=================================");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } 

        System.out.println("");
        System.out.println("== GO BACK TO LOGIN ==");

        //LOGIN 

        while (true){
            System.out.print("Are you a student?: ");
            studentAnswer = scanner.nextLine();


            if (studentAnswer.equalsIgnoreCase("yes")){
                System.out.println("");
                System.out.println("== YOU MAY PROCEED! ==");
                System.out.println("");

                try {
                 Thread.sleep(1000);
                 } catch (Exception e) {
                     e.printStackTrace();
             }

                System.out.println("== LOGIN ==");
                
                //EMAIL LOGIN
                while (true){
                    System.out.print("Email: ");
                    loginEmail = scanner.nextLine();
                    if(loginEmail.equals(email1)){
                        break;
                    }else{
                        System.out.println("Incorrect Email!");
                    }
                }

                //PASSWORD LOGIN
                while (true) {
                    System.out.print("Password: ");
                    loginPassword = scanner.nextLine();
                    if (loginPassword.equals(password)) {
                        System.out.println("");
                        System.out.println("== LOGIN SUCCESSFUL ==");
                        break;
                    }else{
                        System.out.println("Incorrect Password!");
                    }
                }

                break; //to exit login loop

            }else{
                System.out.println("== YOU MAY NOT PROCEED ==");
                System.out.println("");
            }
            
        }
               
        
        

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        System.out.println("");
        System.out.println("BATAAN PENINSULA STATE UNIVERSITY");
        System.out.println("");
        System.out.println("WELCOME BACK! " + name + " | " + studentnumber);
        System.out.println("");
        System.out.println("== " + program + " ==");
        System.out.println("");
        System.out.println("NAME: " + name);
        System.out.println("GENDER: " + gender);
        System.out.println("BIRTHDAY: " + birthday);
        System.out.println("PERMANENT ADDRESS: " + address);
        System.out.println("MOBILE NUMBER: +63" + number);
        System.out.println("");
    



        scanner.close();
    }
    
}
    

