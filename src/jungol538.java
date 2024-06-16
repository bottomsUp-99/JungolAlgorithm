import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol538 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.printf("number? ");
            int num = Integer.parseInt(br.readLine());
            if (num > 0){
                System.out.println("positive integer");
            } else if (num < 0){
                System.out.println("negative number");
            } else {
                break;
            }
        }
    }
}
