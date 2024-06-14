import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m_height = Integer.parseInt(st.nextToken());
        int m_weight = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int k_height = Integer.parseInt(st.nextToken());
        int k_weight = Integer.parseInt(st.nextToken());
        boolean f = (m_height > k_height);
        boolean s = (m_weight > k_weight);
        boolean result = (f && s);
        System.out.println(result);
    }
}
