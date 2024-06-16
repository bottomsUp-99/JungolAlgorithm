import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol9051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0 ; i < 10 ; i++){
            if(Integer.parseInt(st.nextToken()) % 2 == 0) count++;
        }
        System.out.println("입력받은 짝수는 " + count + "개입니다.");
    }
}
