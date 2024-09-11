import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int n, m;
    public static boolean[] visited;
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder("");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        arr = new int[n];

        rec(0, 1);
        System.out.println(sb);

    }
    public static void rec(int depth, int start){
        if(depth == m){
            for(int i = 0 ; i < m ; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1 ; i <= n ; i++){
            arr[depth] = i;
            rec(depth + 1, i);
        }
    }
}
