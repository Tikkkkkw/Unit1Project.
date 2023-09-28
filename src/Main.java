import java.util.Scanner;
public class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        System.out.println("The total amount of people: ");
        int totalPeople = s.nextInt();
        System.out.println("The bill amount: ");
        Double totalBeforeTip = s.nextDouble();
        System.out.println("Tip percentage: ");
        double tipAmount = s.nextDouble();
        s.close();

        Double tipPercent = tipAmount * 0.01;

        Double tipNeeded = totalBeforeTip * tipPercent;
        Double totalAmount = tipNeeded+totalBeforeTip;
        Double tipPerPerson = tipNeeded/totalPeople;
        Double totalPerPerson = totalAmount/totalPeople;


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Here's your information:");
        System.out.println("Your Tip amount is: $" + tipNeeded);
        System.out.println("Your Total Bill is: $" + totalAmount);
        System.out.println("The amount of Tip Per Person is: $" + tipPerPerson);
        System.out.println("The Total Bill Per Person is: $" + totalPerPerson);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



    }
}
