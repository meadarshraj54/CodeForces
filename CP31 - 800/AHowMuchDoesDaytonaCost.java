import java.util.Scanner;

public class AHowMuchDoesDaytonaCost{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            while(t-- > 0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int arr[] = new int[n];

                for(int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();

                boolean found = false;
                for(int a : arr){
                    if(a == k){
                        found = true;
                        break;
                    }
                }

                System.out.println(found ? "YES" : "NO");
            }
        }
    }
}