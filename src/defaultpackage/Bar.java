package defaultpackage;

public class Bar {

	private double open;
	private double high;
	private double low;
	private double close;
	private double adjC;
	private int volume;
	
	public Bar(double open, double high, double low, double close, double adjC, int volume){
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.adjC = adjC;
		this.volume = volume;
	}
	
	public Bar(String s){
		
	}
	
	public double getOpen(){
		return open;
	}
	
	public double getHigh(){
		return high;
	}
	
	public double getLow(){
		return low;
	}
	
	public double getClose(){
		return close;
	}
	
	public double getAdjC(){
		return adjC;
	}
	
	public int getVolume(){
		return volume;
	}
	
	public void setOpen(double o){
		this.open = o;
	}
	
	public void setClose(double c){
		this.close = c;
	}
	
	public void setHigh(double h){
		this.high = h;
	}
	
	public void setLow(double l){
		this.low = l;
	}
	
	public void setAdjC(double Ac){
		this.adjC = Ac;
	}
	
	public void setvolume(int v){
		this.volume = v;
	}
	
	public double range(){
		double r = high - low;
		return r;
	}
	
	
	
	
}
