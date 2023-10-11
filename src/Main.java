import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("*                        *");
        System.out.println("* Welcome to coffee shop *");
        System.out.println("*                        *");
        System.out.println("**************************");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("---Select your coffee:");
        System.out.println("1. Nescafe");
        System.out.println("2. Nesquik");
        System.out.println("3. Starbucks");
        int coffeeType = scanner.nextInt();

        Coffee coffee = null;
        switch (coffeeType) {
            case 1:
                coffee  = new Nescafe();
                break;
            case 2:
                coffee = new Nesquik();
                break;
            case 3:
                coffee = new Starbucks();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Do you want extras?");
        System.out.println("1. Milk");
        System.out.println("2. Chocolate");
        System.out.println("3. Cupcake");
        System.out.println("4. Organic Milk");
        System.out.println("5. NO");
        int coffeeExtra = scanner.nextInt();

        switch (coffeeExtra) {
            case 1:
                coffee = new MilkMod(coffee);
                break;
            case 2:
                coffee = new ChocolateMod(coffee);
                break;
            case 3:
                coffee = new CupcakeMod(coffee);
            case 4:
                coffee = new OrganicMilkMod(coffee);
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("---------------------------");
        System.out.println(" --- Your coffee order --- ");
        System.out.println("                           ");
        System.out.println("Description: " + coffee.getDesc());
        System.out.println("Cost: " + coffee.cost() + " tenge");
        System.out.println("Wait Time: "+ coffee.time() + " min");
        System.out.println("---------------------------");
        scanner.close();
    }
}