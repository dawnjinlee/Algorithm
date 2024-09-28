import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        boolean result = true;

//        System.out.println();
        while(true){
            String str = br.readLine();
            stack = new Stack<>();
            result = true;

//            System.out.println(str);

            if(str.equals(".")){
                System.exit(0);
            }

            for(int i = 0 ; i < str.length() ; i++){
                if(str.charAt(i) == '(' || str.charAt(i) == '['){
                    stack.add(str.charAt(i));
                }else if(str.charAt(i) == ']'){
                    if(stack.isEmpty()){
                        result = false;
                        break;
                    }else if(stack.peek() == '['){ // 무작정 pop을 해버리며 안된다
                        stack.pop();
                        continue;
                    }else{
                        result = false;
                        break;
                    }
                }else if(str.charAt(i) == ')'){
                    if(stack.isEmpty()){
                        result = false;
                        break;
                    }else if(stack.peek() == '('){
                        stack.pop();
                        continue;
                    }else{
                        result = false;
                        break;
                    }
                }
            }
            if(result) {
                if(!stack.isEmpty()){
                    result = false;
                }
            }
            if(result) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }


    }
}
