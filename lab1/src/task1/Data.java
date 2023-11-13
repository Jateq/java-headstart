package task1;

public class Data {
	private int count;
	private double sum;
	private double max;
	
	public Data() {
		
	}
	
	public void addValue(double value) {
		count++;
		sum += value;
		max = Math.max(max, value);
	}
	
	public double getAvg() {
		if(count == 0) return 0;
		return sum/count;
	}
	
	public double getMax() {
		return max;
	}
	
	
	
	
}
