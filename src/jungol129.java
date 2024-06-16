import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol129 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.printf("Base = ");
            int base = Integer.parseInt(br.readLine());
            System.out.printf("Height = ");
            int height = Integer.parseInt(br.readLine());
            double width = (double) base*height/2;
            System.out.printf("Triangle width = %.1f\n", width);
            System.out.printf("Continue? ");
            String s = br.readLine();
            if (!s.equals("y") && !s.equals("Y")){
                break;
            }
        }
    }
}
