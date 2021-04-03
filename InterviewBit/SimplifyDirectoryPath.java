// https://www.interviewbit.com/problems/simplify-directory-path/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    04/MM/2021
*/

import java.util.*;

public class Solution {
    public String simplifyPath(String path) {
        String parts[] = path.split("/");
        Stack<String> finalPath = new Stack<>();
        StringBuffer returnPath = new StringBuffer("/");

        for(int idx=1; idx<parts.length; idx++) {
            if(parts[idx].equals("..")) {
                if(!finalPath.isEmpty())
                    finalPath.pop();
            }
            else if(parts[idx].equals(".")) 
                continue;
            else 
                finalPath.add(parts[idx]);
        }

        for(int idx=0; idx<finalPath.size(); idx++) {
            returnPath.append(finalPath.get(idx));
            if(idx != finalPath.size()-1 && !finalPath.get(idx).equals(""))
                returnPath.append("/");
        }
        return returnPath.toString();
    }
}