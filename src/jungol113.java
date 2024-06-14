import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol113 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        width += 5;
        length *= 2;
        int area = width * length;
        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("area = " + area);
    }
}
