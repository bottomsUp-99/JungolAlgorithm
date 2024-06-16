import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol122 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a%4==0){
            if(a%400==0) System.out.println("leap year");
            else if (a%100==0) System.out.println("common year");
            else System.out.println("leap year");
        }
        else System.out.println("common year");
    }
}
