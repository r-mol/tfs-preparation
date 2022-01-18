import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int costOfTariff;
        int sizeOfTariff;
        int costForAdditionalMegabytes;
        int planOfUsingInternet;
        int totalCost = 0;
        Scanner scanner = new Scanner(System.in);
        costOfTariff = scanner.nextInt();
        sizeOfTariff = scanner.nextInt();
        costForAdditionalMegabytes = scanner.nextInt();
        planOfUsingInternet = scanner.nextInt();

        if (planOfUsingInternet != 0){
            totalCost = costOfTariff;
            if(planOfUsingInternet - sizeOfTariff > 0){
                totalCost += (planOfUsingInternet-sizeOfTariff)*costForAdditionalMegabytes;
            }
        }

        System.out.println(totalCost);
    }
}
