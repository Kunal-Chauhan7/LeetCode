package kunal;

import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO {
	class Pair{
		int captial;
		int profit;
		Pair(int profit , int capital){
			this.captial = capital;
			this.profit = profit;
		}
	}
	public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
		PriorityQueue<Pair>minheap = new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return Integer.compare(o1.captial, o2.captial);
			}
		});
		PriorityQueue<Pair>maxheap = new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return -Integer.compare(o1.profit, o2.profit);
			}
		});
		for (int i = 0; i < capital.length; i++) {
			minheap.add(new Pair(profits[i], capital[i]));
		}
		while(k>0) {
			if(!minheap.isEmpty()&&minheap.peek().captial<=w){
				maxheap.add(minheap.remove());
			}
			if(maxheap.isEmpty()) {
				break;
			}
			w+=maxheap.remove().profit;
			k--;
		}
		return w;
    }
}
