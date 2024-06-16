import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol9036 {
    public static void main(String[] args) throws IOException {
        System.out.printf("숫자를 선택하세요. ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (a == 1){
            System.out.println("삽입을 선택하셨습니다.");
        } else if (a == 2) {
            System.out.println("수정을 선택하셨습니다.");
        } else if (a == 3){
            System.out.println("삭제를 선택하셨습니다.");
        }
    }
}
