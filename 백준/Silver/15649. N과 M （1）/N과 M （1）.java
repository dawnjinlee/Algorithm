import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int n, m;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        // 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        arr = new int[n];

        rec(0);

    }
    public static void rec(int depth){
        if(depth == m){
            for(int i = 0 ; i < m ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1 ; i <= n ; i++){
            if(visited[i]){
                continue;
            }
            arr[depth] = i;
            visited[i] = true;
            rec(depth + 1);
            visited[i] = false;
        }
    }
}
