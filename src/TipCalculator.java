import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the total bill?: ");
        double total = scan.nextDouble();

        System.out.println("What percentage of tip do you want to give?: ");
        int tipPercent = scan.nextInt();

        System.out.println("What is the total number of people?: ");
        int totalPeople = scan.nextInt();

    }
}
