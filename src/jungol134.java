import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
    }
}
