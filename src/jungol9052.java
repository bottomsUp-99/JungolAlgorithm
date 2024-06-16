import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol9052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        double avg = 0;
        for (int i = 0 ; i < 5 ; i++){
            sum += Integer.parseInt(st.nextToken());
        }
        avg = (double) sum / 5;
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f", avg);
    }
}
