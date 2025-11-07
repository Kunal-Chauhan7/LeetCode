package kunal;

import java.util.*;
public class FindPlayersWithZeroOrOneLosses {
	public static List<List<Integer>> findWinners(int[][] matches) {
	    ArrayList<Integer> winnerList = new ArrayList<>();
	    ArrayList<Integer> losersList = new ArrayList<>();
	    HashMap<Integer, Integer> winnerHashMap = new HashMap<>();
	    HashMap<Integer, Integer> LoserHashMap = new HashMap<>();
	    
	    for (int i = 0; i < matches.length; i++) {
			int winner = matches[i][0];
			int loser  = matches[i][1];
			if (!winnerHashMap.containsKey(winner))
				winnerHashMap.put(winner, 1);
			else {
				int value = winnerHashMap.get(winner);
				value++;
				winnerHashMap.put(winner, value);
			}
			if (!LoserHashMap.containsKey(loser))
				LoserHashMap.put(loser, 1);
			else {
				int value = LoserHashMap.get(loser);
				value++;
				LoserHashMap.put(loser, value);
			}
		}
	    System.out.println("winnerlist");
	    for(Map.Entry<Integer, Integer> e : winnerHashMap.entrySet()) {
	    	if(!LoserHashMap.containsKey(e.getKey()))
	    		winnerList.add(e.getKey());
	    }
	    System.out.println("LoserList");
	    for(Map.Entry<Integer, Integer> e : LoserHashMap.entrySet()) {
	    	if(e.getValue()==1)
	    		losersList.add(e.getKey());
	    }
	    List<List<Integer>> ans = new ArrayList<>();
	    Collections.sort(winnerList);
	    Collections.sort(losersList);
	    ans.add(winnerList);
	    ans.add(losersList);
	    return ans;
	    }
	public static void main(String[] args) {
		int [] [] arr = new int[][] {{2,3},{1,3},{5,4},{6,4}};
		System.out.println(findWinners(arr));
	}
}
