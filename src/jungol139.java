import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        if(num1 < num2) {
            for(int i = 1; i<=9; i++) {
                for(int j = num1; j <= num2; j++) {
                    System.out.printf("%d * %d = %2d   ",j,i,i*j);
                }
                System.out.println();
            }

        }
        else {
            for(int i = 1; i<=9; i++) {
                for(int j = num1; j >= num2; j--) {
                    System.out.printf("%d * %d = %2d   ",j,i,i*j);
                }
                System.out.println();
            }
        }
    }
}
