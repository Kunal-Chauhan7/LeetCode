package kunal;

import java.util.Arrays;

public class AssignCookies {
	
	public int findContentChildren(int[] g, int[] s) {
		int cookiesNum = s.length;
		if(cookiesNum==0)
			return 0;
		Arrays.sort(g);
		Arrays.sort(s);
		int SatisfiedKid = 0;
		int childrensNum = g.length - 1;
        cookiesNum = cookiesNum-1;
		while(cookiesNum>=0&&childrensNum>=0) {
			if(s[cookiesNum]>=g[childrensNum]) {
				SatisfiedKid++;
				cookiesNum--;
                childrensNum--;
            }
            else{
                childrensNum--;
            }
		}
	return SatisfiedKid;
	}
}
