import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int n, m;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        arr = new int[n];

        rec(0, 1);

    }
    public static void rec(int depth, int start){
        if(depth == m){
            for(int i = 0 ; i < m ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = start ; i <= n ; i++){
            if(visited[i]){
                continue;
            }
            arr[depth] = i;
            visited[i] = true;
            rec(depth + 1, i);
            visited[i] = false;
        }
    }
}
