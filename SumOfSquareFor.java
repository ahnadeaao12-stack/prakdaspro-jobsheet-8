import java.util.Scanner;

public class SumOfSquareFor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int sum = 0;
            System.out.print("n = " + i + "-> sum of squares = ");
            for(int j = 1; j <= i; j++){
                int square = j * j;
                sum += square;
                System.out.print(square);
            }
            System.out.print(" = " + sum);
            System.out.println();
        }
        sc.close();
    }
}