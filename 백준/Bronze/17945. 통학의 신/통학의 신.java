import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 두 근의 합이 -2000 ~ 2000
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int x = -2000 ; x <= 2000 ; x++) {
            if (x * x + 2 * a * x + b == 0) {
                System.out.print(x + " ");
            }
        }

    }
}
