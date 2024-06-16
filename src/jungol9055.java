import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol9055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int start = 1;
        while (sum <= num){
            sum += start;
            start++;
        }
        System.out.printf("%d %d", (start - 1), sum);
    }
}
