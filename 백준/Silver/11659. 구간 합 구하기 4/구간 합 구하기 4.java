import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n , m;
    public static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        nums = new int[n+1];
        nums[0] = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= n ; i++){
            nums[i] = Integer.parseInt(st.nextToken()) + nums[i-1];
        }


        for(int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(nums[end] - nums[start-1]);
        }

    }
}
