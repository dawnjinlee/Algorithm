import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n,m;
    public static int[] num;
    public static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        result = new int[m];

        st = new StringTokenizer(br.readLine());

        // 중복인 것을 제거하고, 오름차순으로 숫자를 정렬한다.
        Set<Integer> set = new HashSet<>();
        while(st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        Integer[] nums = new Integer[set.size()];
        set.toArray(nums);
        num = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            num[i] = nums[i];
        }

        Arrays.sort(num);
        // 각 자릿수를 다 골랐으면 전체 세트를 출력한다.
        // 각 자릿수에 해당하는 번호를 선택한다.
        dfs(0, 0);
    }
    public static void dfs(int depth, int idx){
        // 각 자릿수를 다 골랐으면 전체 세트 출력
        if(depth == m){
            for(int i = 0 ; i < result.length ; i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        // depth번째 자릿수에 idx에 있는 숫자 넣을거얌
            for(int i = idx ; i < num.length ; i++) {
                result[depth] = num[i]; // 0번째 depth에 0번째 숫자를 넣어
                dfs(depth + 1, i); // 0 + 1번째 depth를 구할거고 똑같이 idx숫자를 넣어줄거야, 중복으로 구할 수 있으니까
            }

    }
}
