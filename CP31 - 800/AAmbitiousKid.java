import java.util.Scanner;

public class AAmbitiousKid{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++){
                int num = Math.abs(sc.nextInt());
                min = Math.min(min, num);
            }

            System.out.println(min);
        }
    }
}