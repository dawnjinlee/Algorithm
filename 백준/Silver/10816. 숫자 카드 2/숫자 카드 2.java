import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] have = new int[20000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            int number = Integer.parseInt(st.nextToken()) + 10000000;
            have[number]++;
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++){
            int number = Integer.parseInt(st.nextToken())+ 10000000;
            if(have[number] > 0){
                System.out.print(have[number] + " ");
            }else{
                System.out.print(0 + " ");
            }
        }




    }
}
