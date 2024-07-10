package kunal;

public class AveraeWaitinTime {
	public double averageWaitingTime(int[][] customers) {
		double total = 0;
		double t = 0;
		for(int i = 0; i < customers.length;i++) {
				double arrival = customers[i][0];
				double order = customers[i][1];
				if(t>arrival)
					total += t - arrival; 
				else
					t = arrival;
				total+=order;
				t+=order;
		}
		return (double) total/customers.length;
    }
}
