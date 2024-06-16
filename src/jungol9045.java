import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol9045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");
            int num = Integer.parseInt(br.readLine());
            System.out.println();
            if(num ==1) {
                System.out.println("입력하기를 선택하였습니다.\n");
            }else if(num ==2) {
                System.out.println("출력하기를 선택하였습니다.\n");
            }else if(num==3) {
                System.out.println("삭제하기를 선택하였습니다.\n");
            }else if(num==4) {
                System.out.println("끝내기를 선택하였습니다.\n");
                break;
            }else {
                System.out.println("잘못 입력하였습니다.\n");
            }
        }
    }
}
