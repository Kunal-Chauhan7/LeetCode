package kunal;

public class NumberofLaserBeamsinaBank {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        for(int i = 0 ; i < bank.length ; i++){
            String curr = bank[i];
            if(curr.contains("1")){
                int lazerInCurr = 0;
                for(char c : curr.toCharArray()){
                    if(c == '1') lazerInCurr++;
                }
                do {
                    i++;
                } while (i < bank.length && !(bank[i].contains("1")));
                if(i!=bank.length && bank[i].contains("1")){
                    String next = bank[i];
                    int lazerInNext = 0;
                    for(char c : next.toCharArray()){
                        if(c == '1') lazerInNext++;
                    }
                    ans += lazerInCurr * lazerInNext;
                    i--;
                }
            }
        }
        return ans;
    }
}
