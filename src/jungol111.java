import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int kor = Integer.parseInt(st.nextToken());
        int eng = Integer.parseInt(st.nextToken());
        int math = Integer.parseInt(st.nextToken());
        int com = Integer.parseInt(st.nextToken());
        int sum = kor + eng + math + com;
        int avg = sum / 4;
        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
    }
}
