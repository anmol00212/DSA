package Stack;

import java.util.Stack;

public class SimplyPath {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] ss = path.split("/");
        for(int i = 0;i<ss.length;i++){
            if(!s.empty() && ss[i].equals("..")){
                s.pop();
            }
            else if(!s.equals("..") && !s.equals(".") && !s.equals("")){
                s.push(ss[i]);
            }
        }
        if(s.empty()) return "/";
        while(!s.empty()){
            res.insert(0,s.pop()).insert(0,"/");
        }
        return res.toString();
    }
}
