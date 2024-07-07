package kunal;

public class WaterBottles {
	public static int numWaterBottles(int numBottles, int numExchange) {
	    int totalBottles = 0;
	    int empty = 0;
	    while (numBottles > 0) {
	        totalBottles += numBottles;
	        empty += numBottles;
	        numBottles = empty / numExchange; 
	        empty = empty % numExchange;
	    }   
	    return totalBottles;
	}

	public static void main(String[] args) {
		System.out.println(numWaterBottles(15, 4));
	}
}
