import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int test = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < test; tc++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            BigInteger result = c(m, n);

            System.out.println(result);
        }
    }

    public static BigInteger c(int m, int n) {
        BigInteger head = BigInteger.ONE;  // BigInteger 초기화
        int n2 = n;
        while (n > 0) {
            head = head.multiply(BigInteger.valueOf(m - (n - 1)));  // 곱셈
            n = n - 1;
        }

        BigInteger body = BigInteger.ONE;  // BigInteger 초기화
        while (n2 > 0) {
            body = body.multiply(BigInteger.valueOf(n2));  // 곱셈
            n2 -= 1;
        }


        return head.divide(body);  // 나눗셈
    }
}
