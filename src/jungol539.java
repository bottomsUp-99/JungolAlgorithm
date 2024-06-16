import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int sum = 0;
        double avg;
        while(true){
            int num = Integer.parseInt(st.nextToken());
            cnt++;
            sum += num;
            avg = (double)sum/cnt;
            if (num >= 100) break;
        }
        System.out.println(sum);
        System.out.printf("%.1f",avg);

    }
}
