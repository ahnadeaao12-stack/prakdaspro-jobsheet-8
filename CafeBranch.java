import java.util.Scanner;

public class CafeBranch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Cafe Branches: ");
        int branch = sc.nextInt();

        int i = 1;
        int j;
        int totalCostumer = 0;
        int totalItemsSold = 0;
        int numberCustomer;
        int itemsOrdered;

        System.out.println("\n--- Sales Input Per Branch ---");
       
        while (i <= branch){
            System.out.println("\n--- Branch " + i + " ---");
            System.out.print("Number of costumers: ");
            numberCustomer = sc.nextInt();
            int branchItemSold = 0;

            for(j = 1; j <= numberCustomer; j++){
                System.out.print("- How many items did costumer " + j + " oder? ");
                itemsOrdered = sc.nextInt();
                branchItemSold += itemsOrdered;
            }
            System.out.println("Branch " + i + ":");
            System.out.println("- Customers: " + numberCustomer);
            System.out.println("- Items sold: " + branchItemSold);

            totalCostumer += numberCustomer;
            totalItemsSold += branchItemSold;
            
            i++;
        }
        System.out.println("\nTotal across all branches:");
        System.out.println("- Customers: " + totalCostumer);
        System.out.println("- Items sold: " + totalItemsSold);
        sc.close();
    }
}
    