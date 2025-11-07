package kunal;

public class NumberofSeniorCitizens {
	public static int countSeniors(String[] details) {
		int ans = 0;
		for(String s : details) {
			if(Integer.parseInt(s.substring(11,13))>60)
				ans++;
		}
		return ans;
    }
	public static void main(String[] args) {
		String[] arr = {"9751302862F0693","3888560693F7262","5485983835F0649","2580974299F6042","9976672161M6561","0234451011F8013","4294552179O6482"};
		System.out.println(countSeniors(arr));
	}
}
