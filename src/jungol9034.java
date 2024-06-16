import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol9034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("주사위를 두 번 던진 결과를 입력하세요. ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if ((a >= 4) && (b >= 4)){
            System.out.println("이겼습니다.");
        } else if ((a >= 4) || (b >= 4)) {
            System.out.println("비겼습니다.");
        } else {
            System.out.println("졌습니다.");
        }
    }
}
