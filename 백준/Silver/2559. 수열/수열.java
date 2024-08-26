import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, k;
    public static int[] nums;

    public static int result = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        nums = new int[n + 1];
        nums[0] = 0;

        // 온도 저장하기
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= n ; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 첫번째 연속되는 k일의 합 구하기
        int sum = 0;
        for(int i = 1 ; i <= k ; i++){
            sum += nums[i];
        }
        result = sum;

        // 누적합 - a[1] + a[3]
        for(int i = 1 ; i <= n - k ; i++){
            int tmp = sum - nums[i] + nums[i + k];
            result = result < tmp ? tmp : result;
            sum = tmp;
        }

        System.out.println(result);

    }
}
