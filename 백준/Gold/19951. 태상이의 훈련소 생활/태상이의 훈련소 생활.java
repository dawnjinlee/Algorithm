import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] nums;
    public static int[] prefix;
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n + 1];
        prefix = new int[n + 1];
        nums[0] = 0;
        prefix[0] = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n ; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for(int r = 0 ; r < m ; r++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            prefix[s] += k;     // 그냥 대입이 아니라 기존에 있던 값과 더해야함
            if(e + 1 <= n){
                prefix[e + 1] += k * (-1);
            }
        }

        for(int i = 1 ; i <= n ; i++){
            prefix[i] = prefix[i-1] + prefix[i];
        }

        for(int i = 1 ; i <= n ; i++){
            System.out.print((nums[i] + prefix[i]) + " ");
        }


        
    }
}
