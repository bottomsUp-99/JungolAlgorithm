import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol140 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int count = 0;
        while(true){
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            sum += num;
            count++;
        }
        System.out.printf("%d %d", sum, sum/count);
    }
}
