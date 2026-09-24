import java.util.*;

public class ACoverInWater {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();

            while(t-- > 0){
                int n = sc.nextInt();
                String s = sc.next();

                int empty = 0;
                boolean triplet = false;

                for(int i = 0; i < n; i++){
                    if(s.charAt(i) == '.'){
                        empty++;

                        if(i > 0 && i < n - 1 && s.charAt(i -1) == '.' && s.charAt(i + 1) == '.'){
                            triplet = true;
                            break;
                        }
                    }   
                }

                System.out.println(triplet ? "2" : empty);
            }
        }
    }
}
