import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol127 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int cnt = 0;
        double avg = 0;
        while (true){
            int num = Integer.parseInt(st.nextToken());
            if ((num < 0) || (num > 100)) break;
            cnt++;
            sum += num;
        }
        avg = (double) sum / cnt;
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
    }
}
