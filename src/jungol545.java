import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int three_count = 0;
        int five_count = 0;
        for (int i = 0 ; i < 10 ; i++){
            int num = Integer.parseInt(st.nextToken());
            if (num % 15 == 0){
                three_count++;
                five_count++;
            }
            else if (num % 3 == 0) {
                three_count++;
            } else if (num % 5 == 0) {
                five_count++;
            }
        }
        System.out.println("Multiples of 3 : " + three_count);
        System.out.println("Multiples of 5 : " + five_count);
    }
}
