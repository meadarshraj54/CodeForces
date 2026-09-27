import java.util.HashMap;
import java.util.Scanner;

public class BKiakioAndSquaredNumbers {

    static final int[] CYCLE = {
        4, 16, 37, 58, 89, 145, 42, 20
    };

    static HashMap<Integer, Integer> pos = new HashMap<>();

    public static void main(String[] args) {

        for (int i = 0; i < CYCLE.length; i++) {
            pos.put(CYCLE[i], i);
        }

        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                
                int n = sc.nextInt();
                
                HashMap<String, Long> map = new HashMap<>();
                
                long answer = 0;
                
                for (int i = 0; i < n; i++) {
                    
                    int x = sc.nextInt();
                    
                    String state = getState(x);
                    
                    long count = map.getOrDefault(state, 0L);
                    
                    answer += count;
                    
                    map.put(state, count + 1);
                }
                
                System.out.println(answer);
            }
        }
    }

    static String getState(int x) {

        // 1 is an absorbing state.
        if (x == 1) {
            return "ONE";
        }

        int steps = 0;

        while (!pos.containsKey(x) && x != 1) {
            x = next(x);
            steps++;
        }

        if (x == 1) {
            return "ONE";
        }

        int cyclePosition = pos.get(x);

        int state = (cyclePosition - steps) % CYCLE.length;

        if (state < 0) {
            state += CYCLE.length;
        }

        return "CYCLE_" + state;
    }

    static int next(int x) {

        int sum = 0;

        while (x > 0) {
            int digit = x % 10;
            sum += digit * digit;
            x /= 10;
        }

        return sum;
    }
}
