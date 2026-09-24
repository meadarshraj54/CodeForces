import java.util.*;

public class ALineTrip{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();

            while(t-- > 0){
                int n = sc.nextInt();
                int x = sc.nextInt();

                int a[] = new int[n];
                for(int i = 0; i < n; i++){
                    a[i] = sc.nextInt();
                }

                int minCapacity = a[0];

                for(int i = 1; i < n && a[i] <= x; i++){
                    int currDiff = a[i] - a[i -1];
                    minCapacity = Math.max(currDiff, minCapacity);
                }

                if(x > a[n - 1]){
                    minCapacity = Math.max(minCapacity, 2 * (x - a[n -1]));
                }

                System.out.println(minCapacity);
            }
        }
    }
}