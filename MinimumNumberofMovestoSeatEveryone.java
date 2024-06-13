package kunal;

import java.util.Arrays;

public class MinimumNumberofMovestoSeatEveryone {
	public int minMovesToSeat(int[] seats, int[] students) {
		Arrays.sort(seats);
		Arrays.sort(students);
		int moves = 0;
		for(int i = 0; i < seats.length ; i++) {
			moves+=Math.abs(students[i] - seats[i]);
		}
		return moves;
    }
	public static void main(String[] args) {
		MinimumNumberofMovestoSeatEveryone obj = new MinimumNumberofMovestoSeatEveryone();
		int[] arr1 = {4,1,5,9};
		int[] arr2 = {1,3,2,6};
		System.out.println(obj.minMovesToSeat(arr1, arr2));
	}
}
