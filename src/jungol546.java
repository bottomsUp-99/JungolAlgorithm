import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0 ;
        for (int i = 0 ; i < num ; i++){
            sum += Integer.parseInt(st.nextToken());
        }
        double avg = (double) sum / num;
        if (avg >= 80){
            System.out.printf("avg : %.1f\n", avg);
            System.out.println("pass");
        } else {
            System.out.printf("avg : %.1f\n", avg);
            System.out.println("fail");
        }
    }
}
