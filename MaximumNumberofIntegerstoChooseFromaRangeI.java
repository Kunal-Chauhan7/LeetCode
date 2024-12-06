package kunal;

import java.util.HashSet;

public class MaximumNumberofIntegerstoChooseFromaRangeI {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> ban = new HashSet<>();
        int ans = 0;
        for(int i : banned)ban.add(i);
        for(int i = 1 ; i <= n ; i++){
            if(ban.contains(i))continue;
            if(maxSum-i<0)return ans;
            maxSum-=i;
            ans++;
        }
        return ans;
    }
}
