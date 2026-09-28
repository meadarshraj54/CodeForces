import java.util.Scanner;

public class CTargetPractice{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            while(t-- > 0){
                char target[][] = new char[10][10];

                for (int i = 0; i < 10; i++) {
                    target[i] = sc.next().toCharArray();
                }

                int score = 0;
                for (int i = 0; i < 10; i++) {
                    for(int j = 0; j < 10; j++){
                        if(target[i][j] == '.')
                            continue;

                        if(i == 0 || i == 9 || j == 0 || j == 9){
                            score += 1;
                        }
                        else if(i == 1 || i == 8 || j == 1 || j == 8){
                            score += 2;
                        }
                        else if(i == 2 || i == 7 || j == 2 || j == 7){
                            score += 3;
                        }
                        else if(i == 3 || i == 6 || j == 3 || j == 6){
                            score += 4;
                        }
                        else{
                            score += 5;
                        }
                    }
                }

                System.out.println(score);
            }
        }
    }
}