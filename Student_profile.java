import java.util.Scanner;

public class Student_profile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int age;
        double gpa;
        String school;
        String food;
        String studentAnswer;
        String ask;

        while (true){

        System.out.print("Are you a student?: ");
        studentAnswer = scanner.nextLine();

         if (studentAnswer.equalsIgnoreCase("yes")){
            System.out.println("You may proceed!");
            System.out.println("");
            System.out.println(" == INPUT CREDENTIALS == ");
            break; //exit loop

        }else{
            System.out.println("You may not Proceed!");
            System.out.println("");
            
            
        }
    }
        

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();

        System.out.print("Enter gpa: ");
        gpa = scanner.nextDouble();

        System.out.print("Enter Favorite drink: ");
        food = scanner.next();

        System.out.print("Enter School: ");
        school = scanner.next();

        try{
        Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println(" == STUDENT PROFILE == ");
        System.out.println("Your name is: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your gpa: " + gpa);
        System.out.println("Your Favorite drink is: " + food);
        System.out.println("Your school: " + school);
        System.out.println("");

        scanner.nextLine();

    while (true){
        System.out.print("Do you have any comments?: ");
        ask = scanner.nextLine();

        if (ask.equalsIgnoreCase("yes")) {
            System.out.print("Type your comments here: ");
            ask = scanner.nextLine();
            System.out.println("");
            System.out.println("...");
            System.out.println("");
            
           try {
            Thread.sleep(2000);
            System.out.println("Received! We will review your comment as soon as possible!");
            Thread.sleep(2000);
            System.out.println("");
            System.out.println("...");
            System.out.println("");
            Thread.sleep(2000);
            System.out.println(" ");
           } catch (InterruptedException e) {
            e.printStackTrace();
           }
            System.out.println("");
            break; //exit loop
            
          }  else {
        System.out.println("Alright! It seems like you don't have any comments.");
        System.out.println("");
       }
    }           
                

        scanner.close();
    }
    
}
