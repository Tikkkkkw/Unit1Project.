import java.util.Scanner;
public class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        System.out.print("The total amount of people: ");
        int totalPeople = s.nextInt();
        System.out.print("The bill amount: ");
        Double totalBeforeTip = s.nextDouble();
        System.out.print("Tip percentage: ");
        double tipAmount = s.nextDouble();
        s.close();

        Double tipPercent = tipAmount * 0.01;

        Double tipNeeded = totalBeforeTip * tipPercent;
        Double totalAmount = tipNeeded+totalBeforeTip;
        Double tipPerPerson = tipNeeded/totalPeople;
        Double totalPerPerson = totalAmount/totalPeople;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Here's your information:");
        System.out.println("Your Tip amount is: $" + (Math.floor(tipNeeded*100)/100));
        System.out.println("Your Total Bill is: $" + (Math.floor(totalAmount*100)/100));
        System.out.println("The amount of Tip Per Person is: $" + (Math.floor(tipPerPerson*100)/100));
        System.out.println("The Total Bill Per Person is: $" + (Math.floor(totalPerPerson*100)/100));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
