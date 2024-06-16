import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol537 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int start = 1;
        int sum = 0;
        while(start <= a){
            sum += start;
            start++;
        }
        System.out.println(sum);
    }
}
