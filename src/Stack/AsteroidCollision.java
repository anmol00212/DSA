package Stack;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int num : asteroids){
            while (!stack.isEmpty() && num < 0 && stack.peek() > 0){
                int top = stack.pop();
                if (top > -num) {
                    num = top;
                } else if (top == -num) {
                    num = 0;
                }
            }
            if (num != 0) {
                stack.push(num);
            }
        }
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
