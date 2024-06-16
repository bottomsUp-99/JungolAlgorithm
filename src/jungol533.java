import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol533 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String sex = st.nextToken();
        int age = Integer.parseInt(st.nextToken());
        if (sex.equals("M")){
            if (age >= 18){
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else if (sex.equals("F")) {
            if (age >= 18){
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}
