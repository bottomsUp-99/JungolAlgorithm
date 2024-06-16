import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol9042 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int sum = 0;
        double avg = 0;
        while(true){
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            cnt++;
            sum += num;
            avg = (double)sum/cnt;
        }
        System.out.println("입력된 자료의 개수 = " + cnt);
        System.out.println("입력된 자료의 합계 = " + sum);
        System.out.print("입력된 자료의 평균 = ");
        System.out.printf("%.2f",avg);
    }
}
