import java.util.*;

public class ADonTTryToCount{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            while(t-- > 0){
                int n = sc.nextInt();
                int m = sc.nextInt();

                String x = sc.next();
                String s = sc.next();

                int count = 0;
                while(!x.contains(s) && count <= 6){
                    x += x;
                    count++;
                }

                System.out.println(x.contains(s) ? count : -1);
            }
        }
    }
}