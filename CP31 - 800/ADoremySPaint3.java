import java.util.*;

public class ADoremySPaint3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                HashMap<Integer, Integer> freq = new HashMap<>();

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    freq.put(x, freq.getOrDefault(x, 0) + 1);
                }

                switch (freq.size()) {
                    case 1 -> System.out.println("Yes");

                    case 2 -> {
                        int min = Integer.MAX_VALUE;
                        int max = Integer.MIN_VALUE;

                        for (int count : freq.values()) {
                            min = Math.min(min, count);
                            max = Math.max(max, count);
                        } 
                        
                        System.out.println(max - min <= 1 ? "Yes" : "No");
                    }

                    default -> System.out.println("No");
                }
            }
        }
    }
}
