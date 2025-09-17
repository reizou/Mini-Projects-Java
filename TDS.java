import java.util.Scanner;

public class TDS {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float distance = 5400; // miles
        float speed = 220;     // mph

        float time = distance / speed; // time in hours

        System.out.println("");
        System.out.println("Time required to travel " + distance + " miles at a speed of " + speed + " mph is: " + time + " hours.");
        System.out.println("");
        sc.close();
    }
    
}
