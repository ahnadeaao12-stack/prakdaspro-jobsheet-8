import java.util.Scanner;

public class GroupScore02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int j;
        double totalScore, avgScore, score;
        while (i <= 6){
            System.out.println("Grup " + i);
            totalScore = 0;
            for(j = 1; j <= 5; j++){
                System.out.print(" Score from Rater Group " + j + " : ");
                score = sc.nextInt();
                totalScore += score;
            }

        avgScore = totalScore / 5;
        i++;
        System.out.println("Average score = " + avgScore);
        }
        sc.close();
    }
}