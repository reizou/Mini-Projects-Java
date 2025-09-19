package COMPROG;

public class CS1D_LabA_DIAZ{

    public static void main(String[] args) {
        
        //trip details
        int gSize = 5; //number of people in the group
        double gBudget = 3000.00; // group budget
        double indivTranspo = 150.00; // transpo per person
        double eFee = 30.00; // entrance fee per person
        double foodCost = 1000.00; // fixed food cost for the group
        String tripDay = "Saturday"; //planned day
        char currency = 'P'; //peso sign

        //to calculate total transpo and entrance costs
        double totalTranspo = indivTranspo * gSize; //total transpo for the group
        double totalEntrance = eFee * gSize; //total entrance for the group
        double totalCost = totalTranspo + totalEntrance + foodCost; //this is to sum up all costs
        
        //to display trip summary in console/terminal
        System.out.println("== TRIP PLANNING TOOL ==");
        System.out.println("");
        System.out.println("Planned Day: " + tripDay); //planned day
        System.out.println("Total cost: " + currency + totalCost); //total cost
        System.out.println("Group Budget: " + currency + gBudget); //group budget


        //to determine feasibility using ternary operator and to check if trip is on Saturday and within the budget

       String result = (tripDay.equalsIgnoreCase("Saturday") && totalCost <= gBudget) ?
            "Result: The trip is feasible! Enjoy your visit to Dambana ng Kagitingan (Shrine of Valor) on Mount Samat." :
            (!tripDay.equalsIgnoreCase("Saturday") ? //if not saturday
                "Result: The trip is not feasible. The trip must be on a weekend." :
                "Result: The trip is not feasible. The total cost exceeds the group budget." //if over budget
        );
        System.out.println(result); //outputs the result
    }
}
