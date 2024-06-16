import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol633 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("대한민국 = 서울(Seoul)\n" +
                    "\n" +
                    "미국 = 워싱턴(Washington)\n" +
                    "\n" +
                    "일본 = 동경(Tokyo)\n" +
                    "\n" +
                    "중국 = 북경(Beijing)");
            System.out.print("number? ");
            int num = Integer.parseInt(br.readLine());
            System.out.println();
            if(num ==1) {
                System.out.println("1. Korea\n");
            }else if(num ==2) {
                System.out.println("2. USA\n");
            }else if(num==3) {
                System.out.println("3. Japan\n");
            }else if(num==4) {
                System.out.println("4. China\n");
            }else {
                System.out.println("none\n");
                break;
            }
        }
    }
}
