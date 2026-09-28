import java.util.Scanner;

public class AGoalsOfVictory {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            while(t-- > 0){
                int sum = 0;
                int n = sc.nextInt();

                for(int i = 1; i < n; i++)
                    sum += sc.nextInt();

                System.out.println(-sum);
            }
        }
    }
}
