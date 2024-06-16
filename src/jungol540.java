import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol540 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int num = Integer.parseInt(br.readLine());
            if (num == -1){
                break;
            } else if (num % 3 == 0) {
                System.out.println(num/3);
            }
        }
    }
}
