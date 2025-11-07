package kunal;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int[] newFlowerBed = new int[flowerbed.length+2];
		newFlowerBed[0] = 0;
		newFlowerBed[newFlowerBed.length-1] = 0;
		int j = 1;
		for(int i : flowerbed) {
			newFlowerBed[j] = i;
			j++;
		}
		for(int i = 1 ; i<newFlowerBed.length-1;i++) {
			if(newFlowerBed[i]==0&&newFlowerBed[i-1]==0&&newFlowerBed[i+1]==0) {
				newFlowerBed[i] = 1;
				n--;
			}
		}
		return n<=0;
    }
}
