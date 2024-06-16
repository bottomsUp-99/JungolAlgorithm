import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int i;
        for(i = 1; sum < num; i += 2) {
            sum += i;
        }
        System.out.println(i/2 + " " + sum);
    }
}
