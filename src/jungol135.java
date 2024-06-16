import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class jungol135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int first = Math.min(a, b);
        int end = Math.max(a, b);
        int sum = 0;
        int count = 0 ;
        for (int i = first; i < end + 1; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)){
                sum+=i;
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
    }
}
