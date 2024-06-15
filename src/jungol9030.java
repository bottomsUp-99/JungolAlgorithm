import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol9030 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (a > 10){
            System.out.println(a);
            System.out.println("10보다 큰 수를 입력하셨습니다.");
        }
    }
}
