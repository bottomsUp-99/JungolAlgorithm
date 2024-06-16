import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol534 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if ( s.equals("A")){
            System.out.println("Excellent");
        } else if (s.equals("B")){
            System.out.println("Good");
        } else if (s.equals("C")){
            System.out.println("Usually");
        } else if (s.equals("D")){
            System.out.println("Effort");
        } else if (s.equals("F")){
            System.out.println("Failure");
        } else {
            System.out.println("error");
        }
    }
}
