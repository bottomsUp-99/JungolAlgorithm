import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol126 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int odd_count = 0;
        int even_count = 0;
        while (true){
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            if (num % 2 == 0){
                even_count++;
            } else {
                odd_count++;
            }
        }
        System.out.println("odd : " + odd_count);
        System.out.println("even : " + even_count);
    }
}
