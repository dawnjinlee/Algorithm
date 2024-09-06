import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] have = new boolean[20000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            int number = Integer.parseInt(st.nextToken()) + 10000000;
            have[number] = true;
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++){
            int number = Integer.parseInt(st.nextToken())+ 10000000;
            if(have[number]){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }




    }
}
