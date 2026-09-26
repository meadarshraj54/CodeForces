import java.util.*;

public class ASausageBank{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                
                long ans = (k - 1) * 2L + (1L << (n - k + 1));
                
                System.out.println(ans);
            }
        }
    }
}